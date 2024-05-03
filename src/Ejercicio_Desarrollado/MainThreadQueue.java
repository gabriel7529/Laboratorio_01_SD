package Ejercicio_Desarrollado;

public class MainThreadQueue {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Ejercicio_Desarrollado.Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
    Cliente cliente2 = new Cliente("Ejercicio_Desarrollado.Cliente 2", new int[] { 1, 3, 5, 1, 1 });
    Cliente cliente3 = new Cliente("Ejercicio_Desarrollado.Cliente 3", new int[] { 1, 2, 2, 1, 1 });
    Cliente cliente4 = new Cliente("Ejercicio_Desarrollado.Cliente 4", new int[] { 1, 1, 3, 1, 1 });
    Cliente cliente5 = new Cliente("Ejercicio_Desarrollado.Cliente 5", new int[] { 1, 3, 1, 1, 1 });

    // Tiempo inicial de referencia
    long initialTime = System.currentTimeMillis();
    CajeraThreadQueue cajera1 = new CajeraThreadQueue("Ejercicio_Desarrollado.Cajera 1", initialTime);
    CajeraThreadQueue cajera2 = new CajeraThreadQueue("Ejercicio_Desarrollado.Cajera 2", initialTime);

    cajera1.addCliente(cliente1);
    cajera1.addCliente(cliente2);
    cajera2.addCliente(cliente3);
    cajera2.addCliente(cliente4);
    cajera2.addCliente(cliente5);

    cajera1.start();
    cajera2.start();
  }
}
