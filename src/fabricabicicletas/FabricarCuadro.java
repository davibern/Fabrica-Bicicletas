package fabricabicicletas;

/**
 * Clase que fabrica cuadros de bicicletas
 * 
 * @author Davibern
 * @version 1.0
 */
public class FabricarCuadro extends Thread {
    
    // Atributos o Consantes
    private final int TIEMPO_MAXIMO_CUADROS = 2000;
    private int cantidadCuadros;
    // Recurso del almacén de ruedas
    private Almacen almacen;
    
    /**
     * Constructor de la clase que fabrica cuadros
     * 
     * @param almacen se requiere de un almacén compartido
     * @param cantidadCuadros cantidad de cuadros a fabricar
     */
    public FabricarCuadro (Almacen almacen, int cantidadCuadros) {
        this.almacen = almacen;
        this.cantidadCuadros = cantidadCuadros;
    }
    
    /**
     * Método que fabrica cuadros y los almacena en el recurso compartido
     */
    @Override
    public void run () {
        
        for (int i = 0; i < this.cantidadCuadros; i++) {
            try {
                Thread.sleep(this.TIEMPO_MAXIMO_CUADROS);
                this.almacen.guardarCuadro();
                System.out.println("Se ha fabricado un nuevo cuadro.");
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            
        }
        
    }
    
}
