package com.example.accessingdatarest.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.accessingdatarest.entities.Usuario;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
@CrossOrigin(origins = "*")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
  List<Usuario> findByFirstNameContainsOrLastNameContains(@Param("firstName") String firstName, @Param("lastName") String lastName);
}