# Strutural Design Pattern
## Composite Pattern
The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects **uniformly**.

In Order for the composite to work transparently to the client, you must implement the same interface for all objects in the composite.

The clients don't have to worry about whether they're dealing with a composite object or a leaf object, so they don't have to write if statements everywhere to make sure they're calling the right methods on the right objects. 