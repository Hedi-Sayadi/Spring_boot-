package com.example.demo;
import com.example.demo.Categories.Categorie;
import com.example.demo.Categories.CategorieRepository;
import com.example.demo.Categories.service.CategorieService;
import com.example.demo.Produits.Produit;
import com.example.demo.Produits.ProduitRepo;
import com.example.demo.Produits.service.ProduitService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
final
class DemoApplicationTests {
	//@MockBean//pour ne pas migrer l'exemple vers la base de données
	@Autowired //si on peut verser vers la base de données
	private ProduitRepo produitrepository;
	@Autowired
	private CategorieRepository categorierepository ;
	@Autowired
	private ProduitService produitservice;
	@Autowired
	private CategorieService categorieservice ;
	Produit prod;
	Categorie categ;

	@BeforeEach
	public void init() {
		var produits = new ArrayList<Produit>();
		var categorie = new Categorie();
		this.prod = new Produit(1L, "dkj", "kg", "gkuhk", 2.0, true, null);
		this.categ = new Categorie(1L, "dkj", "kg", "gkuhk", 2.0, null);
	}
/*@AfterAll
public void effaceraprestest() {
		this.prod=null;
		this.categ=null;
}*/

@Order(1)
	@Test
	public void saveProduitTest() {
		produitrepository.save(this.prod);
	}

	@Test
	@Order(2)
	public void getproduitByidTest() {
		Optional<Produit> produit = produitrepository.findById(3L);
		if (produit.isPresent()) {
			System.out.println(produit);
		} else {
			System.out.println("produit n'existe pas");
		}

	}
	@Test
	@Order(3)
	public void getAllproduits(){
		List <Produit> produits = produitrepository.findAll();
		System.out.println(produits);
	}

@Test
@Order(4)
	public void updateProduitTest(){
		Produit produit = produitrepository.findById(4L).get();
		produit.setQte(100.0);
		Produit produitUpdated =produitrepository.save(produit);
		Assertions.assertThat(produitUpdated.getQte()).isEqualTo(100.0);
	}

	@Test
	@Order(5)
	public void deleteProduitTest(){

		try{
			produitrepository.deleteById(2L);
		}catch (Exception e){
			System.out.println("this product does not exist");
		}

	}

	@Order(6)
	@Test
	public void saveCategorieTest() {
		categorierepository.save(this.categ);
	}

	@Test
	@Order(7)
	public void getcategorieByidTest() {
		Optional<Categorie> categorie = categorierepository.findById(1L);
		if (categorie.isPresent()) {
			System.out.println(categorie);
		} else {
			System.out.println("categorie n'existe pas");
		}

	}

	@Test
	@Order(8)
	public void getAllcategories(){
		try{
			List <Categorie> categories = categorierepository.findAll();
		}catch (Exception e){

		e.printStackTrace();
	}
}

	@Test
	@Order(9)
	public void updatecategorieTest(){
		Categorie categorie = categorierepository.findById(3L).get();
		categorie.setQte(100.0);
		Categorie categorieUpdated =categorierepository.save(categorie);
		Assertions.assertThat(categorieUpdated.getQte()).isEqualTo(100.0);
	}

	@Test
	@Order(10)
	public void deletecategorieTest(){
		try{
			categorierepository.deleteById(1L);
		}catch (Exception e){
			System.out.println("this categorie does not exist");
		}

	}


}