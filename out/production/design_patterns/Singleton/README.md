### Singleton Design Pattern - Java Implementation

This project demonstrates a thread-safe, optimized Singleton pattern in Java.

#### Overview
The Singleton design pattern ensures that a class has only one instance and provides a global point of access to it. This implementation uses **double-checked locking** to minimize synchronization overhead while maintaining thread safety.

#### Features
- **Lazy Initialization**: The instance is created only when it is first requested.
- **Thread-Safe**: The `synchronized` block ensures that only one thread can initialize the instance at a time.
- **Double-Checked Locking**: Reduces the cost of synchronization by checking the instance twice, ensuring that synchronization occurs only during the initial creation.

#### Methods
- `Singleton getInstance()`: Returns the single instance of the class. It performs a check to create the instance only when necessary.

#### Usage
```java
Singleton instance = Singleton.getInstance();
