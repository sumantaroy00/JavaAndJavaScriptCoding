// Chained filter() + map() + reduce() Problems

//1. Sum of All Paid Invoices

const invoices = [
  { id: 1, amount: 100, paid: true },
  { id: 2, amount: 200, paid: false },
  { id: 3, amount: 150, paid: true }
];


const result = invoices.filter(i=>i.paid)
               .map(i=>i.amount).reduce((acc,i)=>acc+i,0)
console.log(result);

//2.Extract Unique Emails from Users

const users = [
  { email: 'a@example.com' },
  { email: 'b@example.com' },
  { email: 'a@example.com' }
];

const res1= Array.from(new Set(users.map(user=>user.email)));
console.log(res1);

//3.Deduplicate Array of Objects

const arr = [
  { id: 1, name: 'A' },
  { id: 2, name: 'B' },
  { id: 1, name: 'A' }
];


const res2 =  Array.from(new Set(arr.map(t=>JSON.stringify(t)))).map(str=>JSON.parse(str));
console.log(res2);

//4.

const testResults = [

{name:'Login Test' , status: 'Pass'},
{name:'Signup Test' , status: 'fail'},
{name:'Checkout Test' , status: 'Passed'},
{name:'Search Test' , status: 'FAILED'},
{name:'Cart Test' , status: 'PASS'},

];

const normalizedResults = testResults.map(test=> 
    {
      const status = test.status.toUpperCase().includes('PASS'||'PASSED') ? 'PASS' : 'FAIL' ;
      return {name : test.name,status};
    })

const summary = normalizedResults.reduce((acc,test)=>{

     acc[test.status.toLowerCase()]+=1;
     return acc


},{pass:0,fail:0});

const output = {summary,results:normalizedResults}

console.log(output);

//5.Remove Duplicates by Custom Key

const people = [
  { name: 'A', email: 'a@test.com' },
  { name: 'B', email: 'b@test.com' },
  { name: 'C', email: 'a@test.com' }
];



const seen = new Set();
const unique = people.filter(p=> {

   const key = p.email;
   if(seen.has(key)) return false;
   seen.add(key);
   return true;


})
console.log(unique)

//6.Find Most Frequent Country in User List


const users1 = [
  { name: 'A', country: 'India' },
  { name: 'B', country: 'USA' },
  { name: 'C', country: 'India' }
];


const counts = users1.reduce((acc,u) =>{
acc[u.country]=(acc[u.country] || 0) + 1;

},{})

const mostFrequentCountry = Object.entries(counts)
  .reduce((a, b) => a[1] > b[1] ? a : b)[0]; // 'India

  console.log(counts)


  //7.Create Frequency Map of Letters in a String

const text = 'banana';

const freq = text.split('').reduce((acc, ch) => {
  acc[ch] = (acc[ch] || 0) + 1;
  return acc;
}, {});

//8.Get List of Students Who Improved Scores

const scores = [
  { name: 'Alice', scores: [60, 80] },
  { name: 'Bob', scores: [75, 70] }
];

const improved = scores
  .filter(s => s.scores[1] > s.scores[0])
  .map(s => s.name); // ['Alice']

  //9.Filter Invalid Emails and Extract Domains

const emails = ['alice@gmail.com', 'bob#yahoo.com', 'carol@outlook.com'];

const domains = emails
  .filter(e => /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(e))
  .map(e => e.split('@')[1]);
// ['gmail.com', 'outlook.com']

//10.Get Unique Skill Set From Team

const team = [
  { name: 'A', skills: ['JS', 'React'] },
  { name: 'B', skills: ['JS', 'Node'] },
  { name: 'C', skills: ['Java'] }
];

const allSkills = Array.from(new Set(team.flatMap(t => t.skills)));

//11.Find All Users With At Least Two Failed Logins

const logs = [
  { user: 'alice', status: 'fail' },
  { user: 'bob', status: 'success' },
  { user: 'alice', status: 'fail' },
  { user: 'alice', status: 'success' },
  { user: 'bob', status: 'fail' }
];

const result5 = Object.entries(
  logs.filter(log => log.status === 'fail')
      .reduce((acc, log) => {
        acc[log.user] = (acc[log.user] || 0) + 1;
        return acc;
      }, {})
).filter(([_, count]) => count >= 2).map(([user]) => user);