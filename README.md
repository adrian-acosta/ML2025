# 🖥️ Proyecto de Automatización de Pruebas

Este proyecto contiene scripts de automatización de pruebas para un sitio web de ejemplo utilizando **Java, Selenium WebDriver, Cucumber y Maven**.

## 📁 Estructura del proyecto

<img width="249" height="197" alt="image" src="https://github.com/user-attachments/assets/13359c70-de58-40a4-bd7d-0a0096f9ef85" />



- **`features`**: Archivos `.feature` con los escenarios de prueba.
- **`stepsDefinitions`**: Clases con los Step Definitions.
- **`runners`**: Clases para ejecutar los tests con Cucumber y TestNG/JUnit.
- **`utils`**: Métodos auxiliares como capturas de pantalla, esperas, etc.
- **`pom.xml`**: Archivo de Maven con dependencias y plugins.

---

## ⚙️ Requisitos

- Java JDK 24 o superior(En caso de cambiarlo actualizar en el POM.xml en la etiqueta "Release" <img width="397" height="169" alt="image" src="https://github.com/user-attachments/assets/c2665c82-6e8a-4243-976e-f34dfb161a08" />

- Maven 3.6 o superior
- Navegador Chrome (o el que uses en los scripts)
- Eclipse / IntelliJ / VSCode (opcional)

---

## 🛠️ Configuración del proyecto

1. Clona el repositorio:

   git clone https://github.com/usuario/proyecto-automatizacion.git

2. Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ).

3.-Asegúrate de tener el driver de Chrome actualizado y disponible.
En caso de necesitar ejecutarlo con otro browser hay que actualizar en el archivo config.properties

<img width="331" height="101" alt="image" src="https://github.com/user-attachments/assets/e2a8b85d-91fb-484e-99b2-2bb6043aec96" />


🚀 **Ejecución de pruebas**

Ejecutar todos los escenarios:

Utilizar el comeando mvn test o bien desde el IDE (Eclipse por ejemplo)
<img width="658" height="758" alt="image" src="https://github.com/user-attachments/assets/b656cdc0-75c1-4805-89f6-8f2f6702d69a" />

**Reporte de Pruebas**
El reporte de salida de la ejecución de pruebas es el reporte sencillo de Cucumber, pero cuenta con imagenes por cada Step que se ejecuta lo cual lo hace un reporte mucho más completo y sin tener que instalar algo adicicional como otros reporteadores más complejos.

<img width="240" height="175" alt="image" src="https://github.com/user-attachments/assets/86a90a26-36a6-45f6-b386-e0bd6918ae58" />

<img width="1351" height="602" alt="image" src="https://github.com/user-attachments/assets/00125445-e890-4c85-b405-80987e782095" />

<img width="1360" height="454" alt="image" src="https://github.com/user-attachments/assets/65a9e400-6d01-446d-a53e-1279bfed0e5f" />

El reporte para mejor visibilidad abrirlo desde la ubicación del proyecto en un navegador como Chrome.
