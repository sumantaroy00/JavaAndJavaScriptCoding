
//1.
const num = [1, 2, 3, 4];

const output = num.reduce(function(max,num){

    if(num>max)
        max=num;
    return max;

})

console.log(output);

//2.
const users =[

    {firstname : "sumanta",lastname:"roy",age:"26"},
    {firstname : "debo",lastname:"roy",age:"26"},
    {firstname : "maa",lastname:"roy",age:"30"}
]

const output2 = users.reduce(function(acc,cur){

if(acc[cur.age]){
    acc[cur.age] = ++acc[cur.age];
}
else{
    acc[cur.age] =1
}
return acc;
},{})

console.log(output2);

//3.
const nested = [[1, 2], [3, 4], [5]];

const res = nested.reduce((acc,cur)=> acc.concat(cur),[])
console.log(res);

//4. Count Occurrences of Elements

const fruits = ['apple', 'banana', 'apple', 'orange', 'banana'];
const result =   fruits.reduce((acc,fruit) => {acc[fruit] = (acc[fruit]||0)+1;
                                               return acc;},
                                               {});
console.log(result);

//5.

const data = [
  { a: 1 },
  { b: 2 },
  { c: 3 }
];

const result1 = data.reduce((acc,curr) => ({...acc,...curr}),{})
console.log(result1);

//6.

const strings = ['a', 'abcd', 'abc'];

const str = strings.reduce((acc,cur)=>cur.length>acc.length?cur:acc,'');
console.log(str);

//7.

const data1 = [' 1 ', ' 2 ', ' 3 '];

const numbers = data1.reduce((acc, val) => {
  const num = parseInt(val.trim());
  if (!isNaN(num)) acc.push(num);
  return acc;
}, []);

console.log(numbers)

//8

const arr = ['a', 'b', 'c'];

const obj = arr.reduce((acc, char, index) => {
  acc[index] = char;
  return acc;
}, {});

//9

const nums = [1, 2, 2, 3, 3, 4];

const unique = nums.reduce((acc, num) => {
  if (!acc.includes(num)) acc.push(num);
  return acc;
}, []);