

let arr = [[9,7,8],[9,8,13],[15,7,17]];

console.log(luckyNumber(arr));



function luckyNumber(arr){

    let result = [];

      let rows = arr.length;
      let coloums = arr[0].length;



      for(let i = 0 ; i<rows;i++){


               let rowMin = arr[i][0];
               let coloumIndex = 0;

               for(let j=0;j<coloums;j++){

                    if(arr[i][j]<rowMin){

                        rowMin = arr[i][j];
                        coloumIndex = j;
                    }

               }

               let isMaxInCol = true;
               for(let k = 0 ;k<rows;k++){

                   if(arr[k][coloumIndex]>rowMin){
                      isMaxInCol = false;
                      break;
               }
            }
                if(isMaxInCol){
                   result.push(rowMin);
                }


      }

return result;


}