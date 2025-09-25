

let k=1;
let arr = [100,80,90,60,10,20,20,30,30,40,50,50,60,60,80,80,100,100];

let arr1 = [100,80,90,60,10,20,20,30,30,40,50,50,60,60,80,80,100,100];
arr1.sort();


    if(arr1.length===0){
      console.log("Array is empty");
    }

    for (let i = 1; i < arr.length; i++) {
        if (arr1[i] != arr1[i - 1]) {
            arr1[k] = arr1[i]; // Overwrite the next unique element
            k++;
        }
    }

     for (let i = 1; i < k; i++) {
        console.log("removed array :" + arr1[i]);
    }

    



function removeDuplicate(arr){

return [...new Set(arr)];

}

function removeDuplicates(arr) {
    return arr.filter((value, index) => arr.indexOf(value) === index);
}

console.log(removeDuplicates(arr.sort()));
arr.filter((value,index) => arr.indexOf(value) === index);