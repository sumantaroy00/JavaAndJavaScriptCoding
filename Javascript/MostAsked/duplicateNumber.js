const num  = [,-1,-1,3,1,3,4,2,2,3323,3,3,4,4,5,6,7,8,0,0] ;

const seen = new Set();       // Set to track numbers we have seen
const duplicates = new Set(); 




for (let i =0 ; i<num.length;i++){


  if(seen.has(num[i])){    
    duplicates.add(num[i]);
  }
  else{
   seen.add(num[i])
  }
}

console.log([...duplicates]);