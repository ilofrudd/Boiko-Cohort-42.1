package lesson23.homeWork23;

public class ToWarehouse extends SampleDocument{
    public ToWarehouse(int id) {
        super(id);
    }

    public void toWarehouse(Warehouse warehouse) {
        warehouse.addAll(products);
    }
}
