# Programming Paradigms
## Object-oriented programming with Java

## Practical 5: Abstract classes and interfaces


1. Adapt your class _SaleItem_ from the [previous practical](../prac4/) so that it is an abstract class. Include an abstract method _getPrexTaxPrice_ which is implemented in each of the concrete subclasses _FracItem_, _WholeItem_ and _SecondHandItem_. Use this method to implement the method _getPostTaxPrice_ in the _SaleItem_ class.

2. Write a _compareTo_ method for the _SaleItem_ class, so that it implements the [Comparable interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html), comparing the post tax price.

3. Use the _sort_ method from [java.util.Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) to sort a _Basket_ into order based on the post tax price of its constituents.

4. There are two versions of the _sort_ method in [java.util.Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html), the second of which takes a [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html) object as a parameter. Create an object which implements the _Comparator_ interface  from java.util to compare _SaleItem_ objects alphabetically by name, rather than by price. Use this _Comparator_ to sort a _Basket_ by name rather than by price. Note that there are two ways to do this:
* Write a separate class _NameComparator_ which has only one method and no fields
* Create an anonymous inner class, as shown in the lecture on GUIs.

5. In your code you will most likely have used the _ArrayList_ class, which implements the _List_ interface. You could change _ArrayList_ to _LinkedList_ throughout, which would be worse for performance for reading large lists. Alternatively you could change some of your _ArrayList_ definitions to use _List_ interface instead. Where can you change _ArrayList_ to _List_ and why?
