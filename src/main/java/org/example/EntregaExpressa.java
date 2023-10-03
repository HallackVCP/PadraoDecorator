package org.example;

public class EntregaExpressa extends PedidoDecorator{

    public EntregaExpressa(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getPcCusto() {
        return 0.10;
    }
}
