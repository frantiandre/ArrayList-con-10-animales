/*
 UNIANDES PUYO
Sistema de Facturacion 2016 
Octavo Semestre
Franklin Cando
26/05/2016
 */

package animalesenum;
import java.util.ArrayList;
import java.util.Date;
import animalesenum.clsanimales;

/**
 *
 * @author FRANKLIN
 */
public class Animalesenum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.util.Date fecha = new Date();
        
        // TODO code application logic here
     ArrayList<clsanimales> animal=new ArrayList<clsanimales>();
     clsanimales p0=new clsanimales(1,"Gallina",clsanimales.estructura.vertebrados,clsanimales.clase.oviparos,fecha,35);
     clsanimales p1=new clsanimales(2,"Serpiente",clsanimales.estructura.vertebrados,clsanimales.clase.oviparos,fecha,35);
     clsanimales p2=new clsanimales(3,"Vaca",clsanimales.estructura.vertebrados,clsanimales.clase.mamiferos,fecha,35);
     clsanimales p3=new clsanimales(4,"Caballo",clsanimales.estructura.vertebrados,clsanimales.clase.mamiferos,fecha,35);
     clsanimales p4=new clsanimales(5,"Condor",clsanimales.estructura.vertebrados,clsanimales.clase.oviparos,fecha,35); 
     clsanimales p5=new clsanimales(6,"Leon",clsanimales.estructura.vertebrados,clsanimales.clase.mamiferos,fecha,35);
     clsanimales p6=new clsanimales(7,"Golondrina",clsanimales.estructura.vertebrados,clsanimales.clase.oviparos,fecha,35);
     clsanimales p7=new clsanimales(8,"perro",clsanimales.estructura.vertebrados,clsanimales.clase.mamiferos,fecha,35);
     clsanimales p8=new clsanimales(9,"gallinaso",clsanimales.estructura.vertebrados,clsanimales.clase.oviparos,fecha,35);
     clsanimales p9=new clsanimales(10,"tigre",clsanimales.estructura.vertebrados,clsanimales.clase.mamiferos,fecha,35); 
     animal.add(p0);
     animal.add(p1);
     animal.add(p2);
     animal.add(p3);
     animal.add(p4);
     animal.add(p5);
     animal.add(p6);
     animal.add(p7);
     animal.add(p8);
     animal.add(p9);
     imprimir(animal);
     
    }
    private static void imprimir(ArrayList<clsanimales> animal) {
        for(clsanimales listanimal :animal){
             System.out.println("**********************");
                System.out.println("           ID:"+listanimal.Id());
                System.out.println("           Nombre:"+listanimal.Nombre());
                System.out.println("           Estructura:"+listanimal.Estructur());
                System.out.println("           Clase:"+listanimal.Clasea());
                System.out.println("           Fecha Apariamiento:"+listanimal.Apareamiento());
                System.out.println("           Peso:"+listanimal.Peso());
               
        }
        
    }
    
    
}
    

