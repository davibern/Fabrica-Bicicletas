package fabricabicicletas;

/**
 * Clase contenedora de las unidades de ruedas y cuadros de bicicletas
 * 
 * @author Davibern
 * @version 1.0
 */
public class Almacen {
    
    // Atributos o Constantes
    private final int MAXIMO_RUEDAS = 5;
    private final int MAXIMO_CUADROS = 3;
    private final int MAXIMO_BICICLETAS = 99;
    // Recursos compartidos
    private int ruedas;
    private int cuadros;
    
    /**
     * Método que guarda una rueda en el almacén
     */
    public synchronized void guardarRueda() {
        try {
            while (this.ruedas >= this.MAXIMO_RUEDAS) {
                System.out.println("El almacén de ruedas está lleno.");
                this.wait();
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        this.ruedas++;
        this.notify();
    }
    
    /**
     * Método que guarda un cuadro en el almacén
     */
    public synchronized void guardarCuadro() {
        try {
            while (this.ruedas >= this.MAXIMO_CUADROS) {
                System.out.println("El almacén de cuadros está lleno.");
                this.wait();   
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        this.cuadros++;
        this.notify();
    }
    
    /**
     * Método que saca una rueda del almacén
     */
    public synchronized void sacarRueda() {
        try {
            while (this.ruedas == 0) {
                this.wait();
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        this.ruedas--;
        System.out.println("Se ha sacado una rueda.");
        this.notify();
    }
    
    /**
     * Método que saca un cuadrod del almacén
     */
    public synchronized void sacarCuadro() {
        try {
            while (this.cuadros == 0) {
                this.wait();
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        this.cuadros--;
        System.out.println("Se ha sacado un cuadro.");
        this.notify();
    }
    
    /**
     * Método que devuelve el número de ruedas que hay en el almacén
     * @return número de ruedas almacendas
     */
    public int getRuedas() {
        return this.ruedas;
    }
    
        /**
     * Método que devuelve el número de cuadros que hay en el almacén
     * @return número de cuadros almacendos
     */
    public int getCuadros() {
        return this.cuadros;
    }

}
