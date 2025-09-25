
//XORing a number with itself results in 0.
// XORing a number with 0 keeps the number unchanged.//


const num = [1,4,2,4,1,];

let len = num.length;
let result = 0;

for(let i= 0; i<len;i++){

    result = result ^ num[i];

}
console.log(result);