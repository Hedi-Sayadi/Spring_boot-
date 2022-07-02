package com.example.demo.Categories;

import com.example.demo.Categories.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path="api/v1/categories")
public class CategorieController {
    @Autowired
     CategorieService categorieService;

    //read operation
    @GetMapping("/Categories")

    public List<Categorie> getAllCategories() {

        return categorieService.getAllCategories();
    }
    //read by id
    @GetMapping("/readcategorie/{id}")
    public Categorie getCategorie(@PathVariable("id") Long id)
    {
        return categorieService.getCategorie(id);
    }

    //saveoperation
    @PostMapping("/saveCategorie")

    public Categorie saveCategorie(@RequestBody Categorie categorie ){
        return categorieService.saveCategorie(categorie);
    }
    //delete operation
        @PutMapping("/deletecategorie/{id}")
    public String deletecategorie(@PathVariable("id") Long id ){
        categorieService.deleteCategorieById(id);
        return "Deleted Successfully";
    }
    //delete operation
    @PutMapping("/deletecategorie")
    public void deletecategorie(Categorie categorie ){
        categorieService.deleteCategorie(categorie);
    }
    //update operation
        @PutMapping("/updatecategorie")

    public Categorie updateProduit(@RequestBody Categorie categorie ){
        return categorieService.updateCategorie(categorie);
    }
    
    
}

