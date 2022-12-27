package com.apibackend.don.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeDon", discriminatorType = DiscriminatorType.STRING)
public class Don {
    @Id
    @GeneratedValue
    private long id;
    private String titreAnnonce;
    private String description;
    private String adresse;
    private String photo;
    private String status;
    private Date dateCreate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Don() {
    }

    public Don(long id, String titreAnnonce, String description, String adresse, String photo, String status, Date dateCreate) {
        this.id = id;
        this.titreAnnonce = titreAnnonce;
        this.description = description;
        this.adresse = adresse;
        this.photo = photo;
        this.status = status;
        this.dateCreate = new Date();
    }

    public Don(long id, String titreAnnonce, String description, String adresse, String photo, String status, Date dateCreate, User user) {
        this.id = id;
        this.titreAnnonce = titreAnnonce;
        this.description = description;
        this.adresse = adresse;
        this.photo = photo;
        this.status = status;
        this.dateCreate =  new Date();
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitreAnnonce() {
        return titreAnnonce;
    }

    public void setTitreAnnonce(String titreAnnonce) {
        this.titreAnnonce = titreAnnonce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
