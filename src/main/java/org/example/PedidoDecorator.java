package org.example;

public abstract class PedidoDecorator implements Pedido{

    private Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public PedidoDecorator() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract double getPcCusto();

    @Override
    public double calcularCusto() {
        return this.getPedido().calcularCusto() * (1 + this.getPcCusto());
    }
}
