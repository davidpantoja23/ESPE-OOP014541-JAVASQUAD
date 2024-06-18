
package ec.edu.espe.billingsystem.model;
import java.util.Objects;
/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class InvoiceLine {
    private Product product;
    private int quantity;

    public InvoiceLine(Product product, int quantity) {
        this.product = Objects.requireNonNull(product, "Debe seleccionar al menos un producto");
        if (quantity < 0) {
            throw new IllegalArgumentException("Debe seleccionar un número positivo");
        }
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "product=" + product + ", quantity=" + quantity + '}';
    }
}
