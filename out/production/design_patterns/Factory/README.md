# Factory Pattern Example

This repository demonstrates the **Factory Design Pattern** in Java. The Factory Pattern provides a way to encapsulate object creation, making it easier to manage, extend, and maintain code for different types of products.

## Project Structure

The code is organized into the following components:

- `Product` (Abstract class)
- `Product1` and `Product2` (Concrete product implementations)
- `ProductFactory` (Interface for factory classes)
- `Product1Factory` and `Product2Factory` (Concrete factory classes)

### Example Usage

You can use the factories to create and work with different product types without needing to know their specific implementation:

```java
public class Main {
    public static void main(String[] args) {
        ProductFactory factory1 = new Product1Factory();
        Product product1 = factory1.createProduct();
        product1.printInfo();  // Output: This is the first product type

        ProductFactory factory2 = new Product2Factory();
        Product product2 = factory2.createProduct();
        product2.printInfo();  // Output: This is the second product type
    }
}
```
### How It Works

- **Abstract Product (`Product`)**: Defines a common interface for all product types.
- **Concrete Products (`Product1`, `Product2`)**: Implement the abstract `Product` class.
- **Factory Interface (`ProductFactory`)**: Declares a method for creating products.
- **Concrete Factories (`Product1Factory`, `Product2Factory`)**: Implement the factory interface to create specific product types.

This design allows for easy scalability and flexibility. You can add new product types by creating new concrete product and factory classes without modifying existing code.
