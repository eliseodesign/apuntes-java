# Operadores

En Java se puede operar con las variables de una forma muy parecida a como se hace
en matemáticas. Los operadores aritméticos de Java son los siguientes:

| Operador | Nombre         | Ejemplo    | Descripción                 |
| -------- | -------------- | ---------- | --------------------------- |
| +        | suma           | 20 + x     | suma dos numeros            |
| -        | resta          | a - b      | resta dos numeros           |
| \*       | multiplicación | 10 \* 7    | multiplica dos numeros      |
| /        | división       | altura / 2 | divide dos numeros          |
| %        | resto(modulo)  | 5 % 2      | resto de la división entera |
| ++       | incremento     | a++        | el valor incremeta en 1     |
| --       | decremento     | a--        | el valor decrementa en 1    |

observa el ejemplo:

```java
int x;
x = 100;
System.out.println(x + " " + (x + 5) + " " + (x - 5));
System.out.println((x * 5) + " " + (x / 5) + " " + (x % 5));
```

**System.out.println:** imprime en pantalla el contenido que pases enlos parentesis

## Operador de asignación

La sentencia de asignación se utiliza para dar un valor a una variable. En Java se utiliza el símbolo igual ( = ) para este
cometido
x = 7 + 1 es una asignación en la cual se evalúa la parte derecha 7 + 1, y el resultado

```java
int x = 2;
```
