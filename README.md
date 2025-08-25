# 🖥️ Proyecto de Automatización de Pruebas ML2025

Este proyecto contiene scripts de automatización de pruebas para un sitio web de ejemplo utilizando **Java, Selenium WebDriver, Cucumber y Maven**.

## 📁 Estructura del proyecto

<img width="335" height="543" alt="image" src="https://github.com/user-attachments/assets/87ee3d58-8318-41c8-bb3d-7f7eed51df9a" />




- **`features`**: Archivos `.feature` con los escenarios de prueba.
- **`stepsDefinitions`**: Clases con los Step Definitions.
- **`runners`**: Clases para ejecutar los tests con Cucumber y TestNG/JUnit.
- **`utils`**: Métodos auxiliares como capturas de pantalla, esperas, etc.
- **`pom.xml`**: Archivo de Maven con dependencias y plugins.

---

## ⚙️ Requisitos

- Java JDK 24 o superior(En caso de cambiarlo actualizar en el POM.xml en la etiqueta "release"
  <img width="403" height="160" alt="image" src="https://github.com/user-attachments/assets/78bc8bf8-d6b3-4110-a624-bc2ab7c70fd6" />

- Maven 3.6 o superior
- Navegador Chrome (o el que uses en los scripts)
- Eclipse / IntelliJ / VSCode (opcional)

---

## 🛠️ Configuración del proyecto

1. Clona el repositorio:

   git clone https://github.com/adrian-acosta/ML2025.git

2. Abre el proyecto en tu IDE como Eclipse / IntelliJ.

3.-Asegúrate de tener el driver de Chrome actualizado y disponible.(No se necesita instalar ningún driver para los navedadores ya que estan administrador por el Web driver manager de boni garcia.

<img width="614" height="181" alt="image" src="https://github.com/user-attachments/assets/f421ff68-221f-4edf-8630-df43055038d4" />

En caso de necesitar ejecutarlo con otro browser hay que actualizar en el archivo config.properties(Solo esta preparado para Choreme y Firefox, para que soporte otros hay que agregar en el código en la clase **WebDriverManager**

<img width="491" height="210" alt="image" src="https://github.com/user-attachments/assets/829dc266-f02f-42f8-9f26-52fc4b8ddde5" />



🚀 **Ejecución de pruebas**

Ejecutar todos los escenarios:

Utilizar el comeando mvn test o bien desde el IDE (Eclipse por ejemplo) desde la clase TestRunner

<img width="659" height="460" alt="image" src="https://github.com/user-attachments/assets/18a9a386-4e6d-4fce-b567-72627a857dea" />

📊 Reportes Generados

El reporte de salida de la ejecución de pruebas es el reporte sencillo de Cucumber, pero cuenta con imagenes por cada Step que se ejecuta lo cual lo hace un reporte mucho más completo y sin tener que instalar algo adicicional como otros reporteadores más complejos.

Reporte HTML Cucumber:
Abrir Reporte

<img width="269" height="173" alt="image" src="https://github.com/user-attachments/assets/ee56dd7b-4fa9-4ea9-8627-c0702bb9c9a8" />


Reporte con Capturas de Pantalla:

Ejemplo de captura de pantalla:

<img width="1363" height="597" alt="image" src="https://github.com/user-attachments/assets/a6c21104-7638-4d54-954d-04168747d689" />

<img width="1308" height="578" alt="image" src="https://github.com/user-attachments/assets/6abac5f3-87cd-4ac4-a5ac-4dba46d56581" />


El reporte para mejor visibilidad abrirlo desde la ubicación del proyecto en un navegador como Chrome.

✅ Buenas prácticas aplicadas

- **`Steps reutilizables y descriptivos.

- **`Captura de screenshots automáticos en pasos importantes o fallidos.

- **`Uso de Hooks (@Before, @After) para inicialización y cierre del WebDriver.

- **`Organización de features por módulo/funcionalidad.

- **`Reportes generados en HTML y JSON para integración con herramientas externas.

- **`Reutilización de métodos desde la clase BaseTest para optimización de código

- **`Uso del patrón de diseño Page Object Model lo que permite una reutilización de WebElements y Web methods.

- **`Utilización de archivo de configuración para no tener en código duro parámetros que pueden cambiar como rutas o bien el mismo navegador.
- **`Agregar comentarios en los métodos para una mejor comprensión del mismo.
  
- **`Identación a nivel de código.
