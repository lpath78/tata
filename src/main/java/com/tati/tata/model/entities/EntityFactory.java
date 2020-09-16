package com.tati.tata.model.entities;

import com.tati.tata.model.exception.ConstructionException;
import com.tati.tata.model.references.TypeMenu;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class EntityFactory {

    public static Client fabriquerClient (String nomPrenom, String prenom, String email, String password, String pseudo){
        Client newClient = new Client();
        try {
            newClient.setNomClient(nomPrenom);
            newClient.setPrenom(prenom);
            newClient.setEmail(email);
            newClient.setPassword(password);
            newClient.setPseudo(pseudo);
        } catch (Exception e){
            throw new ConstructionException(e);
        }
        return newClient;
    }

    public static Menu fabriquerMenu (TypeMenu typeMenu, Burger burger, Soda soda, Accompagnement accompagnement, Sauce sauce) {
        Menu newMenu = new Menu();
        try {
            newMenu.setTypeMenu(typeMenu);
            newMenu.setBurger(burger);
            newMenu.setSoda(soda);
            newMenu.setAccompagnement(accompagnement);
            newMenu.setSauce(sauce);
        }catch (Exception e){
            throw new ConstructionException(e);
        }
        return newMenu;
    }

    public static Sauce fabriquerSauce (int nombreDeSauce, String nom, BigDecimal prix) {
        Sauce newSauce = new Sauce();
        try {
            newSauce.setNombreDeSauce(nombreDeSauce);
            newSauce.setNom(nom);
            newSauce.setPrix(prix);
        }catch (Exception e){
            throw new ConstructionException(e);
        }
        return newSauce;
    }
    public static Soda farbiqueSoda (String nom, BigDecimal prix){
        Soda newSoda = new Soda();
        try {
            newSoda.setNom(nom);
            newSoda.setPrix(prix);
        }catch (Exception e){
            throw new ConstructionException(e);
        }
        return newSoda;
    }
    public static Burger fabriquerBurger (String nom, BigDecimal prix){
        Burger newBurger = new Burger();
        try {
            newBurger.setNom(nom);
            newBurger.setPrix(prix);
        }catch (Exception e){
            throw new ConstructionException(e);
        }
        return newBurger;
    }
    public static Commande fabriquerCommande (Client client, LocalDate date, Menu menu){
        Commande newCommande = new Commande();
        try {
            newCommande.setClient(client);
            newCommande.setDateCommande(date);
            newCommande.setToutLesMenus((List<Menu>) menu);
        }catch (Exception e){
            throw new ConstructionException(e);
        }
        return newCommande;
    }
}
