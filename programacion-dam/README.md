# Programación — 1.º DAM ☕

¡Bienvenido/a al módulo de **Programación**! Este repositorio acompaña las primeras clases y está pensado para personas que nunca han programado. Aquí podrás leer ejemplos pequeños, cambiar valores, anticipar resultados, provocar errores controlados y practicar.

No necesitas Maven, Gradle ni bibliotecas externas. Cada programa funciona directamente con las herramientas `javac` y `java` incluidas en Java 21.

## Qué aprenderemos

- La estructura mínima de un programa Java.
- Cómo mostrar información por consola.
- Qué son las variables, los tipos primitivos, los textos y las constantes.
- Cómo realizar operaciones aritméticas y asignaciones.
- Cómo influyen la división entera y la precedencia de operadores.
- Cómo aplicar lo aprendido en programas y ejercicios sencillos.

## Requisitos

Antes de comenzar, instala:

- **Java Development Kit (JDK) 21**.
- **Visual Studio Code**.
- La extensión **Extension Pack for Java** de Microsoft para VS Code.
- **Git**, para descargar y mantener una copia del repositorio.

Java distingue entre el JRE, que ejecuta programas, y el JDK, que además permite compilarlos. Para estas clases necesitas el **JDK**.

## Qué son Git y un repositorio

**Git** es una herramienta que registra la evolución de los archivos de un proyecto. Un **repositorio** es la carpeta cuyo historial administra Git. Clonar significa descargar una copia completa del repositorio de GitHub a tu ordenador; después puedes modificar esa copia sin alterar la del resto de la clase.

## Clonar y abrir el proyecto

Abre una terminal y ejecuta:

```bash
git clone URL_DEL_REPOSITORIO
cd programacion-dam
code .
```

Sustituye `URL_DEL_REPOSITORIO` por la dirección que proporcione el profesor. `code .` abre la carpeta actual en VS Code. También puedes usar **Archivo → Abrir carpeta** y seleccionar `programacion-dam`.

## Comprobar Java

En una terminal de VS Code, ejecuta:

```bash
java -version
javac -version
```

Ambos comandos deberían indicar la versión 21. `javac` es el compilador; `java` ejecuta el programa compilado.

## Compilar y ejecutar un archivo

Primero debes situarte en la carpeta que contiene el archivo. Para ejecutar el primer ejemplo desde la raíz del repositorio:

```bash
cd 01-hola-mundo
javac HolaMundo.java
java HolaMundo
```

El primer comando crea `HolaMundo.class`, un archivo preparado para la máquina virtual de Java. El segundo lo ejecuta. Al escribir el nombre para `java`, no añadas `.java` ni `.class`.

Para volver a la carpeta anterior:

```bash
cd ..
```

Cada archivo de este repositorio se puede compilar de forma independiente repitiendo el mismo proceso con su nombre.

## Contenido del repositorio

| Carpeta | Contenido |
|---|---|
| `01-hola-mundo` | Primeros mensajes y estructura de una clase Java. |
| `02-variables` | Variables, ocho tipos primitivos, textos y constantes. |
| `03-operadores` | Aritmética, asignación, incremento y precedencia. |
| `04-ejemplos` | Pequeños programas que combinan lo aprendido. |
| `05-ejercicios` | Actividades preparadas que compilan antes de completarlas. |
| `soluciones` | Soluciones orientativas para consultar después de intentarlo. |

## Orden recomendado

1. Ejecuta `HolaMundo.java` y reconoce su clase y su método `main`.
2. Continúa con el resto de `01-hola-mundo`.
3. Recorre en orden todos los archivos de `02-variables`.
4. Practica las operaciones de `03-operadores`.
5. Modifica los programas de `04-ejemplos`.
6. Resuelve `05-ejercicios` sin mirar primero las soluciones.

Lee siempre los comentarios: explican qué observar y proponen pequeños experimentos.

## Cómo realizar los ejercicios

1. Abre un archivo de `05-ejercicios`.
2. Lee el enunciado y localiza los comentarios `TODO`.
3. Predice el resultado antes de tocar el código.
4. Sustituye los valores provisionales o añade las instrucciones solicitadas.
5. Compila y ejecuta el archivo desde su carpeta.
6. Compara la salida con el ejemplo esperado.
7. Solo después, consulta el archivo del mismo nombre en `soluciones`.

Los ejercicios iniciales compilan, pero muestran resultados incompletos. Eso te permite avanzar paso a paso sin partir de una pantalla vacía.

## Cómo experimentar con el código

- Cambia números, textos y valores `true` o `false`.
- Ejecuta el programa varias veces para comprobar tus cambios.
- Intenta predecir cada resultado antes de ejecutarlo.
- Descomenta las líneas incorrectas señaladas y lee el mensaje del compilador.
- Cambia una sola cosa cada vez: así sabrás qué produjo el nuevo resultado.
- Si algo deja de funcionar, revisa el último cambio o restaura el archivo con Git.

Los errores forman parte del aprendizaje. El mensaje suele indicar el archivo, la línea y una pista sobre el problema.

## Errores habituales

### `javac: command not found` o «no se reconoce como comando»

El JDK no está instalado o no se encuentra en la variable `PATH`. Comprueba la instalación de Java 21 y reinicia la terminal.

### `file not found: HolaMundo.java`

La terminal no está en la carpeta correcta. Usa `cd 01-hola-mundo` y vuelve a intentarlo. Puedes consultar la carpeta actual con `pwd` en Linux/macOS o `cd` en Windows.

### `class ... is public, should be declared in a file named ...`

El nombre del archivo debe coincidir exactamente con el de la clase pública, incluidas las mayúsculas: `HolaMundo.java` contiene `public class HolaMundo`.

### `';' expected`

Probablemente falta un punto y coma al final de una sentencia. Observa la línea indicada y también la anterior.

### `cannot find symbol`

Java no reconoce un nombre. Comprueba que la variable esté declarada y que hayas escrito igual sus mayúsculas y minúsculas.

### `Could not find or load main class`

Ejecuta `java HolaMundo` desde la carpeta donde se encuentra `HolaMundo.class`. No escribas la extensión.

## Consejos para aprender programación

- Programa un poco y con frecuencia; leer no sustituye a practicar.
- Escribe tú mismo el código en lugar de limitarte a copiarlo.
- Pon nombres que expliquen qué guarda cada variable.
- Predice primero y comprueba después.
- Lee los errores completos: son información, no una derrota.
- Pregunta qué hace cada línea y prueba a cambiarla.
- Guarda versiones que funcionen antes de comenzar un experimento grande.
- Explica el programa con tus propias palabras; si puedes explicarlo, empiezas a comprenderlo.

## Limpiar archivos compilados

Los archivos `.class` son resultados de compilación y `.gitignore` evita que se suban a GitHub. Si quieres borrar uno, puedes eliminarlo desde el explorador de VS Code y volver a generarlo con `javac` cuando lo necesites.

¡Disfruta experimentando y recuerda: equivocarse, investigar y volver a intentarlo también es programar!
