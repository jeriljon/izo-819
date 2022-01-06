### Topics

### References

Local Variable Type Inference Style Guidelines: https://openjdk.java.net/projects/amber/guides/lvti-style-guide

### Var Rules

+ var is used as a local variable in a constructor, method or initializer block
+ var cannot be used in constructor parameters, method parameters, instance variables or class variables
+ var is always instantiated on the same line (or statement) where it is declared
+ var value can change but declared type cannot change
+ var cannot be initialized with a null value without a type
+ var is not permitted in multiple variable declarations
+ var is a reserved type name but not a reserved word, meaning it can be used as an identifier except as a class, interface or enum name
