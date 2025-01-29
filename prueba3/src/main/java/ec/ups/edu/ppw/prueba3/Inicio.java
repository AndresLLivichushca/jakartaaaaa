package ec.ups.edu.ppw.prueba3;

import java.util.List;

import ec.ups.edu.ppw.dao.CandidatoDao;
import ec.ups.edu.ppw.prueba3.Candidatos;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

    @Inject
    private CandidatoDao candidatosDAO;  // 

    @PostConstruct
    public void init() {
        System.out.println("Iniciando EJB con CandidatosDao...");

        
        Candidatos candidatos = new Candidatos();
        candidatos.setNombre("Juan");
        candidatos.setNombre("Hugo");
        

        candidatosDAO.insert(candidatos); // Llama al método insert del DAO


       
        // Eliminar una tarifa
        /*int idEliminar = 1; // ID a eliminar
        tarifaDAO.delete(idEliminar);
        System.out.println("Tarifa con ID: " + idEliminar + " eliminada.");
        */
    }
}