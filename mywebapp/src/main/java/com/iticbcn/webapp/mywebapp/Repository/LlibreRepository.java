package com.iticbcn.webapp.mywebapp.Repository;

import com.iticbcn.webapp.mywebapp.Model.Llibre;
import org.springframework.stereotype.Repository;
import org.springframework.lang.NonNull;

import java.util.Set;
  

@Repository
public interface LlibreRepository extends CrudRepository<Llibre, Integer> {

    @Override
    @NonNull
    Set<Llibre> findAll(); // Retorna un Set en lugar de Iterable

    Llibre findByTitol(String titol); // Retorna un solo libro

    Set<Llibre> findByTitolAndEditorial(String titol, String editorial); // Retorna un conjunto de libros

}


