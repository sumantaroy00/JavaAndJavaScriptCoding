let arr = [9,4,1,7];
let k =2;
let len = arr.length;
arr.sort();
let minDiff = Infinity;


for(let i =0 ; i<len-k;i++){

   let diff = arr[i+k-1]-arr[i];
   minDiff = Math.min(diff,minDiff);


}

console.log(minDiff);