package com.universe.service;

import com.universe.model.Person;
import com.universe.domain.repository.PersonRepository;
import com.universe.domain.repository.impl.InMemoryPersonRepository;
import java.util.List;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/persons")
@Singleton
public class PersonRestService {

    private PersonRepository personRepository = new InMemoryPersonRepository() {};   

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll() {
        return this.personRepository.getAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person find(@PathParam("id") String id) {
        return this.personRepository.get(id);
    }
    
    @GET
    @Path("findByName/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> findByTitle(@PathParam("name") String name) {
        return this.personRepository.findByName(name);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Person p) {
        this.personRepository.add(p);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(Person p) {
        this.personRepository.update(p);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        this.personRepository.delete(id);
    }
}
