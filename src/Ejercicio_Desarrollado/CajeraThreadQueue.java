package Ejercicio_Desarrollado;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CajeraThreadQueue extends Thread {
    private String nombre;
    private long initialTime;
    private AbstractQueue<Cliente> cola;

    public CajeraThreadQueue() {
        this.cola = new LinkedBlockingQueue<Cliente>();
    }

    public CajeraThreadQueue(String nombre, long initialTime) {
        this.nombre = nombre;
        this.initialTime = initialTime;
        this.cola = new LinkedBlockingQueue<Cliente>();
    }

    public void addCliente(Cliente cliente) {
        this.cola.add(cliente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        while (!cola.isEmpty()) {
            Cliente cliente = cola.remove();
            System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "

                    + cliente.getNombre() + " EN EL TIEMPO: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");

            for (int i = 0; i < cliente.getCarroCompra().length; i++) {
                // TODO: Se procesa el pedido en X segundos
                this.esperarXsegundos(cliente.getCarroCompra()[i]);
                System.out.println("Procesado el producto " + (i + 1)

                        + " del cliente " + cliente.getNombre() + "->Tiempo: "
                        + (System.currentTimeMillis() - this.initialTime) / 1000
                        + "seg");

            }

            System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                    + cliente.getNombre() + " EN EL TIEMPO: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");
        }

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
