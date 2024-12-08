package com.example.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.back.Model.ReponseSurAvisProp;

@Repository
public interface ReponseSurAvisPropRepository extends JpaRepository<ReponseSurAvisProp, Long> {
    // Vous pouvez ajouter des méthodes spécifiques si nécessaire
    List<ReponseSurAvisProp> findByProprietaireId(Long proprietaireId);
    List<ReponseSurAvisProp> findByContenuAvisAndProprietaireId(String contenuAvis, Long proprietaireId);

}