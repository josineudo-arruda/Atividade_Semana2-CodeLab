package br.com.xavecoding.regescweb.repositories;

import br.com.xavecoding.regescweb.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
