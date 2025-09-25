// Higher order function - A function which takes another function as an argument is higher order function
// Y is higher order function here and x is call back function 



function x(){
    console.log("Namaste JavaScript");
}
function y(x){
    x();
}

const radius = [3,1,2,4];

const calculateArea = function(radius){

    const output = [];
    for(let i =0 ;i<radius.length;i++){
        output.push(Math.PI*radius[i] * radius[i]);
    }
   return output;

}

console.log(calculateArea(radius));

const area = function(radius){
return Math.PI * radius * radius ;

}

const calculate = function(radius , logic){
const output =[];
for(let i =0 ;i<radius.length;i++){
    output.push(logic(radius[i]));
}
 return output;
}

console.log(calculate(radius,area));