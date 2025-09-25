const readline = require('readline');

const rl = readline.createInterface({
input : process.stdin,
output:process.stdout

})

rl.question('Enter a number ' ,  function(input){

const num = parseInt(input);

let temp = num;
let digitCount = 0;


while(temp>0){
  temp = Math.floor(temp/10);
  digitCount++;

}

let divisor = Math.pow(10,digitCount-1);

let first = Math.floor(num/divisor);
let last =  num%10;
let middle = Math.floor((num%divisor)/10);


let result = 0;

while(middle>0){
result= result*10 + middle%10;
middle = Math.floor(middle/10);

}

let finalResult = first*divisor + result*10 + last;
console.log("Reversed number " +  finalResult);
   rl.close();
})