package eva3_8_custom_exceptions;

public class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato de entrada incorrecto! El valor debe ser positivo.");
    }
    
    
}
