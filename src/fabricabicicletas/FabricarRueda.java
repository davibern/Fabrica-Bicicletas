package fabricabicicletas;

/**
 * Clase que fabrica ruedas
 * 
 * @author Davibern
 * @version 1.0
 */
public class FabricarRueda extends Thread {
    
    // Atributos o Constantes
    private int cantidadRuedas;
    private final int TIEMPO_MAXIMO_RUEDAS = 2000;
    // Recurso del almacén de ruedas
    private Almacen almacen;
    
    /**
     * Constructor de la fábrica de ruedas
     * @param almacen se requiere de un almacén compartido
     * @param cantidadRuedas cantidad de ruedas a producir
     */
    public FabricarRueda (Almacen almacen, int cantidadRuedas) {
        this.almacen = almacen;
        this.cantidadRuedas = cantidadRuedas;
    }
    
    /**
     * Método fabrica ruedas y las almacena en el recurso compartido
     */
    @Override
    public void run () {
        
        for (int i = 0; i < this.cantidadRuedas; i++) {
            try {
                Thread.sleep(this.TIEMPO_MAXIMO_RUEDAS);
                this.almacen.guardarRueda();
                System.out.println("Se ha fabricado una nueva rueda.");
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            
        }
        
    }

}
