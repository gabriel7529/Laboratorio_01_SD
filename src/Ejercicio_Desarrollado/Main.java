package Ejercicio_Desarrollado;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ejercicio_Desarrollado.Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Ejercicio_Desarrollado.Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        Cajera cajera1 = new Cajera("Ejercicio_Desarrollado.Cajera 1");
        Cajera cajera2 = new Cajera("Ejercicio_Desarrollado.Cajera 2");
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
    }
}
