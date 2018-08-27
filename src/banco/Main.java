/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta(0,0,"Magdalena Sanchez", 0);
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese nueva clave");
        int clave=lectura.nextInt();
        if(cuenta.cambiarClave(clave)){
        System.out.println("Clave cambiada con exito ");
        System.out.println("Clave: " + cuenta.getClave());
        }else{
        System.out.println("No es posible cambiar la clave: ");
        }
        
        
        System.out.println("Ingrese cantidad a consignar");
        double consigna=lectura.nextDouble();
        if(cuenta.consignar(consigna)){
        System.out.println("Transaccion realizada con exito ");
        System.out.println("Saldo: " + cuenta.getSaldo());
        }else{
        System.out.println("No es posible realizar la transaccion, saldo: " + cuenta.getSaldo());
        }
        cuenta.consultarSaldo();
        
        
    }
       
}
