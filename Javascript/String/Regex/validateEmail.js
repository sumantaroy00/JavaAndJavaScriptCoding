function validateEmail(email) {
    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return emailRegex.test(email);
}
/*
// Test cases
console.log(validateEmail("user@example.com"));    // ✅ true
console.log(validateEmail("john.doe@domain.co.uk")); // ✅ true
console.log(validateEmail("invalid-email.com"));   // ❌ false
console.log(validateEmail("user@.com"));           // ❌ false
console.log(validateEmail("user@domain..com"));    // ❌ false
*/


const readline = require("readline");

// Create an interface for input/output
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


// Ask for user input
rl.question('Enter email : ' , (email) => {

    if(validateEmail(email)){
     console.log("valid");
    }
    else{
        console.log("Invalid");
    }
    rl.close();


})