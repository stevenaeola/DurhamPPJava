# Programming Paradigms
## Object-oriented programming with Java

## Practical 4: Inheritance

## Instructions

This practical focuses on __inheritance__ and __class hierarchy__. You will need to download the [DoME-v3](dome-v3) example, which follows chapter 8 of the bluej book.

### Part 1: DoME

1. Adapt  the DoME example provided. 
  * Update the `createDatabase` method to add some DVDs to the database
  * Update the _DVD_ class so that the `print()` method works the same way as the _CD_ class `print()` method and test this by calling the _Database_ class `list()` method from `createDatabase`
  * Write a class _VideoGame_ that can be added to the list of items in the database and test this works using the `list()` method.

2. There is a flaw in the design of the DoME project. For example
`playingTime` should not be used for for a video game. Change the design and implementation to
solve this problem. If you see other problems make the necessary changes, you should justify your
choices (note that `playingTime` should still be used for DVDs and CDs).

### Part 2: Sale items

1. A company sells a range of items. Customers make purchases via
the company web site. The site provides descriptions of items and prices before and after VAT.
Some items can only be purchased as a whole unit (such as a phone) whereas other items can be
purchase as fraction of units (such as fabrics). All items on sale have a reference ID, a name, a description
and a VAT value (percentage). Items such as phone have a price per unit, items such as fabrics have
a price per unit and a unit measure (for example metre, or kg). 
 * Design and implement the classes _WholeItem_ for
items such as phone, _FracItem_ for items such as fabrics and any other classes that may be needed.
 * Instance methods should be provided for obtaining the price before and after tax for a single unit, and for obtaining a printable _String_ representation.


2. The company also sells second-hand items. Only _WholeItem_ objects
can be sold as second-hand. Second-hand items can vary in condition. Each item is given a grade
between 1 and 5. A grade one item is in as new condition. A grade 5 item is in poor condition,
typically cosmetically damaged but working. The ex-VAT price of a second-hand item is based on
the ex-VAT cost new. Depending on grade, a discount is applied.

| Grade | Discount|
|-------|---------|
| 1     | 10%     |
| 2     | 20%     |
| 3     | 30%     |
| 4     | 50%     |
| 5     | 70%     |

 * Using your design from the previous part, design the _SecondHandItem_ class.
 * Design and implement a class _Basket_ that stores items selected by the customer. Instance methods should be provided for obtaining the price before and after tax of the content of the basket, and for obtaining a printable _String_ representation (for example one item per line).

