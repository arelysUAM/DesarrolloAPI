package ni.edu.uam.autorLibro.controllers;

import ni.edu.uam.autorLibro.model.Libro;
import ni.edu.uam.autorLibro.servicios.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar libros.
 * Proporciona endpoints para operaciones CRUD sobre libros.
 */
@RestController
@RequestMapping("/api/libros")
public class LibroController {
    private final LibroService libroService;

    /**
     * Constructor con inyección de dependencia del servicio.
     *
     * @param libroService Servicio de libros
     */
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    /**
     * Obtiene la lista de todos los libros.
     *
     * @return Lista de libros
     */
    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.getAllLibros();
    }

    /**
     * Obtiene un libro específico por su ID.
     *
     * @param id Identificador del libro
     * @return El libro encontrado
     */
    @GetMapping("/{id}")
    public Libro getLibroById(@PathVariable Long id) {
        return libroService.getLibroById(id);
    }

    /**
     * Crea un nuevo libro.
     * El libro debe tener un autor asociado.
     *
     * @param libro Datos del libro a crear
     * @return El libro creado con su ID generado
     */
    @PostMapping
    public Libro saveLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    /**
     * Actualiza un libro existente.
     *
     * @param id Identificador del libro a actualizar
     * @param libro Nuevos datos del libro
     * @return El libro actualizado
     */
    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroService.saveLibro(libro);
    }

    /**
     * Elimina un libro por su ID.
     *
     * @param id Identificador del libro a eliminar
     */
    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroService.deleteLibro(id);
    }
}

