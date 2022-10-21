/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.examen1.ed;

import java.util.PriorityQueue;


public class Queue {

    
   public class Orden implements Comparable<Orden> {
    private int PrioridadOrden;
    private int IdCliente;
    private String NombreCliente;
    private String Producto;
    private double Total;

    public Orden(int PrioridadOrden, int IdCliente, String NombreCliente, String Producto, double Total ) {
        this.PrioridadOrden = PrioridadOrden;
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.Producto = Producto;
        this.Total= Total;
    }

    @Override
    public int compareTo(Orden o) {
        return o.PrioridadOrden > this.PrioridadOrden ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Prioridad de orden :" + this.PrioridadOrden + ", IdCliente: " + this.IdCliente + ", NombreCliente: " + NombreCliente + "Producto : " + this.Producto + "Total de compra : " + this.Total;
    }

    public int IdCliente() {
        return IdCliente;
    }
    
    public String Producto(){
        
    return Producto;}

    
    
    public static void main(String[] args) {
    Orden c1 = new Orden(1, 116420784, "Diego ,", "Pescado ,", 800);
    Orden c2 = new Orden(3, 114250287, "Andres ,", "Arroz ,", 1000);
    Orden c3 = new Orden(2, 112502546, "Valeria ,", "Pollo ,", 20000);

    Queue<Orden> ordenes = new PriorityQueue<>();
    ordenes.add(c1);
    ordenes.add(c2);
    ordenes.add(c3);
    while (!ordenes.isEmpty()) {
	System.out.println(ordenes.poll());
}
    }
}
}
