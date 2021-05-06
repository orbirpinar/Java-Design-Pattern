# Head First Design Pattern

### Decorator  Pattern

> **The Decorator Pattern** attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

> **Design Principle**
>
> Classes should be open* *for extension, but closed for modification.*

> __Be careful when choosing the areas of code that need to be extended; applying the Open-Closed Principle EVERYWHERE is wasteful, unnecessary, and can lead to complex, hard to understand code.__

​

#### __Example of StarBuzz Coffe__

![Tux, the Linux mascot](https://i.stack.imgur.com/ctCkm.png)

1. We start with our DarkRoast object.

    - Remember that DarkRoast inherits from Beverage and has a cost() method that computes the cost of the drink.

2. The customer wants Mocha, so we create a Mocha object and wrap it around the DarkRoast.

    - The Mocha object is a decorator. Its type mirrors the object it is decorating, in this case, a Beverage. (By “mirror”, we mean it is the same type..)
    - So, Mocha has a cost() method too, and through polymorphism we can treat any Beverage wrapped in Mocha as
      a Beverage, too (because Mocha is a subtype of Beverage).

3. The customer also wants Whip, so we create a Whip decorator and wrap Mocha with it.

    - Whip is a decorator, so it also mirrors DarkRoast’s type and includes a cost() method.
    - So, a DarkRoast wrapped in Mocha and Whip is still a Beverage and we can do anything with it we can do with a DarkRoast, including call its cost() method.

4. Now it’s time to compute the cost for the customer. We do this by calling cost() on the outermost decorator, Whip, and Whip is going to delegate computing the cost to the objects it decorates. Once it gets a cost, it will add on the cost of the Whip.


