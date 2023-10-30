## Inversion of Control (IoC) or Dependency Injection (DI)
A typical java based enterprise application consists of a number of java classes. To accomplish its designated functionality, each java class (A.java) may depend on one or more other java classes. These other java classes are known as dependencies of the java class A.  Generally, each class takes the responsibility to obtain the references of the classes it depends upon. This leads to highly coupled application.

Spring framework helps in developing the loosely coupled applications by delegating the responsibility of acquiring the dependencies of a java class to the Spring container and allowing the java class to focus only on its designated functionality. The Spring container injects the dependencies into the java class as the container is initialized (usually on application start up.)

Dependency injection is also known as inversion of control. Instead of java class obtaining their dependencies from the container, it is the container who is injecting the dependencies in the java class. So there is an inversion of control