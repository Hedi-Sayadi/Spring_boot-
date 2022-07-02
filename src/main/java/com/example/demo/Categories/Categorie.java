package com.example.demo.Categories;
import com.example.demo.Produits.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="Categories")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "Nom_Categorie")
    private String nom;

    @Column(name = "Date_Creation")
    private String date_Creation;

    @Column(name = "Date_modif")
    private String date_modif;
    private double qte ;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits ;



}
