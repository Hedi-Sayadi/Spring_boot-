package com.example.demo.Produits.service;

import com.example.demo.Produits.Produit;

import java.util.List;


public interface ProduitService {
    Produit saveProduit (Produit p);
    Produit updateProduit (Produit p );
    void deleteProduit (Produit p);
    void deleteProduitById (Long id);
    Produit getProduit (Long id) ;
    List<Produit> getAllProduits();
}
