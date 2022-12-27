package com.apibackend.don.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String nomPrenom;
    private String adresse;
    private String email;
    private String motPasse;
    private Date dateCreate;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Collection<Nourriture> nourritures;

    public User() {
    }

    public User(long id, String nomPrenom, String adresse, String email, String motPasse) {
        this.id = id;
        this.nomPrenom = nomPrenom;
        this.adresse = adresse;
        this.email = email;
        this.motPasse = motPasse;
        this.dateCreate = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }
}
