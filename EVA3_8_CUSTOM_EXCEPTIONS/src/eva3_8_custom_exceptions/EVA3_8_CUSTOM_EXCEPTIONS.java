/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author Diego
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Jean");
        perso.setApellido("Lopez");
        try{
            perso.setEdad(-10);
        } catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
