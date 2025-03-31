package com.iticbcn.webapp.mywebapp.Services;

import java.util.Optional;
import java.util.Set;

import com.iticbcn.webapp.mywebapp.Model.Llibre;

public interface LlibreService {
    
    Set<Llibre> findAll();

    Llibre findByTitol(String titol);

    Set<Llibre> findByTitolAndEditorial(String titol, String editorial);

    Optional<Llibre> findByIdLlibre(int idLlibre);

    boolean validarISBN(String isbn);
}