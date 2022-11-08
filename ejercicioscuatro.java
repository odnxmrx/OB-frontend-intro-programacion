/*En este ejercicio practicarás las estructuras de control, para ello deberás crear:

1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

2.Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

    Incrementar el valor de la variable en uno cada vez que se ejecute.

    Mostrarlo por pantalla cada vez que se ejecute.

3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

5. Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

*/

public class ejercicioscuatro {

    public static void main(String[] args) {
        //Ej. 1
        if(numeroIf == 0) {
            System.out.println("Es 0");
        } else if(numeroIf > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

        //Ej. 2
        while(numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //Ej. 3
        do{
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);

        //Ej. 4
        int valoresFor = 0;
        for(let i = 0; i <= 3; i++){
            System.out.println(valoresFor[i]);
        }

        //Ej. 5
        var estacion = "Primavera";
        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Eso no es una estación");
                break;
        }

}
