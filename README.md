# Java_Basic_To_Advance

A tutorials and example of java codes



#Java is an Object Oriented language

Object oriented programming is a way of organizing programs as collection of objects, each of which represents an instance of a class.

4 main concepts of Object Oriented programming are:

    Abstraction
    Encapsulation
    Inheritance
    Polymorphism
##Simple

Java is considered as one of simple language because it does not have complex features like Operator overloading, Multiple inheritance, pointers and Explicit memory allocation.
##Robust Language

Robust means reliable. Java programming language is developed in a way that puts a lot of emphasis on early checking for possible errors, that’s why java compiler is able to detect errors that are not easy to detect in other programming languages. The main features of java that makes it robust are garbage collection, Exception Handling and memory allocation.
##Secure

We don’t have pointers and we cannot access out of bound arrays (you get ArrayIndexOutOfBoundsException if you try to do so) in java. That’s why several security flaws like stack corruption or buffer overflow is impossible to exploit in Java.
Java is distributed

Using java programming language we can create distributed applications. RMI(Remote Method Invocation) and EJB(Enterprise Java Beans) are used for creating distributed applications in java. In simple words: The java programs can be distributed on more than one systems that are connected to each other using internet connection. Objects on one JVM (java virtual machine) can execute procedures on a remote JVM.
##Multithreading

Java supports multithreading. Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilisation of CPU.
Portable

As discussed above, java code that is written on one machine can run on another machine. The platform independent byte code can be carried to any platform for execution that makes java code portable.
### Overflow
Overflow occurs when we assign such a value to a variable which is more than the maximum permissible value.

### Underflow
Underflow occurs when we assign such a value to a variable which is less than the minimum permissible value.

JVM does not throw any exception in case Overflow or underflow occurs, it simply changes the value. Its programmer responsibility to 
check the possibility of an overflow/underflow condition and act accordingly. 

```
Example (Overflow):
```
Consider the case of int variable, it is of 32 bit and any value which is more than Integer.MAX_VALUE (2147483647) is rolled over. 
For example, Integer.MAX_VALUE + 1 returns -2147483648 (Integer.MIN_VALUE).

As int data type is 32 bit in Java, any value that surpasses 32 bits gets rolled over. In numerical terms, it means that after incrementing 1 on Integer.MAX_VALUE (2147483647), the returned value will be -2147483648. In fact, you don't need to remember these values and the constants Integer.MIN_VALUE and Integer.MAX_VALUE can be used.

### Underflow of int
Underflow is the opposite of overflow. While we reach the upper limit in case of overflow, we reach the lower limit in case of underflow.
Thus after decrementing 1 from Integer.MIN_VALUE, we reach Integer.MAX_VALUE. Here we have rolled over from the lowest value of int to the maximum value.

For non-integer based data types, the overflow and underflow result in INFINITY and ZERO values.


### useful links for learning java


* [Beginnersbook](https://beginnersbook.com/2013/05/java-introduction/)