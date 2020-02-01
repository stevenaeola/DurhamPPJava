# Programming Paradigms
## Object-oriented programming with Java

## Practical 2

### Instructions

Download the classes from github and put them into a bluej project. 

### Level 1: Play with Expressions in the Biogram

1. Compile all the classes and construct a BioGram with parameters width=500, height=200

2. Admire the pretty pattern

3. Adapt the CountExpr class to make your own ways of stepping and finishing: try changing the values of the constants and the mathematical functions used

4. You will need to re-compile CountExpr and BioGram (why?) to run your own example

5. Come up with your own CountExpr class. Basically this means rewriting the methods from scratch rather than tnikering with them. You might also add some other fields which are used. The produced Biogram should look good, or perhaps be generated in some artistic way.

6. Have a look at the Pixel class and see if you can work out what it's doing. To understand this you will need a knowledge of binary, so miss this out if you don't already know about binary.

### Level 2: Expressions with numbers

1. In a new project define a new class called _Calculation_

2. Without writing any fields or constructors, write two get methods to return:

  * number of hours in a week
  * number of seconds in a year

3. Add to the _Calculation_ class two real-number fields called _x_ and _y_

  * Write a constructor for the the class
  * Write get and set methods for _x_ and _y_

4. Write more methods which do calculations with _x_ and _y_:
   * Find the average of _x_ and _y_
   * Find the the maximum of _x_ and _y_
   * Swap the values of _x_ and _y_
   * Given quadratic coefficients _a_, _b_ and _c_, put the roots of the quadratic equation into the _x_ and _y_


### Level 3: Harder problems


1. Write a method `xIsOdd` which returns true if and only if x is indeed an odd number.

2. Write a method which takes as a parameter a date String in the format MM/YYYY. Set _x_ to be the month and _y_ to be the year. Adapt it so that it works if the year is given as either two digits or four digits.
 
  __Hint:__ you will need to use methods from the _String_ class. All methods for the _String_ class can be found through the [Java API documentation](https://docs.oracle.com/javase/7/docs/api/index.html?java/lang/String.html).
  
3. Write a method `coins` that returns the minumum number of coins required to make up the value stored in _x_ (in pence).



