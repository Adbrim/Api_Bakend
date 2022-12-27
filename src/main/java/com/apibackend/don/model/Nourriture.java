package com.apibackend.don.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("Nourriture")
public class Nourriture extends Don{
    private Date dateExpiration;

    public Nourriture() {
    }

    public Nourriture(long id, String titreAnnonce, String description, String adresse, String photo, String status, Date dateCreate) {
        super(id, titreAnnonce, description, adresse, photo, status, dateCreate);
    }

    public Nourriture(long id, String titreAnnonce, String description, String adresse, String photo, String status, Date dateCreate, User user, Date dateExpiration) {
        super(id, titreAnnonce, description, adresse, photo, status, dateCreate, user);
        this.dateExpiration = dateExpiration;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
