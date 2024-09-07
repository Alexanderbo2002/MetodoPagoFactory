public class PayPalFactory extends MetodoPagoFactory {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PayPal();
    }
}
