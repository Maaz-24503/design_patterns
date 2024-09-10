package Factory;

public class Product1Factory implements ProductFactory{

    @Override
    public Product createProduct() {
        return new Product1();
    }
}
