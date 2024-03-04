class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// working in jshell, but moving here
/* start commenting

1. Statements.

It's a complete command to be executed. It can include one or more expressions.

Example:
System.out.print("Hello World");

Challenge:

System.out.print("Hello, Zhoro.");

end commenting

2. Variables and keywords.

A keyword is any one of a number of reserved words, that have a predefined meaning in the Java language.

In Java syntax, all code is case-sensitive, and this includes keywords.

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

What are variables?

Variables are a way to store information in our computer.
Variables that we define in a program, can be accessed by a name we give them, and the computer does the hard work,
of figuring out where they get stored, in the computer's random access memory, or RAM.

There are lots of different types of data, that we can define for our variables, collectively known as data types.

Some data types are keywords in Java.

int myFirstNumber = 5;

3. Expressions

What is an expression?

An expression is a coding construct, that evaluates to a single value.

Variable challenge, print myFirstNumber.

myFirstNumber = 5;
System.out.print(myFirstNumber);

myFirstNumber = 10;
System.out.print(myFirstNumber);

myFirstNumber = 1000;
System.out.print(myFirstNumber);

This is allowed within JShell, but a java compiler or any IDE wouldn't allow this.

myFirstNumber = 10 + 5;

myFirstNumber = (10 + 5) + (2 * 10);

The expression is the code segment that is on the right side of the equals sign in an assignment or declaration statement.

Challenge:
Create 2 variables, mySecondNumber with a value of 12, myThirdNumber with a value of 6.

int mySecondNumber = 12;
int myThirdNumber = 6;

/var JShell will show all created variables in the session.

int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

myThirdNumber = myFirstNumber * 2;

Challenge:

Create a new variable and call it myLastOne, with data type of int, set to 1000 - myTotal variable. Print the value of it.

int myLastOne = 1000;
System.out.print(myLastOne - myTotal);
 */

