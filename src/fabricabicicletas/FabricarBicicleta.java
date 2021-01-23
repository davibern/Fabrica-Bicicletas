package fabricabicicletas;

/**
 * Clase que monta las bicicletas, necesita cada bicicleta un cuadro y dos ruedas
 * 
 * @author Davibern
 * @version 1.0
 */
public class FabricarBicicleta extends Thread {
    
    // Variables o Constantes
    private final int TIEMPO_MAXIMO_BICICLETA = 2000;
    private final int TIEMPO_MAXIMO_FABRICACION = 6000;
    private final long START_TIME;
    private long END_TIME;
    // Recurso compartido del almacén
    private Almacen almacen;
    
    /**
     * Constructor del montador de bicicleta
     * @param almacen se requiere de un almacen compartido
     */
    public FabricarBicicleta (Almacen almacen) {
        this.almacen = almacen;
        this.START_TIME = 0;
    }
    
    /**
     * Método que monta bicicletas siempre que haya unidades disponibles.
     */
    @Override
    public void run () {
        
        do {
            try {
                this.almacen.sacarCuadro();
                this.almacen.sacarRueda();
                this.almacen.sacarRueda();
                Thread.sleep(this.TIEMPO_MAXIMO_BICICLETA);
                System.out.println("Se ha fabricado una bicicleta.");
                this.END_TIME = System.nanoTime();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        } while ((this.END_TIME - this.START_TIME)/1e6 < this.TIEMPO_MAXIMO_FABRICACION);
        
    }
    
}
