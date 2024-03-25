package lesson23.homeWork23;

import java.util.ArrayList;
import java.util.List;

public abstract class SampleDocument {
    protected int id;
    protected List<ProductAndCount> products;

    protected Manager manager;

    public SampleDocument(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public List<ProductAndCount> getProducts() {
        return products;
    }

    public void add(Product product, int count) {
        products.add(new ProductAndCount(product, count));
    }
}
