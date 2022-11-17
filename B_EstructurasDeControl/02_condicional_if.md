# Sentencia if

## Qué es un condicional

Una sentencia condicional permite al programa bifurcar el flujo de ejecución de
instrucciones dependiendo del valor de una expresión.

## Qué es if else

La sentencia if permite la ejecución de instrucciones en función del
resultado de una expresión lógica. El resultado de evaluar una expresión lógica es
verdadero (true) o falso (false).

```java
if (condición) {
    //instrucciones a ejecutar si la condición es verdadera
} else {
    //instrucciones a ejecutar si la condición es falsa
}
```

para ponerlo más claro, un ejemplo:

```java

System.out.print("¿Cuál es la capital de El Salvador? ");

String respuesta = System.console().readLine();

if (respuesta.equals("San Salvado")) {
    System.out.println("correcto");
} else {
    System.out.println("incorrecto");
}


```

## if anidados

```java

int compra = 2000;

if (compra > 500) {
    System.out.println("tarjeta de regalo");

    if(compra > 1000){
        System.out.println("tarjeta de regalo");
    }
} else {
    System.out.println("gracias por su compra");
}


```

## Operadores de comparación

Son muy utiles en la sentencias de control

| operador | nombre        | ejemplo |
| -------- | ------------- | ------- |
| ==       | igual         | a == b  |
| !=       | distinto      | a != b  |
| <        | menor que     | a < b   |
| >        | mayor que     | a > b   |
| <=       | menor o igual | a <= b  |
| >=       | mayor o igual | a >= b  |

observa este ejemplo

```java
System.out.print("¿Qué nota has sacado? ");
String line = System.console().readLine();

double nota = Double.parseDouble( line );

if (nota >= 5) {
    System.out.println("¡Enhorabuena!, ¡has aprobado!");
} else {
    System.out.println("Lo siento, has suspendido.");
```
