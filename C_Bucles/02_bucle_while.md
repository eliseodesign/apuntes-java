# Bucle while

El bucle while se utiliza para repetir un conjunto de sentencias siempre que se cumpla
una determinada condición. Es importante reseñar que la condición se comprueba al
comienzo del bucle, por lo que se podría dar el caso de que dicho bucle no se ejecutase
nunca. La sintaxis es la siguiente:

```java
while(expresion){
    // sentencias
}
```

Las sentencias se ejecutan una y otra vez mientras expresion sea verdadera. El siguiente
ejemplo produce la misma salida que el ejemplo anterior con for, muestra cómo cambian los
valores de i del 1 al 10.

```java
while (i < 11) {
    System.out.println(i);
    i++;
}
```

Observa que en este caso el parametro unicamente es la condición y al final de las sentencias aumentamos la variable
Aqui se denota la diferecia con el bucle for

Ahoar que esta mas claro podras entender el siguiente ejemplo práctico.

```java
System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
System.out.println("Para terminar, introduzca un número negativo.");
int numeroIntroducido = 0;
int cuentaNumeros = 0;
int suma = 0;

while (numeroIntroducido >= 0) {
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    cuentaNumeros++; // Incrementa en uno la variable
    suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
}

System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
```
