package ni.edu.uam.autorLibro.repositories;

import ni.edu.uam.autorLibro.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Libro.
 * Proporciona métodos CRUD básicos para gestionar libros en la base de datos.
 */
@Repository
public interface LibroRepo extends JpaRepository<Libro, Long> {
}

