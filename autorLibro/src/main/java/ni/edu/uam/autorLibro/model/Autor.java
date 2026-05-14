package ni.edu.uam.autorLibro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

/**
 * Entidad Autor que representa a un escritor en el sistema.
 * Almacena información personal y profesional del autor,
 * así como la relación con los libros que ha escrito.
 */
@Entity
@Table(name = "autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
    /**
     * Identificador único del autor.
     * Se genera automáticamente en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Autor")
    private Long id;

    /**
     * Nombres del autor.
     * Campo obligatorio con máximo 60 caracteres.
     */
    @Column(name = "nombres_Autor", nullable = false, length = 60)
    private String nombres;

    /**
     * Apellidos del autor.
     * Campo obligatorio con máximo 60 caracteres.
     */
    @Column(name = "apellidos_autor", nullable = false, length = 60)
    private String apellidos;

    /**
     * Editorial principal con la que trabaja el autor.
     */
    @Column(name = "editorial_autor", nullable = false, length = 60)
    private String editorial;

    /**
     * Lista de libros escritos por el autor.
     * Relación uno a muchos: un autor puede escribir múltiples libros.
     */
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Libro> libros;
}
