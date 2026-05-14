package ni.edu.uam.autorLibro.servicios;

import ni.edu.uam.autorLibro.model.Libro;
import ni.edu.uam.autorLibro.repositories.LibroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para la gestión de Libros.
 * Proporciona métodos de negocio para operar con libros.
 *
 */
@Service
public class LibroService {
    private final LibroRepo libroRepo;

    public LibroService(LibroRepo libroRepo) {
        this.libroRepo = libroRepo;
    }

    /**
     * Obtiene la lista de todos los libros.
     *
     * @return Lista de todos los libros registrados
     */
    public List<Libro> getAllLibros() {
        return libroRepo.findAll();
    }

    /**
     * Obtiene un libro específico por su ID.
     *
     * @param id El identificador del libro
     * @return El libro encontrado o null si no existe
     */
    public Libro getLibroById(Long id) {
        return libroRepo.findById(id).orElse(null);
    }

    /**
     * Guarda o actualiza un libro.
     *
     * @param libro El libro a guardar
     * @return El libro guardado con su ID generado
     */
    public Libro saveLibro(Libro libro) {
        return libroRepo.save(libro);
    }

    /**
     * Elimina un libro por su ID.
     *
     * @param id El identificador del libro a eliminar
     */
    public void deleteLibro(Long id) {
        libroRepo.deleteById(id);
    }
}

