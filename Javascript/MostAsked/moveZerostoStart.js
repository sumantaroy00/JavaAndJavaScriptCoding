

const arr = [1,2,0,7,8,7,0,1,0];
const temp = [];
let count = 0;

for(let i =0 ; i<arr.length;i++){

      if(arr[i]!=0){
        temp.push(arr[i]);
      }
}

for(let i = 0 ; i<arr.length;i++){

    if(arr[i] == 0){
        arr[count++]=arr[i];
    }
}

while(count<arr.length){

    arr[count++]=temp.pop();
}

console.log(arr);