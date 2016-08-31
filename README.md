# DesignPattern
Simple design pattern implementation

# Creational
 - Abstract factory: use abstract class to implement common method and an abstract method for each concert subclass

 
### Factory method pattern
Factory method pattern is to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method rather than by calling a constructor.
  - Example: [Pizza shop]
 
### Abstract factory pattern


## Structural

### Adapter Pattern
The Adapter Pattern converts the interface into another.

#### Class (Inheritance) vs Object Adapter (Composition)
* The Class adapter uses multiple inheritance, cannot do it in Java. 
* The Object adapter implements the target interface. When it gets called, it turns around and delegates the calls to adaptee (old) method.

### Decorator Pattern
Add new behavior to the interface


### Facade Pattern
The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level interface that makes the subsystem easier to use. 

In another word, it provides a simplified interface for clients to subsystem's functions.

A good advantage is if subsystem code changed, the client code doesn't need to change, only facade.