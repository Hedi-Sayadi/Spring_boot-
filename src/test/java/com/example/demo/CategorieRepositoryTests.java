/*package com.example.demo;

import com.example.demo.Categories.Categorie;
import com.example.demo.Categories.CategorieRepository;
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

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.MethodName.class)

public class CategorieRepositoryTests {
    @Autowired
    private CategorieRepository categorieRepository;
    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveCategorietTest (){
        Categorie categorie = Categorie.builder()
                .nom("categorie1")
                .date_Creation("04/04/2003")
                .date_modif("04/04/2004")
                .qte(20.0)

                .build(); //call build method and create the object categorie
        categorieRepository.save(categorie) ; //save categorie1 to the database
        Assertions.assertThat(categorie.getId()).isGreaterThan(0) ;



    }

    @Test
    @Order(2)
    public void getCategorieTest(){

        Categorie categorie = categorieRepository.findById(1L).get(); // on ajoute .get car c'est une methode applique a un optionnel qui est retourné par la fonction findByid
        Assertions.assertThat(categorie.getId()).isEqualTo(1L) ;
    }

    @Test
    @Order(3)
    public void getListOfCategoriesTest(){
        List<Categorie> categories = categorieRepository.findAll();
        Assertions.assertThat(categories.size()).isGreaterThan(0);
    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void updateCategorieTest(){
        Categorie categorie = categorieRepository.findById(1L).get();
        categorie.setQte(100.0);
       Categorie categorieUpdated =categorieRepository.save(categorie);
        Assertions.assertThat(categorieUpdated.getQte()).isEqualTo(100.0);
    }

    @Test
    @Order(5)
    @Rollback(value = false)
    public void deleteCategorieTest(){
        Categorie categorie= categorieRepository.findById(1L).get();
        categorieRepository.delete(categorie);
        //categorieRepository.deleteById(1L);

        Categorie categorie1=null ;
        Optional<Categorie> optionalCategorie = categorieRepository.findById(1L) ;
        if (optionalCategorie.isPresent()) {
            categorie1 = optionalCategorie.get() ;

        }
        Assertions.assertThat(categorie1).isNull();
    }



}*/
