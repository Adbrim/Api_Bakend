package com.apibackend.don.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("Objet")
public class Objet extends Don{
    private String etat;

    public Objet() {
    }

    public Objet(long id, String titreAnnonce, String description, String adresse, String photo, String status, Date dateCreate, String etat) {
        super(id, titreAnnonce, description, adresse, photo, status, dateCreate);
        this.etat = etat;
    }

    public Objet(long id, String titreAnnonce, String description, String adresse, String photo, String status, Date dateCreate, User user, String etat) {
        super(id, titreAnnonce, description, adresse, photo, status, dateCreate, user);
        this.etat = etat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
