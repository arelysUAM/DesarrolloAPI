package ni.edu.uam.autorLibro.repositories;

import ni.edu.uam.autorLibro.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Autor.
 * Proporciona métodos CRUD básicos para gestionar autores en la base de datos.
 */
@Repository
public interface AutorRepo extends JpaRepository<Autor, Long> {
}

