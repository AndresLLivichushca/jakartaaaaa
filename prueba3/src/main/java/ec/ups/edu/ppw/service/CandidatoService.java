package ec.ups.edu.ppw.service;

import java.util.List;
import ec.ups.edu.ppw.dao.CandidatoDao;
import ec.ups.edu.ppw.prueba3.Candidatos;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/candidatos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidatoService {

    @Inject
    private CandidatoDao candidatosDAO;

    @POST
    public Response agregarCandidato(Candidatos candidato) {
        if (candidato == null || candidato.getNombre().isEmpty() || candidato.getBinomio().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Los datos del candidato no pueden estar vacíos.").build();
        }
        candidatosDAO.insert(candidato);
        return Response.ok(candidato).build();
    }

    @GET
    @Path("/list")
    public Response listarCandidatos() {
        List<Candidatos> lista = candidatosDAO.getList();
        return Response.ok(lista).build();
    }
}
