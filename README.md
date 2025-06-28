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

### 1. Configuración Inicial
```bash
git clone https://github.com/tu-usuario/prestaLibro.git
cd prestaLibro

2. Base de Datos
sql
```bash
CREATE DATABASE presta_libros CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

3. Configuración

Editar src/main/resources/application.properties:
properties

spring.datasource.url=jdbc:mysql://localhost:3306/presta_libros?useSSL=false
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

4. Ejecución
bash

mvn spring-boot:run

Acceder al sistema en:
http://localhost:8080
