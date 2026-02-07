🎬 Cineplanet – Reto Técnico FullStack

Este proyecto corresponde al reto técnico FullStack para el proceso de selección de Cineplanet.
La solución implementa una arquitectura basada en microservicios, un frontend en React y una base de datos MySQL, todo orquestado mediante Docker Compose.

🧩 Arquitectura General

El sistema está compuesto por:

Frontend: React + TypeScript

Backend: Java 17 + Spring Boot

Base de Datos: MySQL

Contenedores: Docker & Docker Compose

Microservicios Backend
Servicio	Descripción	Puerto
premieres-service	Lista de estrenos disponibles	8081
candystore-service	Productos de la dulcería	8082
complete-service	Finalización de compra	8083
📁 Estructura del Proyecto
cineplanet-reto/
│
├── premieres-service/
├── candystore-service/
├── complete-service/
│
├── frontend/
│   └── cineplanet-web/
│
├── docker-compose.yml
└── README.md


Cada microservicio es una aplicación Spring Boot independiente.

🚀 Tecnologías Utilizadas
Backend

Java 17

Spring Boot 3

Spring Web

Spring Data JPA

MySQL

Maven

Frontend

React

TypeScript

Axios

React Router DOM

Infraestructura

Docker

Docker Compose

⚙️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

Java 17

Node.js (v18+)

Docker

Docker Compose

Maven

▶️ Ejecución del Proyecto con Docker
1️⃣ Construir los JARs del backend

En cada microservicio:

mvn clean package -DskipTests

2️⃣ Levantar todo el sistema

Desde la raíz del proyecto:

docker-compose up --build


Esto levantará automáticamente:

MySQL

Los 3 microservicios backend

El frontend React

3️⃣ Acceso a la aplicación

Frontend:
👉 http://localhost:3000

APIs Backend:

Estrenos: http://localhost:8081/premieres

Dulcería: http://localhost:8082/products

Compra: POST http://localhost:8083/complete

🔄 Flujo de la Aplicación

Home
Se muestran los estrenos disponibles (consumo de premieres-service).

Login
Acceso simplificado (sin autenticación real).

Dulcería
Se listan los productos disponibles (candystore-service).

Pago
Se envía la información de compra al servicio complete-service.

Confirmación
Se retorna una respuesta exitosa de la operación.

🌐 Configuración CORS

Cada microservicio incluye una configuración global de CORS para permitir peticiones desde:

http://localhost:3000


Esto permite la correcta comunicación entre frontend y backend.

🧠 Decisiones Técnicas

Se optó por microservicios para simular un entorno real de producción.

Los DTO se mantuvieron en el paquete model para no sobrecomplicar la estructura.

Se utilizó Docker Compose para facilitar el levantamiento del entorno completo con un solo comando.

El frontend consume servicios reales, no datos simulados.

📝 Notas Finales

El proyecto está pensado como un reto técnico, priorizando claridad, funcionalidad y buenas prácticas.

Se evitó sobreingeniería innecesaria.

La solución es completamente funcional y escalable.