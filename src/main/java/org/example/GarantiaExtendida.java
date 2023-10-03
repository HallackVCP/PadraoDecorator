package org.example;

public class GarantiaExtendida extends PedidoDecorator{


    public GarantiaExtendida(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getPcCusto() {
        return 0.15;
    }
}
