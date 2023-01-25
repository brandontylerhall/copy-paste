On your Assessment class file inside of the src directory.

cube

Write a public static method named cube that accepts an integer as input and returns that number 3 times itself.

Hint: n cubed is n x n x n

difference

Write a public static method named difference that accepts two arguments and returns the absolute value of the difference between them such that the answer is always a positive number. The method should work with both integers and doubles.

Hints

The difference of 6 and 8 is 2
The difference of -2 and 5 is 7
The difference of 1.4 and 2.5 is 1.1
Using method overloading will help to solve this problem
average

Write a public static method named average that takes in an Array of integers (not a List, an Array) and returns the average of all the numbers in the list as a Double.

Hint: A good test is making sure the average of [1, 2] is 1.5

Create a class named Device inside of src.

The class should define 3 instance properties.

Two instance properties for type and brand they should be a String.
One instance property for price it should be a Double.
These properties should not be accessible outside of the Device class.
Create a constructor method that takes in two strings, and a double, and sets the brand, type, and price properties based on the passed arguments.

Inside the constructor, if either of the passed brand or type arguments are null, or if the passed price is 0, the constructor should throw an IllegalArgumentException.

Create a getter and setter for each property of the class.

Create a class named Tablet that inherits from Device.

Add a protected instance property named physicalKeyboard that is a boolean. This property represents whether an instance of this class has a physical keyboard.
Write the constructor on Tablet that defines 4 parameters: the brand of that device, the type, the price, and a boolean indicating whether that device has a keyboard. The corresponding properties of the object should be set based on the arguments passed to the constructor.
Write an instance method on the Tablet class named hasPhysicalKeyboard that returns a boolean indicating whether the tablet has a keyboard, based on the physicalKeyboard property.
Create an interface named TextEditor.

This interface should specify an instance method named openTextFile that accepts one String argument named filename and returns a String.
Change your Device class so that it implements the TextEditor interface.
The implementation of the openTextFile method on Device class should return a String with this message:
Opening $FILE with $EDITOR
Replace $FILE with the name of the file that was passed to the method.

$EDITOR should be replaced with either TextEdit or Notepad. Use the value of the instance property brand to replace $EDITOR with either TextEdit if brand is equals to Apple or Notepad if brand is equals to Microsoft.

An example of the returned string if the brand is Microsoft might look like this:

Opening contacts.txt with Notepad
Create a static method named createInventory on the Assessment class.

This class should take in an ArrayList of Device objects and return a HashMap<String, Device>.

The keys of the returned HashMap should be a automatically generated serial number. A serial number is a string that starts with an 'S', and a number that starts with 0 and increments for each Device. The values in the HashMap are the Device instances themselves.

For example:

The first Device in the list should have the serial number S0
The third Device in the list should have the serial number S2
The purpose of the serial number as a key in a HashMap is to be able to find devices like this:

HashMap<String, Device> inventory = Assessment.createInventory(devices);
inventory.get("S0"); // this line should return the first Device object
On your Assessment class create a static method named blackFridaySale. This method should:

Take in an ArrayList of Device objects
The method should return an ArrayList of Device objects where each device's price is lowered with a discount based on the following rules:
If the device brand is Apple it gets a 5% off on the normal price.
If the device brand is Microsoft it gets a 7% off on the normal price;