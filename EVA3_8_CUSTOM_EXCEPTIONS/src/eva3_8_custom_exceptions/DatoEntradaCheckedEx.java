/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author Diego
 */
public class DatoEntradaCheckedEx extends Exception {

    public DatoEntradaCheckedEx() {
        super("Dato de entrada incorrecto! El valor debe ser positivo.");
    }
    
    
}
