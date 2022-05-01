package MétodoConstructor;

public class MetodoConstructor {
    //Atributos
    String nombre;
    int edad;
    /*
    El método constructor es siempre público y de mismo nombre a la clase, inicializa los
    métodos y atributos de la clase
    public NombreDelConst(parámetros){}
     */
    public MetodoConstructor(String _nombre, int _edad){
        nombre=_nombre;
        edad=_edad;
    }
    /*
    También podemos declarar el constructor de la sig forma:

    public MetodoConstructor(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;

    Aquí los parámetros se llaman igual a los atributos, con "this.nombre" se indica
    que ese "nombre" después del punto es al atributo y toma el valor del parámetro (String nombre)
     */
    //Método para mostrar datos
    public void show(){
        System.out.printf("Nombre: "+nombre);
        System.out.printf(" Edad: "+edad);
    }
}
