package com.example.demo.Categories.service;

import com.example.demo.Categories.Categorie;
import com.example.demo.Categories.CategorieRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieServiceImpl implements CategorieService {
@Autowired
CategorieRepository categorieRespository ;
    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieRespository.save(c);
    }

    @Override
    public Categorie updateCategorie(Categorie c) {
        return categorieRespository.save(c);
    }

    @Override
    public void deleteCategorie(Categorie c) {
              categorieRespository.delete(c);
    }

    @Override
    public void deleteCategorieById(Long id) {
        categorieRespository.deleteById(id);
    }

    @Override
    public Categorie getCategorie(Long id) {
        return (Categorie) categorieRespository.findById(id).get();
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRespository.findAll();
    }
}
