

function x(){
    var a=7;

    function y(){
      console.log(a);
    }

   return y;
}

var z = x();
console.log(z)
z();


//A closure is a function that remembers the variables from its outer scope even after the outer function has finished executing.

/*
Encapsulation – Keep variables private
Data Persistence – Maintain state between function calls
Callbacks & Event Handling – Useful in setTimeout, setInterval, etc.
*/


function outerFunction(name) {
    let message = "Hello, "; // Outer function variable

    function innerFunction() { // Closure
        console.log(message + name);
    }

    return innerFunction;
}

const greetJohn = outerFunction("John");
greetJohn(); // Output: "Hello, John"
//🔹 Even though outerFunction has executed, innerFunction still remembers message and name.