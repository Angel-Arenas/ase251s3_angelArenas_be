# ase251s3_angelArenas_be

## Pasos que se siguieron para la actividad

1. Creé mi proyecto utilizando **Spring Initializr**.
2. Descargué el archivo.
3. Lo abrí desde **IntelliJ**.
4. Agregué la dependencia `spring-boot-starter-web` en el archivo `pom.xml`.
5. Creé una clase `HelloWorldController` y encima de la clase agregué el decorador `@RestController`.
6. Creé un método llamado `HelloWorld` que retorna `"Hello World"`.
7. Encima del método agregué el decorador `@GetMapping` y le agregué un atributo `"/Hello"` dentro del paréntesis.
8. Inicié el programa.
9. Entré al navegador, coloqué `localhost:8080/Hello` y me salió el "Hello World".
