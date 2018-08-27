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
public class Cuenta {
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int global;
    
    public Cuenta(int numero, int clave, String dueno, double saldo){
        this.numero = numero;
        this.clave = clave;
        this.dueno = dueno;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean consignar(double value){
        if(value > 0){
            this.saldo = saldo + value;
            return true;
        }else{
            return false;
        }
    }
    public void consultarSaldo(){
        System.out.println(saldo);
    }
    public boolean cambiarClave(int x){
        if(x > 1000 && x <= 9999){
            this.clave = x;
            return true;
        }else{
            return false;
        }
    }
}
