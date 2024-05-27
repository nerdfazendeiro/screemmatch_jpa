package br.com.rafaelsilveiradev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rafaelsilveiradev.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long>{
}
