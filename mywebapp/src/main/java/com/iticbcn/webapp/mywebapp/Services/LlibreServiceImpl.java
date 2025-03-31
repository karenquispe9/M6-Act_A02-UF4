package com.iticbcn.webapp.mywebapp.Services;

import com.iticbcn.webapp.mywebapp.Model.Llibre;
import com.iticbcn.webapp.mywebapp.repository.LlibreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class LlibreServiceImpl implements LlibreService {

    private final LlibreRepository llibreRepository;

    @Autowired
    public LlibreServiceImpl(LlibreRepository llibreRepository) {
        this.llibreRepository = llibreRepository;
    }

    @Override
    public Set<Llibre> findAll() {
        return llibreRepository.findAll();
    }

    @Override
    public Llibre findByTitol(String titol) {
        return llibreRepository.findByTitol(titol);
    }

    @Override
    public Set<Llibre> findByTitolAndEditorial(String titol, String editorial) {
        return llibreRepository.findByTitolAndEditorial(titol, editorial);
    }

    @Override
    public Optional<Llibre> findByIdLlibre(int idLlibre) {
        return llibreRepository.findById(idLlibre);
    }

    @Override
    public boolean validarISBN(String isbn) {
        return isbn != null && isbn.matches("\\d{3}-\\d{10}");
    }
}
