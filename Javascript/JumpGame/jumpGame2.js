let arr =[2, 4, 1, 2, 3, 1, 1, 2];

console.log(minJumps(arr));


function minJumps(arr){

let minJumps = 0;

let destination = arr.length-1;

let coverage = 0 , lastJumpIdx = 0;

for(let i=0;i<arr.length;i++){
    
    coverage = Math.max(coverage , i+arr[i]);

    if(i===lastJumpIdx){
         
        minJumps++;
        lastJumpIdx = coverage;

        if(coverage>=destination)
            return minJumps;

    }

}

return minJumps;

}