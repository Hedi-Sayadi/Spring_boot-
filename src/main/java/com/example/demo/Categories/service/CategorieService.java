package com.example.demo.Categories.service;

import com.example.demo.Categories.Categorie;
import com.example.demo.Produits.Produit;

import java.util.List;

public interface CategorieService {
    Categorie saveCategorie (Categorie c);
    Categorie updateCategorie (Categorie c);
    void deleteCategorie (Categorie c );
    void deleteCategorieById (Long id);
    Categorie getCategorie (Long id) ;
    List<Categorie> getAllCategories();
    //ici je cree l'interface et puis je passe a l'implementation c'est le  bon pratique .


}
