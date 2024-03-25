package lesson23.homeWork23;

public class ToWarehouse extends SampleDocument{
    public ToWarehouse(int id) {
        super(id);
    }

    public void toWarehouse(Warehouse warehouse, Manager manager) {
        if (this.manager != null) {
            return;
        }
        warehouse.addAll(products);
        this.manager = manager;
    }
}
