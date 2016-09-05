# Behavioral Design Pattern
## State Pattern
The State Pattern allows an object to alter its behavior when its internal state changes. Theb object will appear to change its class.

### State Pattern vs Strategy Pattern
  - With the State Patter, we have a set of behaviors encapsulated in state obbjects; at anyt time the context is delegating to one of these states. Over time, the current state changes across the set of state objects to reflect the internal state of the context, so the context's behavior changes over time as well. The client usually knows very little about the state objects.
  - With Strategy, the client usually specifies the strategy object that the context is composed with. Now, while the pattern provides the flexibility to change the strategy object at runtime, often there is a strategy object that is most appropriate for a context object. 
  - In general, think of the **Strategy Pattern** as a flexible alternative to subclassing; if you use inheritance to define he behavior of a class, then you're stuck with that behavior even if you need to change it. With **Strategy** you can change the behavior by composing with a different object.
  - Think of the **State Pattern** as an alternative to putting lots of conditionals in your context; by encapsulating the behavior within state objects, you can simply change the state object in context to change its behavior