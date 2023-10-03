package org.example;

public class PedidoOnline implements Pedido{


    public double custoTotal;


    public PedidoOnline(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    @Override
    public double calcularCusto() {
        return this.custoTotal;
    }
}
