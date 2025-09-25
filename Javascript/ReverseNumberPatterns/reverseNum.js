
const readline = require('readline');

const rl = readline.createInterface({

  input : process.stdin,
  output:process.stdout

});

rl.question('Enter a question ' , function(input){

  const num = parseInt(input);

  if(isNaN(num))
    console.log(num + " is not a number");

  let temp = num;

  let result = 0;

  while(temp>0){
     result = result *10 + (temp%10);
     temp = Math.floor(temp/10);

  }

  console.log(result);
  rl.close();
});


