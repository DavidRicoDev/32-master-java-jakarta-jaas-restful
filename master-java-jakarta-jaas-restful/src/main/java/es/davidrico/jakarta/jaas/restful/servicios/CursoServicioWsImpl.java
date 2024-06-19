package es.davidrico.jakarta.jaas.restful.servicios;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import es.davidrico.jakarta.jaas.restful.modelos.Curso;
import es.davidrico.jakarta.jaas.restful.repositorios.CursoRepository;

import java.util.List;

@DeclareRoles({"USER", "ADMIN"})
@Stateless
@WebService(endpointInterface = "org.aguzman.webapp.jaxws.services.CursoServicioWs")
public class CursoServicioWsImpl implements CursoServicioWs {

    @Inject
    private CursoRepository repository;

    @RolesAllowed({"ADMIN", "USER"})
    @WebMethod
    @Override
    public List<Curso> listar() {
        return repository.listar();
    }

    @RolesAllowed({"ADMIN"})
    @Override
    @WebMethod
    public Curso guardar(Curso curso) {
        return repository.guardar(curso);
    }
}
