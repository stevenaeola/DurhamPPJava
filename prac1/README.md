# Programming Paradigms
## Object-oriented programming with Java

## Practical 1

### Instructions

BlueJ is available on the CIS machines in the laboratories and you can also install it on your own machines by downloading it from 

<http://www.bluej.org>.

### Scenario: Botanic Gardens

_Read through the scenario and think about the design first. Afterwards you will implement the classes in python, JavaScript (optionally) and Java._

The University Botanic Gardens need a computer system for maintaining
information on stocks of flower seeds and plantings. They will use the system
to determine such things as when to order new stocks, when to sow seeds, in
which beds seeds have been sown, and when they are expected to bloom.

#### Step 1: Modelling Types of Flower

The system must maintain information on all the species of flowering plant in
the gardens. The data for a species consists of its name, its genus and its
family, the best month for sowing seeds, and an estimate of the time it takes
from sowing to bloom. Assuming that a species data type is required, propose
a name for the class, propose suitable fields, propose methods for reporting
their values (give the method signatures and brief notes on behaviour).

#### Step 2: Modelling Flower Beds

Information needs to be stored on flower beds. A bed has a size, usually
expressed in square metres and an alphanumeric identity such as "bed15".
Often a bed is not used in its entirety so the actual area in use has to be
recorded. When seeds or seedlings have been planted this figure must be
updated. Assuming that a flower bed data type is required:

1. propose a name for the class,
2. propose suitable fields,
3. propose likely methods for manipulating the data (in each case give the
signature and note the behaviour).

#### Step 3: Stock Records
The system must keep track of the quantities of seeds in stock. Each stock
record consists of the quantity, the species, and a best before date. Records
are updated when seeds are sown. Your challenge is as with the earlier
exercises. A point to note for this one is that, you can assume the existence of
other data types to make the task easier.

#### Step 4: Planting Records
A planting record is used to keep track of what seeds have been planted
where and when. In more detail, a planting occurs in a particular bed and it
comprises a certain quantity of a particular species of flowering plant. The
date of planting is required so the date for the first blooms can be estimated.
See what you can figure for fields and methods. 

## Implementation

### python

Using whichever IDE you prefer, write python classes to implement the botanic garden. If you don't know the syntax, check it out in the [python documentation](https://docs.python.org/3/tutorial/classes.html).

### JavaScript

If you are familiar with JavaScript (i.e. you took Programming last year) then come up with a set of JavaScript class definitions for the same example

### Java

Finally, produce a corresponding set of Java classes. Again, you can choose whichever IDE you want. Visual Studio Code is a possibility, but requires a [Java plugin](https://code.visualstudio.com/docs/java/java-tutorial) to be installed to make this work well. This may or may not work on CIS machines. Eclipse is a large and powerful professional-grade IDE often used with Java and other languages, and is installed on CIS machines, but is quite heavyweight. NetBeans and IntelliJ are also popular. If you want 'simple' go with bluej.

Remember:

- every class needs to be its own file with the same name as the class
- everything needs a type (fields, parameters, method returns, local variables)
- visibility modifiers (public, private) are recommended for classes, fields, constructors and methods - you will get a default visibility modifier otherwise
- youtube is your friend. There is a [set of videos](https://www.youtube.com/user/objectsfirstwithjava) by the people who wrote bluej. They are fairly gentle, as they are aimed at beginner programmers

## Running a program

In Java, everything sits inside a class. So how do you get things going? bluej provides a means for constructing objects (calling a constructor) and then calling methods on created objects. In other IDEs (and in real life) you will need to write something like the main method you have learnt in C. The signature of the main method is

```java
public static void main (String[] args)
```

You can [watch the video](https://www.youtube.com/watch?v=u2MNFJEz7FA) about that if you want. Typically the main method creates some objects and calls some methods on the created objects.

Once you've got a main method you can call it via bluej by right-clicking on the relevant class (normal methods are accessed ny right-clicking on an object).

More 'grown-up' tools like Eclipse have a build/run button which compiles the relevant class(es) and runs the main method. If you haven't already tried that, give it a go now.

## Things to think about

* What do main methods look like in python and JavaScript?
* What advantages and disadvantages are there to having type declarations in Java?
* Is it possible to change a class definition at run-time?


