
const arr = [2, 3, 1, 1, 4];

let result = jumpGame(arr);

console.log(result);
function jumpGame(arr){


    let finalPosition  = arr.length-1;

    for(let i = finalPosition-2;i>=0;i--){

           if(i+arr[i]>=finalPosition)
            finalPosition=i

    }

    return finalPosition===0;

}

