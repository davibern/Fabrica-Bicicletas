package fabricabicicletas;

/**
 * Clase que ejecuta el programa principal
 * 
 * @author Davibern
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        
        Almacen almacen = new Almacen();
        FabricarRueda fr = new FabricarRueda(almacen, 4);
        FabricarCuadro fc = new FabricarCuadro(almacen, 2);
        FabricarBicicleta fb1 = new FabricarBicicleta(almacen);
        FabricarBicicleta fb2 = new FabricarBicicleta(almacen);
        
        fr.start();
        fc.start();
        fb1.start();
        fb2.start();
        
    }
}
