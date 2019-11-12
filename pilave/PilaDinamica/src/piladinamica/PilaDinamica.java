/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piladinamica;

import javax.swing.JOptionPane;

/**
 *
 * @author Yess
 */
public class PilaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int pila[] = new int[10];
        int opc;
        PilaVector objPilaVector = new PilaVector();
   int dato;
        
        String res=JOptionPane.showInputDialog("¿Desea iniciar una pila? si/no");
        if(res.equalsIgnoreCase("si")){
            do{
        
opc=Integer.parseInt(JOptionPane.showInputDialog("Elige la operación que deseas realizar \n1) Insertar \n2) Retirar \n"
        + "3)Pila vacía \n4) Cima Pila \n5)Limpiar tabla \n6) Salir"));
switch(opc){
    case 1:
      dato=Integer.parseInt(JOptionPane.showInputDialog("Escribe el dato que deseas insertar"));
        objPilaVector.insertar(dato);
        break;
    case 2:
           objPilaVector.quitar();
                   break;
    case 3:
         objPilaVector.pilaVacia();
         break;
    case 4:
         objPilaVector.cimaPila();
    case 5:
           objPilaVector.limpiarPila();
    break;
    case 6:
    System.exit(0);
}   }
            while(res != String.valueOf(6));     
    } else{
            System.exit(0);
        }




} 
     
       
    

}

    
 
