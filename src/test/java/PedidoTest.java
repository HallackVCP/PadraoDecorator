import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {


    @Test
    void deveRetornarCustoPedidoSimples(){
        Pedido pedido = new PedidoOnline(200.0);
        assertEquals(200.0, pedido.calcularCusto());
    }

    @Test
    void deveRetornarCustoPedidoEmbrulhoPresente(){
        Pedido pedido = new EmbrulhoPresente(new PedidoOnline(200.0));
        assertEquals(210.0, pedido.calcularCusto());
    }

    @Test
    void deveRetornarCustoPedidoGarantiaExtendida(){
        Pedido pedido = new GarantiaExtendida(new PedidoOnline(200.0));
        assertEquals(230.0, pedido.calcularCusto(), 0.1);
    }
    @Test
    void deveRetornarCustoPedidoEntregaExpressa(){
        Pedido pedido = new EntregaExpressa(new PedidoOnline(200.0));
        assertEquals(220.0, pedido.calcularCusto(), 0.1);
    }
    @Test
    void deveRetornarCustoPedidoEntregaExpressaGarantiaExtendida(){
        Pedido pedido = new GarantiaExtendida(new EntregaExpressa(new PedidoOnline(100.0)));
        assertEquals(126.5, pedido.calcularCusto(), 0.1);
    }
    @Test
    void deveRetornarCustoPedidoEntregaExpressaEmbrulhoPresente(){
        Pedido pedido = new EmbrulhoPresente(new EntregaExpressa(new PedidoOnline(100.0)));
        assertEquals(115.5, pedido.calcularCusto(), 0.1);
    }
    @Test
    void deveRetornarCustoPedidoEntregaExpressaGarantiaExtendidaEmbrulhoPresente(){
        Pedido pedido = new EmbrulhoPresente(new GarantiaExtendida(new EntregaExpressa(new PedidoOnline(100.0))));
        assertEquals(132.82, pedido.calcularCusto(), 0.1);
    }
    @Test
    void deveRetornarCustoPedidoGarantiaExtendidaEmbrulhoPresente(){
        Pedido pedido = new GarantiaExtendida(new EmbrulhoPresente(new PedidoOnline(100.0)));
        assertEquals(120.75, pedido.calcularCusto(), 0.1);
    }
}
