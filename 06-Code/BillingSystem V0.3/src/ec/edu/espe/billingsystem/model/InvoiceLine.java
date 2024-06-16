
package ec.edu.espe.billingsystem.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class InvoiceLine {
    private Product product;
    private int quantity;

    public InvoiceLine(Product product, int quantity) {
        this.product = Objects.requireNonNull(product, "Product cannot be null");
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
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
