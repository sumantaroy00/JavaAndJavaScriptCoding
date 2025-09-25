let str = "This is sumanta roy debopriya roy and mana karmelllllll";

let output = str.split(' ').sort((a1,a2)=>a2.length-a1.length).join(' ');

console.log(output);

