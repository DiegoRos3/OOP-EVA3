package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURA {

    public static void main(String[] args) {
        // TODO code application logic here
        int x;       
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el valor (entero) de x: ");
                x = sc.nextInt();
                break;
            } catch(InputMismatchException e){
                System.out.println("No se introdujo un numero valido, vuelva a capturar");
            }
        }while(true);
        System.out.println("Valor de x = "+x);  
        
    }
    
}
