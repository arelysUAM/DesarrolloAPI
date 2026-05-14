# API REST de Autores y Libros

Proyecto desarrollado con Spring Boot para la gestión de autores y libros mediante una API REST. La aplicación permite realizar operaciones CRUD, es decir, crear, consultar, actualizar y eliminar registros desde Postman.

## Descripción del proyecto

El sistema permite administrar autores y libros relacionados entre sí. Un autor puede tener uno o varios libros asociados, y cada libro pertenece a un autor específico.

La API fue construida como una práctica académica para demostrar el uso de endpoints REST, persistencia de datos con JPA/Hibernate y conexión a una base de datos PostgreSQL.

## Tecnologías utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Postman
- Lombok

## Entidades principales

### Autor

Representa a un escritor registrado en el sistema.

Campos principales:

- id
- nombres
- apellidos
- editorial
- libros

### Libro

Representa una obra literaria asociada a un autor.

Campos principales:

- id
- titulo
- genero
- anioPublicacion
- autor

## Ejemplo para crear un autor

Método:

```http
POST http://localhost:8080/api/autores
