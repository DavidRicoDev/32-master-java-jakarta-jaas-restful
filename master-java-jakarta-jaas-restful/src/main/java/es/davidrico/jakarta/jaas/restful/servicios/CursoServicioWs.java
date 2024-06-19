package es.davidrico.jakarta.jaas.restful.servicios;

import jakarta.jws.WebService;
import es.davidrico.jakarta.jaas.restful.modelos.Curso;

import java.util.List;

@WebService
public interface CursoServicioWs {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
