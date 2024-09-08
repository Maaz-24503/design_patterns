# N-ton Design Pattern - Java Implementation

This project demonstrates the **N-ton** design pattern, a variation of the Singleton pattern. Instead of allowing only one instance of a class, the N-ton pattern allows for the creation of a fixed number `N` instances, which are reused as needed. Once the limit of `N` instances is reached, any request for an additional object will reuse an existing one from a pool.

## Key Concepts

- **Object Pooling**: Objects are stored in a pool using a `Queue` (`ConcurrentLinkedQueue`), ensuring that once `N` instances are created, they are reused instead of creating new ones.
- **Concurrency Control**: A `Semaphore` is used to ensure that no more than `N` objects are accessed concurrently, making the system thread-safe.
- **Object Lifecycle Management**: The pattern tracks the creation and availability of objects, providing a simple mechanism to acquire and release instances.

## Features

- **Fixed Instance Count**: The system creates exactly `N` objects, reusing them as needed without ever exceeding the limit.
- **Thread-Safe**: Thanks to the use of `Semaphore` and synchronized blocks, the system is safe for use in multithreaded environments.
- **Resource Efficient**: Object reuse reduces the need for excessive memory allocation and deallocation, making the system more efficient.

## Usage

To use the **N-ton** class, follow these simple steps:

1. **Acquire an Instance**: 
   - Use the `getInstance()` method to acquire an object from the pool.
   - If fewer than `N` objects exist, a new one is created. Otherwise, an existing object is reused.

   ```java
   Nton instance = Nton.getInstance();

2. **Release an Instance**: 
   - Once you are done using the object, call `releaseInstance()` to return it to the pool for future reuse.

   ```java
   instance.releaseInstance();