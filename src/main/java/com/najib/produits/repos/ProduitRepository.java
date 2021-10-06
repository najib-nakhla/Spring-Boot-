package com.najib.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.najib.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
