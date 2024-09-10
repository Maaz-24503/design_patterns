package Factory;

public class Product2Factory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Product2();
    }
}
