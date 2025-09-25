const num = [1,3,4,6];

// 1.
const data = num.map((num1)=>num1*4);
console.log(data);
// 2.
const data1 = num.filter((num1)=>num1%4===0);
console.log(data1);



//3.
const arr = [
  { name: 'Alice', age: 25, address: { city: 'Bangalore' }},
  { name: 'Bob', age: 30, address: { city: 'Mumbai' }},
  { name: 'Carol', age: 22, address: { city: 'Bangalore' }},
];


const unique1 = Array.from(new Set(arr.map(item=> JSON.stringify(item)))).
                map(str=>JSON.parse(str));

console.log(unique1);

//4.
const users = [{name: "Alice"}, {name: "Bob"}];
const names = users.map(user => user.name);
console.log(names)


//5.
const fruits = ['apple','Banana'];
const upperFruits = fruits.map(fruit=>fruit.toUpperCase());
console.log(upperFruits);


//6.

const items = [
  { id: 1, name: 'Pen' },
  { id: 2, name: 'Pencil' }
];

const enriched = items.map(item => ({
  ...item,
  selected: false
}));

console.log(enriched);


const letters = ['a', 'b', 'c'];

const indexed = letters.map((letter, index) => `${index}-${letter}`);
// ['0-a', '1-b', '2-c']

//6. Transform Nested Arrays

const matrix = [[1, 2], [3, 4]];

const doubled = matrix.map(row => row.map(col => col * 2));
// [[2, 4], [6, 8]]

//8. Flatten and Transform (Use with flatMap)

const dept = [
  { team: 'Dev', members: ['Alice', 'Bob'] },
  { team: 'QA', members: ['Carol'] }
];

const allMembers = dept.flatMap(d => d.members);
// ['Alice', 'Bob', 'Carol']


const scores = [80, 45, 60];

const result = scores.map(score =>
  score >= 50 ? 'Pass' : 'Fail'
);
// ['Pass', 'Fail', 'Pass']
//9.12. Map for API Data Formatting

const apiData = [
  { id: 1, name: 'Alice', status: 1 },
  { id: 2, name: 'Bob', status: 0 }
];


const res = apiData.map(item => ({...item,statusText:item.status===1?'Active':'Inactive'}));

console.log(res);