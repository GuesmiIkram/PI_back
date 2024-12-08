package com.example.back.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.SequenceGenerator;

@Entity
public class Proprietaire {
  
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proprietaire_seq_gen")
    @SequenceGenerator(name = "proprietaire_seq_gen", sequenceName = "proprietaire_seq", allocationSize = 1)
    private Long id;

    private String nom;
    private String email;
    @Column(unique = true)
    private String telephone;
    private String password;

    

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
 
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
}

