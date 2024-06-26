# CRUD Refugio de animales
## Objetivos
- Crear un sistema de ABMC (CRUD) para un nuevo refugio.
- Se pueden crear nuevos animales, modificar su nombre, edad o color y eliminarlos.
- Proveer un sistema con criterios de búsqueda (por nombre, por id-animal y filtrar por color, por edad mayor o menor que).

## Interfaz del front-end
- Los colores se envian como String (cadena de caracteres)
- El front-end necesita contar con una lista de posibles colores.
- El buscador del front no conoce todos los endpoints del back-end.

## Base de datos (BBDD)
    Tabla animales.
    Columnas: id_columna, nombre, edad, color.

## Entidad en java 
    Animal. Mapear las columnas con atributos. Crear el bean.
    @Entity

## Repositorio en Java
    @Repository
    public interface AnimalRepo extends JpaRepository<AnimalEntity, Integer>

## Servicio en Java
    @Service AnimalService.
    Inyectamos el repo-> @Autowired de AnimalRepository

## Controlador en Java
    @Controller AnimalController
    Inyectamos el service -> @Autowired de AnimalService

### Endpoints
    GET /animales
    Lista todos los animales

    GET /animales/nombre/{nombre}
    Busca por nombres que contengan el valor (usar CONTAINING)

    GET /animales/color/{color}
    Busca por color exacto

    GET /animales/edad/{edadDesde}/{edadHasta} 			
    animales en un rango de edad (usar between en el repo)

    GET /animales/id/{id}
    Busca un animal por ID

    GET /animales/nuevo
    Muestra formulario para nuevo animal

    POST /animales/guardar
    Guarda o actualiza un nuevo animal

    DELETE /animales/id/{id}
    Elimina un animal por ID

## Dependencias utilizadas
- Spring Web
- MySQL Driver
- JPA
- Thymeleaf

*Práctica de Java backend con Spring*
