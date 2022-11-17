# Bucles

Los bucles se utilizan para repetir un conjunto de sentencias.

Por ejemplo, imagina que es necesario introducir la notas de 40 alumnos con el fin de calcular la media, la
nota máxima y la nota mínima. Podríamos escribir 40 veces la instrucción que pide
un dato por teclado System.console().readLine() y convertir cada uno de esos datos a un
número con decimales con 40 instrucciones Double.parseDouble(), no parece algo muy
eficiente. Es mucho más práctico meter dentro de un bucle aquellas sentencias que
queremos que se repitan.

## Bucle for

Se suele utilizar cuando se conoce previamente el número exacto de iteraciones
(repeticiones) que se van a realizar. La sintaxis es la siguiente:

```java
for (expresion1 ; expresion2 ; expresion3) {
    // sentencias
}
```

- expresion1: se utiliza para inicializar la variable con la que se trabajara

- expresion2: el bucle continuara mientras esta condición se cumpla

- expresion3: incremento/decremento de la variable

...Ejemplo:

```java
for (int i = 1; i < 11; i++) {
    System.out.println(i);
}
```

- **int i = 1** inicializamos la variable

- **1 < 11** el bulce iterara mientras

- **1++** por cada vuelta i aumentara uno
