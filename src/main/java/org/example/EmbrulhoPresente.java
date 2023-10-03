package org.example;

public class EmbrulhoPresente extends PedidoDecorator{

    public EmbrulhoPresente(Pedido pedido) {
        super(pedido);
    }


    @Override
    public double getPcCusto() {
        return 0.05;
    }
}
