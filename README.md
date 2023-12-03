## Exercise: Thread-Safe Singleton Design Pattern 

### Objective:
To practice implementing a thread-safe Singleton design pattern in Java and understand how to ensure that the Singleton instance is created safely in a multithreaded environment.

### Instructions:

1.	Modify the SingletonExample class from the previous exercise to make it thread-safe.
2.	Use the double-checked locking mechanism or another thread-safe approach to ensure that multiple threads cannot create separate instances of the Singleton class.
3.	Create a client class named ThreadSafeSingletonClient that uses multiple threads, each trying to obtain and display the message from the Singleton instance.
4.	Observe that all threads should be able to access the same instance of the Singleton class without creating multiple instances.
