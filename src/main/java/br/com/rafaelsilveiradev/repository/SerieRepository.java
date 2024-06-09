package br.com.rafaelsilveiradev.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rafaelsilveiradev.model.Serie;
import br.com.rafaelsilveiradev.model.Categoria;
public interface SerieRepository extends JpaRepository<Serie, Long>{
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, Double avaliacao);

    List<Serie> findTop5ByOrderByAvaliacaoDesc();

    List<Serie> findByGenero(Categoria categoria);

    List<Serie> findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(int qtdTemporada, Double avaliacao);
}
