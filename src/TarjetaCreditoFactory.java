public class TarjetaCreditoFactory extends MetodoPagoFactory {
    @Override
    public MetodoPago crearMetodoPago() {
        return new TarjetaCredito();
    }
}
