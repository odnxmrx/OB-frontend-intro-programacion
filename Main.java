public class Main {

    public static void main(String[] args) {
        int sumas = sumatorio(1, 1, 1); //Ej. 1.2
       
       System.out.println("El total es: " + sumas);
       
       Coche miCoche = new Coche(); //crear objeto "miCoche" Ej. 2.4
       miCoche.IncrementaPuerta();
       System.out.println(miCoche.numPuertas); //muestra el num de puertas. Ej. 2.5
   }

   public static int sumatorio(int a, int b, int c) { //Ej. 1.1
       return a + b + c;
   }

}

class Coche { //crear clase coche Ej. 2.1
   public int numPuertas = 4; //variable num. que almacena numero de puertas. Ej. 2.2

   public void IncrementaPuerta() { //funcion Ej. 2.3
       this.numPuertas++; //incrementa num. de puertas
   }
}
   