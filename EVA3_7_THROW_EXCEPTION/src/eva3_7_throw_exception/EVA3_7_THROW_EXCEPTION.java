package eva3_7_throw_exception;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        try {
            //checked: es forzoso atenderlas
            //uncheked: errores de logica, no es forzoso resolverlas
            obj.capturaMayorCero(100);
            System.out.println("Introduce un valor: ");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();            
        } catch (Exception ex) {
            //NO ES BUENO USAR EXCEPTION, YA QUE ES LA SUPERCLASE DE LAS EXCEPCIONES
            //Y VA A CALCULAR CUALQUIER EXCEPCION
            System.out.println(ex.getMessage());
        }

        //arithmetic exception es uncheked y no es obligatorio atenderla
        try{
            obj.division(100, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

class Prueba {

    public void capturaMayorCero(int valor) throws Exception {
        if (valor <= 0) 
            throw new Exception(valor + " es negativo, solo se aceptan positivos");
        
        System.out.println("valor es: " + valor);
    }
    
    public int division(int x, int y){
        if(y == 0)
            throw new ArithmeticException("El valor del divisor es cero, no se puede hacer!!");
            return x/y;
    }
   }

