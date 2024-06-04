package br.com.rafaelsilveiradev.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rafaelsilveiradev.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long>{
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);
}
