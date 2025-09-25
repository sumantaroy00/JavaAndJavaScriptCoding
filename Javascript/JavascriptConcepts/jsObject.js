/*

Methods for Defining JavaScript Objects
Using an Object Literal
Using the new Keyword
Using an Object Constructor
Using Object.assign()
Using Object.create()
Using Object.fromEntries()
*/



{

name :"SUMANTA"
gender:"Male"

};
//Type 1
const person ={}

person.name = "sumanta"

// Type 2
const person1 = new Object();

person1.name = "sumanta"

// Type 3

function Person2(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
  }
const myFather = new Person("John", "Doe", 50, "blue");
const myMother = new Person("Sally", "Rally", 48, "green");
const mySister = new Person("Anna", "Rally", 18, "green");

const mySelf = new Person("Johnny", "Rally", 22, "green");

//Type 4

//Prevents re-assignment
const car = {type:"Fiat", model:"500", color:"white"};

// Prevents adding object properties
Object.preventExtensions(object)

// Returns true if properties can be added to an object
Object.isExtensible(object)

// Prevents adding and deleting object properties
Object.seal(object)

// Returns true if object is sealed
Object.isSealed(object)

// Prevents any changes to an object
Object.freeze(object)

// Returns true if object is frozen
Object.isFrozen(object)

// Type 4

// Copies properties from a source object to a target object
Object.assign(target, source)

// Creates an object from an existing object
Object.create(object)

// Returns an array of the key/value pairs of an object
Object.entries(object)

// Creates an object from a list of keys/values
Object.fromEntries()

// Returns an array of the keys of an object
Object.keys(object)

// Returns an array of the property values of an object
Object.values(object)

// Groups object elements according to a function
Object.groupBy(object, callback)



//JavaScript Object Prototypes

/*All JavaScript objects inherit properties and methods from a prototype:

Date objects inherit from Date.prototype
Array objects inherit from Array.prototype
Person objects inherit from Person.prototype
The Object.prototype is on the top of the prototype inheritance chain:

Date objects, Array objects, and Person objects inherit from Object.prototype.

*/

Person.prototype.nationality = "English";


Person.prototype.name = function() {
    return this.firstName + " " + this.lastName;
  };

  //Only modify your own prototypes. Never modify the prototypes of standard JavaScript objects.



  //JavaScript Object.assign()
  // Create Target Object
const person1 = {
    firstName: "John",
    lastName: "Doe",
    age: 50,
    eyeColor: "blue"
  };
  
  // Create Source Object
  const person2 = {firstName: "Anne",lastName: "Smith"};
  
  // Assign Source to Target
  Object.assign(person1, person2);

//Object.entries() makes it simple to use objects in loops:

const fruits = {Bananas:300, Oranges:200, Apples:500};

let text = "";
for (let [fruit, value] of Object.entries(fruits)) {
  text += fruit + ": " + value + "<br>";
}

const fruits1 = {Bananas:300, Oranges:200, Apples:500};

const myMap = new Map(Object.entries(fruits1));



//The fromEntries() method creates an object from a list of key/value pairs.

const fruits3 = [
    ["apples", 300],
    ["pears", 900],
    ["bananas", 500]
  ];
  
  const myObj = Object.fromEntries(fruits3);



  const fruit4s = [
    {name:"apples", quantity:300},
    {name:"bananas", quantity:500},
    {name:"oranges", quantity:200},
    {name:"kiwi", quantity:150}
  ];
  
  // Callback function to select low volumes 
  function myCallback({ quantity }) {
    return quantity > 200 ? "ok" : "low";
  }
  
  // Group by ok and low
  const result = Object.groupBy(fruits, myCallback);
  
  // Display Results
  let text1 ="These fruits are Ok: <br>";
  for (let [x,y] of result.ok.entries()) {
    text1 += y.name + " " + y.quantity + "<br>";
  }
  
  text += "<br>These fruits are low: <br>";
  for (let [x,y] of result.low.entries()) {
    text += y.name + " " + y.quantity + "<br>";
  }
  

  //JavaScript Object Properties