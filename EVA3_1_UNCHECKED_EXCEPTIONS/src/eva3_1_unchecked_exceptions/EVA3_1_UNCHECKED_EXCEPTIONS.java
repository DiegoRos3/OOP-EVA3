package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SON TODAS RUNTIMEEXCEPTION
        
        //ARITHMETIC EXCEPTION:
        //DIVISION ENTRE 0
        System.out.println("Inicializando programa");
        int x = 5, y = 0;
        System.out.println("Inicializando las variables");
        int res = x/y;
        System.out.println("Calculando la division");
        System.out.println("Division = " + res);
        
        //InputMismatch Exception: error de captura de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("El numero es: " + num);
        
        //INDEXOUTBOUNDS EXCEPTION
        int[] arreglo = new int[5]; //0 - (n-1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //error de logica: 5 no es posicion valida
        
        //NULLPOINTER EXCEPTION
        Prueba objPrueba = null;
        System.out.println("Valor de x = " + objPrueba.x);
        
        
    }
    
    class Prueba{
        public int x = 100;
    }
    
}
