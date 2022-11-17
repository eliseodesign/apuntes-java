# Variables

## ¿Qué es una variable en java?

- Una variable es un contenedor de información. _(Imagina una variable como una **cajita**
  con una etiqueta osea su nombre)_ , una cajita en la que se puede introducir un valor.

- Pueden almacenar valores enteros, números decimales, caracteres,
  cadenas de caracteres (palabras o frases), etc.

- El contenido puede **cambiar** durante la ejecución del programa.

## Comó crear una variable

- Necesitamos definir el tipo de la variable
- Usa nombres descriptivos

```Java
int primerVar = 5;
// int es el tipo de dato (entero)
// primerVAr es el nombre
// = 5 es la asignación del valor
```

Observa otro ejemplo antes de pasar a todos los tipos de variables, esta vez una con texto

```Java
string miNombre = "Eliseo Arévalo"
// string (cadena de caracteres)
// observa que el valor esta entre parentesis
```

<br>

---

---

## Tipos de Variables

### Enteros **(int y long)**

Otra cosa que aprender es que podemos declarar y asignar en diferentes lineas

```java
int x; // Declara la variable x como entera
x = 5; // Asigna el valor 5 a la variable x
```

_usa long si el numero será demasiado grande_

<br>

---

### Decimales **(double y float)**`

Usamos los tipos double o float cuando queremos almacenar números

La diferencia está en la precisión, las variables de tipo
double tienen mayor precisión que las de tipo float.

```java
double x, y;
x = 7;
y = 25.01;
```

---

### Cadenas de caracteres **(String)**

Se utilizan para almacenar palabras y frases. Todas las
cadenas de caracteres deben ir entrecomilladas (“).

```java
String miPalabra = "aprender";
String miFrase = "nunca pares de aprender";
String vacio = "" //podemos crearlo vacio
```

---

### Caracteres **(char)**

Un carácter suelto como una letra o un signo de puntuación se puede almacenar en
una variable de tipo char. El carácter debe ir entrecomillado utilizando las comillas
simples (‘).
Hay que tener en cuenta que no es lo mismo "a" que 'a'.

```Java
char letra1 = 'c';
char letra2 = 'a';
char letra3 = 's';
char letra4 = 'a';
```

---

---

## Resumen

| Tipo   | Descripción       | Tamaño  | Ejemplo                |
| ------ | ----------------- | ------- | ---------------------- |
| Bolean | verdadero o falso | 1 bit   | bolean si = true       |
| byte   | entero            | 8 bits  | byte rep = 22          |
| char   | carácter          | 16 bits | char letra = 'a'       |
| shot   | entero            | 16 bits | short n = 22           |
| int    | entero            | 32 bits | short asistentes = 22  |
| long   | entero            | 64 bits | long población = 22L   |
| float  | decimales         | 32 bits | float nota = 8.6       |
| double | decimales         | 64 bits | double cantidad = 9.5d |

**IMPORTANTE**

para no hacer tedioso el código unicamente se usa la porción recuerda que debemos usar la esctructura de clases

---
