package ni.edu.uam.autorLibro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entidad Libro que representa una obra literaria en el sistema.
 * Almacena los datos básicos del libro y su relación con el autor que lo escribió.
 *
 */
@Entity
@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    /**
     * Identificador único del libro.
     * Se genera automáticamente en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Título del libro.
     * Campo obligatorio, único en la base de datos, máximo 100 caracteres.
     */
    @Column(name = "titulo_libro", nullable = false, unique = true, length = 100)
    private String titulo;

    /**
     * Género literario del libro.
     * Por ejemplo: Ficción, Drama, Romance, Ciencia Ficción, etc.
     * Campo obligatorio, único en la base de datos, máximo 100 caracteres.
     */
    @Column(name = "genero_libro", nullable = false, unique = false, length = 100)
    private String genero;

    /**
     * Año de publicación del libro.
     * Campo obligatorio que almacena el año en formato numérico.
     */
    @Column(name = "anioPublicacion_libro", nullable = false)
    private int anioPublicacion;

    /**
     * Autor del libro.
     * Relación muchos a uno: múltiples libros pertenecen a un autor.
     * Se carga automáticamente junto con el libro (fetch EAGER).
     */
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;
}
