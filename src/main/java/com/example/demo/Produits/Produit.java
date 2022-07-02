package com.example.demo.Produits;

import com.example.demo.Categories.Categorie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
    @Builder //this builder annotation is used by lombok to create an object (product) au lieu de faire Produit produit = new Peoduit( );
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="Produits")

    public class Produit {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id ;
        @Column(name = "Nom_Produit")
        private String nom;

        @Column(name = "Date_Creation")
        private String date_Creation;

        @Column(name = "Date_modif")
        private String date_modif; //variable
        private double qte ; //variable
        private boolean disponible ; //variable
        @ManyToOne
        private  Categorie categorie ; //on met ici categorie car il faut avoir le meme nom que celui en mappedBy





    }


