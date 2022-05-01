package Métodos;

public class ResultadosOperaciones {
    public static void main(String[] args) {
        //Creamos un obj tipo MetodosOperaciones que se construya con el mismo const
        MetodosOperaciones op=new MetodosOperaciones();
        //Invocamos los métodos en el orden que necesitamos que se ejecuten
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.multiplicar();
        op.dividir();
        //Mostramos resultados
        op.show();
    }
}
