
//1st Problem

const users = [
  { name: 'Alice', age: 25, address: { city: 'Bangalore' }},
  { name: 'Bob', age: 30, address: { city: 'Mumbai' }},
  { name: 'Carol', age: 22, address: { city: 'Bangalore' }},
];

const bang = users.filter(user => user.address.city==='Bangalore');

console.log(bang);

//2nd Problem
const arr1 = [{id:1,name:'suman'},{id:2,name:'debo'},{id:1,name:'suman'}];

const unique = arr1.filter((ob , index , arr) =>
               index === arr.findIndex(t=>t.id === ob.id && t.name===ob.name));

console.log(unique);                       


//3.Filter by Date Range

const events = [
  { name: 'Event 1', date: '2025-08-01' },
  { name: 'Event 2', date: '2025-08-10' },
];

const start = new Date('2025-08-01');
const end = new Date('2025-08-05');

const filtered = events.filter(event => {
  const d = new Date(event.date);
  return d >= start && d <= end;
});

// 4.Filter Based on Dynamic Key


const key = 'status';
const orders = [
  { id: 1, status: 'pending' },
  { id: 2, status: 'complete' },
];

const result = orders.filter(order => order[key]==='complete')

console.log(result);

//5. filter by exclusion list

const items = [
  { id: 1, name: 'Pen' },
  { id: 2, name: 'Pencil' },
  { id: 3, name: 'Eraser' }
];

const excludeIds = [2, 3];
const item = items.filter(item=> !excludeIds.includes(item.id));
console.log(item);

//6.Filter Elements Appearing Only Once

const arr = [1, 2, 2, 3, 4, 4, 5];

const unique1 = arr.filter((elem,_,arr) => arr.indexOf(elem)===arr.lastIndexOf(elem));

console.log(unique1)

//7. Filter with Index and Previous/Next Values

const nums = [10, 20, 30, 40, 50];

const number = nums.filter((num,index,nums) => index > 0 && num>nums[index-1]);

console.log(number);

//8.Filter on Complex Date Condition

const events1 = [
  { title: 'Event1', date: '2025-08-01' },
  { title: 'Event2', date: '2025-09-01' },
];


const res = events.filter(event => new Date(event.date) > new Date('2025-08-15'));
console.log(res);

//9.Filter Based on Another Array of Objects

const users1 = [
  { id: 1, name: 'Alice' },
  { id: 2, name: 'Bob' }
];

const activeUsers = [
  { id: 2 }
];

const result1 = users.filter(user =>
  activeUsers.some(active => active.id === user.id)
);

//10.filter object key conditionally

const obj = {
  name: 'Alice',
  age: 25,
  password: 'secret',
};

const allowedKeys = ['name', 'age'];

const filteredObj = Object.fromEntries(
  Object.entries(obj).filter(([key]) => allowedKeys.includes(key))
);

// Output: { name: 'Alice', age: 25 }