package com.example.demo.Produits;

import com.example.demo.Produits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;
//annotation
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(path="api/v1/Produits")
//class
public class ProduitController {
    @Autowired
    ProduitService produitService ;

    //read operation
    @GetMapping("/Produits")
    //@RolesAllowed({"admin" , "user"})
    public List <Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    //read by id
    @GetMapping("/readproduit/{id}")
    //@RolesAllowed({"admin" , "user"})
    public Produit getProduit(@PathVariable("id") Long id)
    {
        return produitService.getProduit(id);
    }

    //saveoperation
    @PostMapping("/saveProduit")
    //@RolesAllowed({"admin" , "user"})
    public Produit saveProduit(@RequestBody Produit produit ){
        return produitService.saveProduit(produit);
    }

    //delete operation
    @PutMapping("/deleteproduit/{id}")
    public String deleteproduit(@PathVariable("id") Long id ){
        produitService.deleteProduitById(id);
        return "Deleted Successfully";
    }

    //delete operation
    @PutMapping("/deleteproduit")
    //@RolesAllowed({"admin" , "user"})
    public void deleteproduit(Produit produit ){
        produitService.deleteProduit(produit);
    }

    //update operation
    @PutMapping("/updateproduit/{id}")
    //@RolesAllowed({"admin" , "user"})
    public Produit updateProduit(@RequestBody Produit produit , @PathVariable("id") Long id ){

        return produitService.updateProduit(produit);
    }
}
