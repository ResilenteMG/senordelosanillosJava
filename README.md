# Proyecto: Modelado UML - El Señor de los Anillos

Este repositorio contiene el diseño de un diagrama de clases estructurado para representar la jerarquía de personajes del universo de Tolkien. El modelo se enfoca en la correcta aplicación de conceptos de herencia y asociación.

<img width="1481" height="789" alt="Diagrama sin título-Página-1 drawio" src="https://github.com/user-attachments/assets/390a3ace-db8f-438e-a535-f7e7818fb7a6" />

## 🛠️ Avance del Diagrama

Se ha completado la arquitectura base utilizando tres niveles de profundidad para organizar la información de forma lógica:

### 🎨 Diseño Visual
* **Nivel 1 (Verde)**: Superclase `CHARACTERS` con atributos globales.
* **Nivel 2 (Naranja)**: Subclases por razas que heredan de la clase superior.
* **Nivel 3 (Blanco)**: Objetos específicos (personajes) vinculados a sus razas.
  
### 📋 Estructura de Datos
El diagrama cuenta actualmente con los siguientes componentes integrados:

* **Razas Modeladas**: `HUMAN`, `ELF`, `DWARF`, `WIZARD` y `HOBBIT`.
* **Personajes Finalizados**: 
    * **Humanos**: Aragorn, Boromir, Faramir.
    * **Elfos**: Legolas, Arwen, Galadriel.
    * **Enanos**: Gimli, Thorin, Balin.
    * **Magos**: Gandalf, Saruman, Radagast.
    * **Hobbits**: Frodo, Sam, Pippin.

## ⚙️ Especificaciones Técnicas
* **Atributos**: Todos los campos están tipados (`int`, `String`, `boolean`, `double`) según estándares de programación orientada a objetos.
* **Herramienta**: Diagrama desarrollado en **draw.io**.
* **Alineación**: Se utilizó una disposición en cascada para optimizar el espacio y facilitar la lectura técnica.

---
# 📜 Jerarquía de Personajes de la Tierra Media

Este proyecto es una implementación práctica de los pilares fundamentales de la **Programación Orientada a Objetos (POO)** en Java. A través del universo de "El Señor de los Anillos", se demuestra cómo la estructura de clases permite organizar y especializar datos de forma eficiente.

---

## 🏗️ Arquitectura del Proyecto (Los 3 Niveles)

El sistema se organiza en una jerarquía de tres niveles, permitiendo una transición fluida desde lo general a lo específico:

### 🟢 Nivel 1: Superclase (`Character.java`)
Es la raíz de la jerarquía. Define los atributos comunes que comparten todos los seres:
* `name`, `age`, `height` y `strength`.
* Establece el método base `printDetails()` que será utilizado por el polimorfismo.

### 🟠 Nivel 2: Subclases (Razas)
Archivos individuales que extienden a la superclase, añadiendo características únicas por raza:
* **Human**: Reino y Linaje noble.
* **Elf**: Destreza y Habilidad con el arco.
* **Dwarf**: Largo de barba y Habilidad minera.
* **Hobbit**: Sigilo y Cantidad de comidas diarias.
* **Wizard**: Poder mágico y Color de báculo.

### 🔵 Nivel 3: Instanciación (`Main.java`)
El punto de entrada donde se crean los **15 objetos reales** (3 por cada raza). Aquí es donde los "planos" se convierten en personajes con datos concretos.

---

## 🛠️ Pilares de POO Implementados

| Pilar | Aplicación en el Código |
| :--- | :--- |
| **Herencia** | Uso de la palabra clave `extends` para heredar atributos de `Character`. |
| **Encapsulamiento** | Atributos `private` protegidos por métodos `public` (Getters y Setters). |
| **Polimorfismo** | Uso de `@Override` en `printDetails()` para que cada raza se presente de forma distinta. |
| **Abstracción** | Modelado de personajes complejos en atributos esenciales para el software. |

---

## 🚀 Cómo ejecutar el proyecto

1.  Asegurarse de tener instalado el **JDK** (Java Development Kit).
2.  Importar la carpeta `src` en **IntelliJ IDEA**.
3.  Verificar que los 6 archivos de clases (`Character`, `Human`, `Elf`, `Dwarf`, `Hobbit`, `Wizard`) y el `Main` estén presentes.
4.  Ejecutar la clase `Main.java`.

> [!IMPORTANTE]
> La salida por consola mostrará a los 15 personajes organizados, demostrando que el sistema reconoce automáticamente la especialidad de cada uno.

<img width="500" height="1000" alt="Añadir un título" src="https://github.com/user-attachments/assets/435ee9d0-b813-44a3-a67f-fcf9c3149ce4" />

---

### ✍️ Notas de la Autora
*"Este proyecto refleja un aprendizaje incremental: desde el diseño de la superclase hasta la prueba de fuego en el Main, validando cada paso mediante el testeo constante de objetos."*
*Este proyecto fue desarrollado como parte de la tarea práctica de Modelado de Software JAVA.*




<p align="center">
  Desarrollado por <b>Melissa Gómez 💞 Developers</b> <br>
  <a href="https://www.linkedin.com/mynetwork/grow/" target="_blank">
    <img src="https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white" alt="LinkedIn">
  </a>
  <a href="https://github.com/ResilenteMG" target="_blank">
    <img src="https://img.shields.io/badge/-GitHub-black?style=flat-square&logo=Github&logoColor=white" alt="GitHub">
  </a>
</p>
