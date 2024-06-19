package es.davidrico.jakarta.jaas.restful.repositorios;

import es.davidrico.jakarta.jaas.restful.modelos.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
