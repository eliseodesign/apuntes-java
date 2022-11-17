# Sentencia Switch

Conocida como seleccion multiple
A veces es necesario comparar el valor de una variable con una serie de valores
concretos.

```java

switch(variable) { // operación lógica
    case valor1: // caso 1
        sentencias
        break;
    case valor2: // caso 2
        sentencias
        break;
    // .
    // .
    // .
    // pueden contiuar los casos
    default: // sino coincide niguno
        sentencias
}
```

## Operador Ternario en Java

### SIMPLIFICA CONDICIONALES CORTAS

Se llama asi debido que tiene tres partes: una condición, y dos valores que dependen de la condición

```java
var resultado = (3>2) ? "Verdadero":"Falso";
// verdadero
```

Un operador ternario puede devolver cualquier tipo de dato como por ejemplo
