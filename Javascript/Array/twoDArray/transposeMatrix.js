
let matrix = [[1,2,3],[4,5,6]];

let result = transpose(matrix);

     let row = result.length;
let coloum = result[0].length;

for (let i = 0; i < row; i++) {
    let line = "";
    for (let j = 0; j < coloum; j++) {
        line += result[i][j] + " ";
    }
    console.log(line.trim());

}
function transpose(arr){

     let rows = arr.length;
     let coloums = arr[0].length;


     // Proper 2D array initialization
    let transpose = new Array(coloums).fill(0).map(() => new Array(rows));

     for(let i = 0 ; i<rows;i++){


        for(let j=0;j<coloums;j++){


            transpose[j][i] = arr[i][j];
        }
     }


     return transpose;

}