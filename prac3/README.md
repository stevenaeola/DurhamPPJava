# Programming Paradigms
## Object-oriented programming with Java

## Practical 3: Collections

### Part 1: Designing a Person

One of the advantages of objects is the ability to encapsulate data specific to
that object and then reuse it in multiple places. A good example of this is an
object representing a person that can be used in many applications. Design a
_Person_ class that could be used by many applications, thinking about the
properties that are common to a person regardless of the application.
When you are happy with your model, you can implement it, including fields, constructor, get and set methods.

__Info:__ There are some special method signatures associated with all classes
created in Java that we can write code for. One of these is a method to return
a _String_ describing the current state of the object. The method signature for
this is:

```java
public String toString()
```

Like the constructor, this method is called automatically for us. In this case,
the method is called when we want to print out an instance of the class. This
method returns the _String_ that should describe the current state of the object.
For example, if we had an instance of class _Person_ called `pip`, when we do

```java
System.out.println(pip)
```

we want it to give something meaningful, such as their name and age. To do
this, the `toString` method might look something like:

```java
public String toString(){
 return "My name is " + name + " and I am " + age +
"years old." ;
}
```

Add a `toString` method for your _Person_ class.

### Part 2: Modelling an application

Select one of the applications below to link your Person into, or choose one of your own (that involves people). An example of a
possible class structure for the library application is shown below.

![Library Class Structure](libraryClassStructure.png "Library Class Structure")

When you have written your model, draw out the class diagrams to show how
they link together. All of these applications will require the use of lists.

1. __Bank__ A bank has many accounts, each of which are associated with a
person. The accounts should each have a unique account number, and
remember a list of transactions. 

2. __Library__ Libraries have lots of books. They have a
list of members that are associated with a person and each member has a
limit on how many items they can borrow, along with a record of what they
currently have out on loan and possibly their loan history. They should be able
to print out due dates for each member.

3. __Restaurant__ A restaurant will have a menu of items that people can order,
along with tables around which people are sat. Each table will have orders
associated with it and should be able to print a bill of all the items ordered and
give the total cost. The items on the menu each have a price, description,
whether they are vegetarian/ spicy and how much they cost.

You should now be able to implement your model for each of the
classes required using the _ArrayList_ data type.
Remember, the `java.util.ArrayList` class needs to be imported
to make use of _ArrayList_. A new _ArrayList_ can then be defined using:

```java
ArrayList<String> listname = new ArrayList<String>();
```

Where _String_ can be replaced with any _Object_ data type. Some useful
methods that can be applied to lists are:

* `size()`
* `add(object)`
* `get(int index)` 

Details on these methods and others can be found on the Java API at:
<http://docs.oracle.com/javase/8/docs/api/>

Use the `for` loop to write a method to print out all of the people used in your model (e.g. all the customers in the bank).


### Part 3: A List of People

Now you have a class which includes a list of people (an
`ArrayList<Person>` to be precise). Make sure you have `getAge()`
and `getName()` methods in your _Person_ class. Then write methods
to find the following, making sure you return a value rather than
printing value:

1. The name of the oldest person (the first one, if more than one person shares the greatest age).
2. The average (mean) age of the group.
4. A list of all people who are at least 18 years old.
6. The median age i.e. the middle age if people are put in order of age.
For now you can assume that everybody has a different age. __Hint:__ you could use your answer to the previous part. Or, use the [sort method](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List))
7. Write a main method which creates the list of people, executes these methods and displays the results.
