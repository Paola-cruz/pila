
package piladinamica;
import java.util.Vector;

public class PilaVector {
    
   private static final int INICIAL = 19;
    private int cima;
    private Vector listaPila;
    
    public PilaVector(){
        cima = -1;
        listaPila = new Vector(INICIAL);
    }
    public void insertar (Object elemento)
    {
    cima++;
    listaPila.addElement(elemento);
    }
    public Object quitar () 
    {
        Object aux;
        if (pilaVacia())
        {
            System.out.println("Pila vacia, no se puede extraer");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
        }
    public Object cimaPila() 
    {
        if (pilaVacia())
        {
            System.out.println("Pila vacia, no se puede extraer");
        }
        return listaPila.elementAt(cima);
        
    }
    public boolean pilaVacia()
    {
        return cima == -1;
    }
    public void limpiarPila() 
    {
        while(! pilaVacia())
            quitar();
    }
}