/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6jbp;

/**
 *
 * @author jbuen
 */
public class Tarea6EDClase {

    public void apicarDescuento(double precioProducto, int numProductos){  double Resultado;
        if (numProductos > 5)
            precioProducto -= 5;
                if (numProductos!=0){
                Resultado=precioProducto*ConDescuento;
                ImprimirPorPantalla(Resultado);
        }else{
          Resultado=precioProducto*SinDescuento;
            ImprimirPorPantalla(Resultado);
        }
    }
    private static final double SinDescuento = 0.95;
    private static final double ConDescuento = 0.8;

    private void ImprimirPorPantalla(double Resultado) {
        System.out.println("El total a pagar es:"+Resultado);
        System.out.println("Envido");
    }
}
