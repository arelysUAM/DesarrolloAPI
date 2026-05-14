package ni.edu.uam.autorLibro.controllers;

import ni.edu.uam.autorLibro.model.Autor;
import ni.edu.uam.autorLibro.servicios.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar autores.
 * Proporciona endpoints para operaciones CRUD sobre autores.
 */
@RestController
@RequestMapping("/api/autores")
public class AutorController {
    private final AutorService autorService;

    /**
     * Constructor con inyección de dependencia del servicio.
     *
     * @param autorService Servicio de autores
     */
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    /**
     * Obtiene la lista de todos los autores.
     *
     * @return Lista de autores
     */
    @GetMapping
    public List<Autor> getAllAutores() {
        return autorService.getAllAutores();
    }

    /**
     * Obtiene un autor específico por su ID.
     *
     * @param id Identificador del autor
     * @return El autor encontrado
     */
    @GetMapping("/{id}")
    public Autor getAutorById(@PathVariable Long id) {
        return autorService.getAutorById(id);
    }

    /**
     * Crea un nuevo autor.
     *
     * @param autor Datos del autor a crear
     * @return El autor creado con su ID generado
     */
    @PostMapping
    public Autor saveAutor(@RequestBody Autor autor) {
        return autorService.saveAutor(autor);
    }

    /**
     * Actualiza un autor existente.
     *
     * @param id Identificador del autor a actualizar
     * @param autor Nuevos datos del autor
     * @return El autor actualizado
     */
    @PutMapping("/{id}")
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        autor.setId(id);
        return autorService.saveAutor(autor);
    }

    /**
     * Elimina un autor por su ID.
     * Nota: Esto eliminará también todos los libros asociados al autor.
     *
     * @param id Identificador del autor a eliminar
     */
    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
    }
}

