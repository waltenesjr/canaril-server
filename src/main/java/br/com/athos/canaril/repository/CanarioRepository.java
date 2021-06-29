package br.com.athos.canaril.repository;

import br.com.athos.canaril.model.Canario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanarioRepository extends JpaRepository<Canario, Long> {

}


