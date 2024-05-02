package Ejercicio_Desarrollado;

public class MainThread {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ejercicio_Desarrollado.Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Ejercicio_Desarrollado.Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        CajeraThread cajera1 = new CajeraThread("Ejercicio_Desarrollado.Cajera 1", cliente1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Ejercicio_Desarrollado.Cajera 2", cliente2, initialTime);
        cajera1.start();
        cajera2.start();
    }
}
