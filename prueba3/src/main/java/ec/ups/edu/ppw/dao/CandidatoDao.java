package ec.ups.edu.ppw.dao;

import java.util.ArrayList;
import java.util.List;
import ec.ups.edu.ppw.prueba3.Candidatos;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CandidatoDao {
    
    private static final List<Candidatos> candidatos = new ArrayList<>();

    static {
        candidatos.add(new Candidatos("Juan Ordoñez", "Juan Pérez"));
        candidatos.add(new Candidatos("Enner Valencia", "María López"));
        candidatos.add(new Candidatos("Gonzalo Plata", "Carlos Gómez"));
    }

    public void insert(Candidatos candidato) {
        candidatos.add(candidato);
    }

    public List<Candidatos> getList() {
        return new ArrayList<>(candidatos);
    }
}
