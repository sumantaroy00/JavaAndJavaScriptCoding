

const arr = [7,1,2,3,4,6,0];
const len = arr.length;

arr.sort();

let expectedsum = (len*(len+1))/2;
let actualsum = 0;

for(let i=0;i<len;i++){

  actualsum = actualsum+arr[i];

}

let missingNumber = expectedsum - actualsum;
console.log(missingNumber);



