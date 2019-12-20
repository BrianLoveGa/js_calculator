// code in java, while visiting java, drinking java.... 
// String - stores text, such as "Hello". String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false

public class test {
  public static void main(String[] args) {
    System.out.println("Hello World Brians first lines of java");
  }
}

// String name = "Brian W Loveless";
// System.out.println(name);

// int myNum = 5;
// float myFloatNum = 5.99f;
// char myLetter = 'D';
// boolean myBool = true;
// String myText = "Hello";

// A class is a template used to instantiate objects. 
// It's also called a type when used with a reference variable. 
// A class used to instantiate an object determines what states and behaviors an object will possess. 
// A class used as the type for a reference variable determines what behaviors of an object can 
// be invoked, and how any variables get initialized.

// An object is an instance of a class in memory. In Java, you never interact with objects directly. 
// Instead, you interact with them through their reference, which is the memory address used 
// by the JVM to find a particular object.

// A reference variable is a variable that stores the reference to an object in memory. 
// Just like the type of a primitive variable determines the range of values that a primitive 
// variable can store, the type of a reference variable determines what types of objects 
// a reference variable can store a reference to. When a class is used as the type of 
// a reference variable, that reference can only be used to invoke behaviors of the object that 
// are declared in the class/type.

// String someVar = new String("Hello World");
//   1      2             3
// 1. The class/type of the reference variable
// 2. The name of the reference variable
// 3. The instantiation of a new object using the new keyword to invoke the constructor