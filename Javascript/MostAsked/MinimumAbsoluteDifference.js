let arr = [4,2,1,3];

let len = arr.length-1;
let min = Infinity;

const result = [];

arr.sort((a,b)=>a-b);

for(let i=0;i<len;i++){

     let diff = arr[i+1]-arr[i];
     min = Math.min(diff,min);
}

for(let i=0;i<len;i++){

    let diff = arr[i+1]-arr[i];
    if(min===diff){
        result.push(arr[i],arr[i+1]);
}
    
}

console.log(result);

