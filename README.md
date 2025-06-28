# Sistema de Gestión de Biblioteca - PrestaLibro

Un sistema completo para gestión de préstamos bibliotecarios desarrollado con Spring Boot.

##  Características

### Módulos Principales
- **Gestión de Libros**
  - CRUD completo
  - Búsqueda por título/autor
  - Control de disponibilidad
- **Gestión de Usuarios**
  - Registro de socios
  - Historial de préstamos
- **Sistema de Préstamos**
  - Registro de préstamos/devoluciones
  - Notificaciones de vencimientos

### Tecnologías Clave
| Área          | Tecnologías                     |
|---------------|---------------------------------|
| Backend       | Spring Boot y Spring Data JPA|
| Base de Datos | MySQL                           |
| Frontend      | Thymeleaf y Bootstrap           |
| Seguridad     | Spring Validation               |

## Requisitos Técnicos

- **Java**: JDK 21.0.7
- **MySQL**: 5.7.24
- **Maven**: 4
- **RAM**: Mínimo 2GB recomendado

## Instalación

### 1. Creacio de Base de Datos

sql
```bash
CREATE DATABASE presta_libros CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

### 2. Configuración

Editar src/main/resources/application.properties:
properties

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/presta_libros?useSSL=false
spring.datasource.username= <tu_usuario>
spring.datasource.password= <tu_contraseña>
```

### 3. Ejecutar

```bash
mvn spring-boot:run
```
### 4. Acceder al sistema en:
http://localhost:8080
