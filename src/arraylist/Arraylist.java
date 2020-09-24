
package arraylist;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonj
 */
public class Arraylist {
 
    public static void main(String[] args) {
        List<String>nombres;                //implementamos una lista
        nombres = new ArrayList<>();        //implementamos objeto a la variable
        int numero=0,posicion=0,valor;
       String nombre= null;
       
    do{
        
    
        try{
               invitados(nombres);
               
               JOptionPane.showMessageDialog(null,"Lista de invitados\n"+nombres);
               numero=Integer.parseInt(JOptionPane.showInputDialog(null,"DESEA AGREGAR UNA PERSONA MAS ALA LISTA\n"
                       + "1.SI\n"
                       + "2.Borrar persona\n "
                       + "3.Borrar toda la lista\n "
                       + "4.Salir"));
               switch(numero){
                   case 1: 
                           nombre=JOptionPane.showInputDialog("Ingrese nombre nuevo ");
                           nombres.add(nombre);                      
                           JOptionPane.showMessageDialog(null,"Lista de invitados\n"+nombres);
                   break;
                   case 2:
                           posicion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de la persona que desea borar "));
                           valor=posicion-1;
                           nombres.remove(valor);
                           JOptionPane.showMessageDialog(null,"Lista de invitados\n"+nombres);
                   break;
                   case 3:
                           borrar(nombres);
                           
                   break;
                   default:
                        JOptionPane.showMessageDialog(null,"MUCHAS GRACIAS  ");
                      
                }
             
           }catch(Exception e){
                JOptionPane.showMessageDialog(null,"USTED SELECCIONO CANCELAR ");
           }
    }while(numero !=4); 
       
       
    }
    public static void invitados (List<String>nombres){
               nombres.add("1. John ");
               nombres.add("2. Adolfo ");
               nombres.add("3. Frady ");
               nombres.add("4. Liceth");
               nombres.add("5. Rousse y Tito ");
              
         
    }
    
    public static void borrar (List<String>nombres){
        
               nombres.clear();
               JOptionPane.showMessageDialog(null,"Lista de invitados\n"+nombres);
                 
    }
    
}
