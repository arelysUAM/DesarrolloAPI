package ni.edu.uam.autorLibro.servicios;

import ni.edu.uam.autorLibro.model.Autor;
import ni.edu.uam.autorLibro.repositories.AutorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para la gestión de Autores.
 * Proporciona métodos de negocio para operar con autores.
 *
 * @author Sistema de Gestión de Libros
 * @version 1.0
 */
@Service
public class AutorService {
    private final AutorRepo autorRepo;

    /**
     * Constructor con inyección de dependencia del repositorio.
     *
     * @param autorRepo Repositorio de autores
     */
    public AutorService(AutorRepo autorRepo) {
        this.autorRepo = autorRepo;
    }

    /**
     * Obtiene la lista de todos los autores.
     *
     * @return Lista de todos los autores registrados
     */
    public List<Autor> getAllAutores() {
        return autorRepo.findAll();
    }

    /**
     * Obtiene un autor específico por su ID.
     *
     * @param id El identificador del autor
     * @return El autor encontrado o null si no existe
     */
    public Autor getAutorById(Long id) {
        return autorRepo.findById(id).orElse(null);
    }

    /**
     * Guarda o actualiza un autor.
     *
     * @param autor El autor a guardar
     * @return El autor guardado con su ID generado
     */
    public Autor saveAutor(Autor autor) {
        return autorRepo.save(autor);
    }

    /**
     * Elimina un autor por su ID.
     * Nota: Esto también eliminará todos sus libros asociados (cascade delete).
     *
     * @param id El identificador del autor a eliminar
     */
    public void deleteAutor(Long id) {
        autorRepo.deleteById(id);
    }
}

