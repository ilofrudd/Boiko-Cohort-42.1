package lesson23.homeWork23;

public class FromWarehouse extends SampleDocument{
    public FromWarehouse(int id) {
        super(id);
    }

    public void add(Order order) {
        products = order.getProducts();
    }

    public void fromWarehouse(Warehouse warehouse) {
        warehouse.deleteAll(products);
    }
}
