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

4. Primitive data types

Primitive data types are the most basic data types.

Whole numbers - byte, short, int, long

Real numbers - float, double

Single Character - char

Boolean value - boolean

We should consider these types as the building blocks of data manipulation.

Primitive data types are simply placeholders in memory for a value.

What is integer?

Integer is a whole number, meaning it does not contain a fractional element or a decimal.

Consider valid ranges as well.

int myMinIntValue = Integer.MIN_VALUE;
int myMaxIntValue = Integer.MAX_VALUE;

System.out.print("Integer Minimum Value = " + myMinIntValue);
System.out.print("Integer Minimum Value = " + Integer.MIN_VALUE);

The plus sign, +, when used in System.out.print will print different data types together as a single line of text.

System.out.print (" Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );

5. Classes

What is a class?

It's a template used to create objects and to define object data types and methods.

Java uses the concept of a wrapper class, for all of its eight primitive data types.

System.out.print("Busted Max value = " + (myMaxIntValue + 1));

Java overflows and underflows.

int myMaxIntTest = 214748368
Error:
integer number too large

We get this since the max is 214748367.

In Java, you cannot put commas in a numeric literal, we can use "_".

2_147_483_67

6. Whole numbers

Byte, short, int, long

byte range (-128, 127)

short range (-32768, 32767)

Size, or Width, is the amount of space that determines (or limits) the range of values.

A byte, can store 256 numbers and occupies eight bits, and has a width of 8.
A short, can store a large range of numbers and occupies 16 bits, and has a width of 8.

long myLongValue = 100;

Really an int.

long myLongValue = 100L;

Suffix for long numbers. - L

System.out.print(" Along has a width of " + Long.size);

A numeric literal that exceeds Integer.MAX_VALUE must use the "L" suffix.

We cannot create a number literal in Java, that exceeds Integer.MAX_VALUE, without using the "L" suffix.

 */

/* Casting in Java */

//declare and initialise the variable in the same line;

/*
short myMinShortValue = Short.MIN_VALUE;
int myMinIntValue = Integer.MIN_VALUE;

byte myMinBiteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

// you cannot declare variables with different data types in a single statement;
// if you declare multiple variables of the same data type in a single statement,
// you must specify the data type only once before any variable names;

// short firstShort = 1, int firstInteger =2;
// gives an error
// short firstShort = 1; int firstInteger = 2;
// correct, doesnt give an error;

int myTotal = (myMinIntValue /2);
byte myNewByteValue = (myMinBiteValue /2);
//error;
//the java compiler does not attempt to evaluate the value, in a variable,
//when it's used in a calculation, so it doesnt know if the value fits, and throws an error.

//if your calculation uses literal values, java can figure out the end result at compile time, and whether it fits into the variable,
//and won't throw an error if it does;

//in both examples, an int result is being returned from calculation, but in the second example,
//java knows the returned value can fit into a byte.

//casting, means to treat or convert a number, from one type to another.
//we put the type we want the number to be, in parentheses like this:
//(byte) (myMinByteValue /2);

//other languages have casting too, common practice and not a java thing.

byte myNewByteValue = (byte) (myMinBiteValue /2);
//treating as a byte, instead as na int, which is by default;

short myNewShortValue = (short) (myMinShortValue /2);
 */;

 /* java challenge 1 */

/*
jshell> byte myByte = 127
myByte ==> 127

jshell> short myShort = 30000
myShort ==> 30000

jshell> int myInt = 200000
myInt ==> 200000

jshell> long myLong = myByte + myShort + myInt
myLong ==> 230127
 */