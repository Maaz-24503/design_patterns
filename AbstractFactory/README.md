### Abstract Factory Design Pattern - Java Implementation

This project demonstrates the **Abstract Factory** design pattern in Java, which provides a way to encapsulate a group of related products (objects) without specifying their concrete classes. This pattern is useful for creating families of related objects, where the exact types of the objects are determined by the factory.

#### Overview
The Abstract Factory pattern allows for the creation of a set of related products (e.g., `ProductA` and `ProductB`) without requiring knowledge of their concrete implementations. Each concrete factory corresponds to a specific variant of the product family.

#### Components

- **AbstractFactory Interface**: Defines the methods for creating abstract products (`createProductA()` and `createProductB()`).

- **Abstract Products**: `AbstractProductA` and `AbstractProductB` are base classes that define the general structure of the products.

- **Concrete Products**: `ProductA1`, `ProductA2`, `ProductB1`, `ProductB2` are the actual implementations of the abstract products. Each represents a different variant of the products.

- **Concrete Factories**: `ProductFactory1` and `ProductFactory2` are concrete factories responsible for creating specific product families. `ProductFactory1` creates `ProductA1` and `ProductB1`, while `ProductFactory2` creates `ProductA2` and `ProductB2`.

#### Features
- **Encapsulation of Object Creation**: The client does not need to know which specific concrete product is being created. It interacts with the abstract products.

- **Easy Extensibility**: New product variants or factories can be added without altering existing code.

#### How it Works
1. The client selects a product type (1 or 2).
2. Depending on the selection, either `ProductFactory1` or `ProductFactory2` is instantiated.
3. The factory creates the related product family (`ProductA` and `ProductB`).
4. The products' information is printed via the `printInfo()` method.

#### Usage

```bash
Select type for products (1 or 2)
```
For example selecting `1` will result in the creation of products `A1` and `B1`

```java
AbstractProductA prodA = factory.createProductA(); // Creates ProductA1
AbstractProductB prodB = factory.createProductB(); // Creates ProductB1
prodA.printInfo(); // Output: "This is Product A type 1"
prodB.printInfo(); // Output: "This is Product B type 1"
```
