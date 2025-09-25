

let arr = [2,2,2,3,3];

let evencount = 0;
let oddcount = 0;

for(let pos of arr){

    if(pos%2===0)
    evencount++;
    else
    oddcount++

}

let result = Math.min(evencount , oddcount);

console.log(result);