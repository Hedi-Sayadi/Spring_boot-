package com.example.demo.Produits;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProduitRepo extends JpaRepository <Produit , Long> {

    Optional<Produit> findById(Long id);
}
