Dependency Inversion Principle

High level modules SHOULD NOT depend on low level modules.
Both should depend on abstraction.

Abstractions should not depend on details. Rather details should
depend on abstractions.

Dependency direction:

Without DIP (HL depends on direct implementation on LL module)

High Level  ---depends on--->   Low level

With DIP

High Level ---depends on---> Abstraction <---on depends--- Low Level