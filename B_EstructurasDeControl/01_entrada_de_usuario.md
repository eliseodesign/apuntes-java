# Obtener entrada de usuario

El objeto Scanner dentro de java es el mas común para obtener la entrada de información

1. Lo primero es importar la clase **Scanner**

```java
import java.util.Scanner;
```

2. Para poder usar esta clase, crea una instancia de la clase, así:

```java
Scanner sc = new Scanner(System.in)
// sc es solo el nombre de la instancia
```

3. Ahora puedes leer tipos de datos ingresados or el usuario usando alguno de estos metodos:
   nextInt - leer un entero
   nextLine - leer una linea completa
   next - leer una palabra
   (Existen para cada tipo de datos, estos son algunos)

```java
import java.util.Scanner; // importamos la clase

Class MyClass{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) // instanciamos la clase
        String nombre = sc.nextLine // metodo
    }
}
```
