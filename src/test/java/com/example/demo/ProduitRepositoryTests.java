/*package com.example.demo;

import com.example.demo.Produits.Produit;
import com.example.demo.Produits.ProduitRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
import java.util.Optional;

@DataJpaTest //désactive la configuration automatique complète et applique uniquement la configuration pertinente pour les tests JPA
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class ProduitRepositoryTests {
    @Autowired
private ProduitRepo produitRepository ;
    //Junit test for save produit
    @Test
    @Order(1)
   // @Rollback(value = false)
    public void saveProduitTest (){
        Produit produit = Produit.builder()
                .nom("produit1")
                .date_Creation("04/04/2003")
                .date_modif("04/04/2004")
                .qte(20.0)
                .disponible(true)
                .build(); //call build method and create the object produit
        produitRepository.save(produit) ; //save produit1 to the database car l'annotation @Autowired avant le produitrepo
        Assertions.assertThat(produit.getId()).isGreaterThan(0) ;



    }
    @Test
    @Order(2)
    public void getProduitTest(){

        Produit produit = produitRepository.findById(1L).get(); // on ajoute .get car c'est une methode applique a un optionnel qui est retourné par la fonction findByid
        Assertions.assertThat(produit.getId()).isEqualTo(1L) ;
    }
   @Test
    @Order(3)
    public void getListOfProduitsTest(){
        List <Produit> produits = produitRepository.findAll();
        Assertions.assertThat(produits.size()).isGreaterThan(0);
    }
    @Test
    @Order(4)
    //@Rollback(value = false)
    public void updateProduitTest(){
        Produit produit = produitRepository.getById(1L);
        produit.setQte(100.0);
        Produit produitUpdated =produitRepository.save(produit);
        Assertions.assertThat(produitUpdated.getQte()).isEqualTo(100.0);
    }
    @Test
    @Order(5)
    @Rollback(value = false)
    public void deleteProduitTest(){
        //Produit produit = produitRepository.getById(1L);
        //produitRepository.delete(produit);
        produitRepository.deleteById(1L);

        Produit produit1=null ;
        Optional <Produit> optionalProduit = produitRepository.findById(1L) ;
        if (optionalProduit.isPresent()) {
            produit1 = optionalProduit.get() ;

        }
        Assertions.assertThat(produit1).isNull();
    }


}*/
