


   let arr = [1,2,3,4,5,6,7];
   let k =4;
   let right = arr.length-1;
   let left = 0;
   k=k%right;

   swapElement(arr,left,k-1);
   swapElement(arr,k,right);
   swapElement(arr,left,right);

     console.log(arr);
   function swapElement(arr,left,right){

      while(left<right){
          
        let temp = arr[right];
        arr[right]=arr[left];
        arr[left]=temp;

        left++;
        right--;
     
      }

       

   }