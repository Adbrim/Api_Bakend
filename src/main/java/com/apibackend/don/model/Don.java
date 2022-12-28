package com.apibackend.don.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Don {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "titre_annonce")
    @JsonProperty("titreAnnonce")
    private String titreAnnonce;
    private String description;
    private String adresse;
    private String photo;
    private String status;
    private Date dateCreate = new Date();
    @Column(name = "date_expiration")
    @JsonProperty("dateExpiration")
    private Date dateExpiration;
    private String etat;
    private String type;
    @Column(name = "user_id")
    @JsonProperty("userId")
    private Long user_id;

    public Don() {
    }

    public Don(String titreAnnonce, String description, String adresse, String photo, String status, Date dateExpiration, String etat, String type, Long user_id) {
        this.titreAnnonce = titreAnnonce;
        this.description = description;
        this.adresse = adresse;
        this.photo = photo;
        this.status = status;
        this.dateExpiration = dateExpiration;
        this.etat = etat;
        this.type = type;
        this.user_id = user_id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
