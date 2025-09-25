

        let arr = [1,2,3,4,5,6,7];
        let k =4;
        let right=arr.length-1;
        let light = 0;
        k=k%right;

        swapRight(arr,0,right);
        swapRight(arr,0,k-1);
        swapRight(arr,k,right);


       console.log(arr);

       function swapRight(arr,left,right){

            while(left<right){

              let temp = arr[right];
              arr[right]=arr[left];
              arr[left]=temp;

              left++;
              right--;

            }
       }