package Métodos;

import javax.swing.*;

public class MetodosOperaciones {
    /*
    Son las acciones del obj
    lleva un midif de acceso - valor de retorno - nom del metodo - args
    ej:
    public void miMetodo (){
    cuerpo
    }
     */
    //Atributos
    int num1, num2, suma,resta,mult,div;
    //Métodos
    //Método usuario, void ya que pide, no retorna nada
    public void leerNumeros(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Dame número 1: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Dame número 2: "));
    }
    public void sumar(){
        suma=num1+num2;
    }
    public void resta(){
        resta=num1-num2;
    }
    public void multiplicar(){
        mult=num1*num2;
    }
    public void dividir(){
        div=num1/num2;
    }
    //Método para mostrar los resultados
    public void show(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
    }
}
