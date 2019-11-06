package br.com.sada.autenticacaooauth2versaospringboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<br.com.sada.autenticacaooauth2versaospringboot1.model.Categoria, Long> {

}
