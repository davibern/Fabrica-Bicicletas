# Fabrica-Bicicletas
Simular la fabricación de bicicletas con programación concurrente.

# Resumen ejercicio:
Implementar un programa multhilo en Java que simule el funcionamiento de una fábrica de bicicletas familiar donde:

- una persona fabrica ruedas. Simulamos (con sleep) que se tardan 2 segundos en fabricar una rueda. Cada vez que se fabrique una nueva rueda debe indicarse por pantalla;
una persona fabrica cuadros. Simulamos (con sleep) que se tardan 3 segundos en fabricar un cuadro. Cada vez que se fabrique un nuevo cuadro debe indicarse por pantalla;
dos personas montan bicicletas, para lo cual necesitan un cuadro y dos ruedas. Simulamos (con sleep) que se tardan 2 segundos en montar una bicicleta. Cada vez que se monnte una nueva bici debe indicarse por pantalla;
las ruedas se colocan en un repositorio de ruedas donde sólo caben 5 ruedas. Una vez lleno el almacén de ruedas, el fabricante de ruedas tiene que esperar a que quede un hueco para que pueda almacenar la que acaba de fabricar y poder seguir fabricando más;
los cuadros se colocan en un repositorio de cuadros donde sólo caben 3 cuadros. Una vez lleno, también tendrá que esperar.
El programa debe poder configurarse con la cantidad de ruedas y de cuadros que se van a construir y cuando se inicie deben lanzarse cuatro hilos simultáneos:

uno para el fabricante de ruedas, que finalizará cuando se hayan construido las ruedas que se han indicado al ejecutar el programa;
uno para el fabricante de cuadros, que finalizara cuando se hayan construido los cuadros indicados;
dos para los montadores de bicis, que finalizarán cuando lleven un tiempo “prudencial” (por ejemplo 6 segundos) sin poder tomar elementos de los almacenes para poder montar una nueva bici.
Cuando los cuatro trabajadores finalicen su tarea, el programa principal debería indicar cuántas bicis se han montado durante la sesión.

# SDK
Java 11
