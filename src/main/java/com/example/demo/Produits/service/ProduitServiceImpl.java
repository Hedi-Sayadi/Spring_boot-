package com.example.demo.Produits.service;

import com.example.demo.Produits.Produit;
import com.example.demo.Produits.ProduitRepo;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.desktop.SystemSleepEvent;
import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    ProduitRepo produitRepository ;
    @Override
    public Produit saveProduit(Produit p) {
        return (Produit) produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p  ) {
        /*Optional <Produit> produitOptional = produitRepository.findById(id) ;
        if  (produitOptional.isPresent()){
            if((p.getQte() != 0) && (p.isDisponible()== false) && (p.getDate_modif() != "")) {
        p.setQte();
         p.setDisponible();
          p.setDate_modif();
          return p ;

        }

         }
         else {
         System.out.print(("there is no product with this id"));
          return null ;
        }*/

        return (Produit) produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit getProduit(Long id) {
        return (Produit) produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
