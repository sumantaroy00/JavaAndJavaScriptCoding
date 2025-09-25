
let s = "abcabcbb";

let start = 0 , maxStart = 0 , maxLength = 0;

let map = new Map();

for(let i = 0 ; i<s.length;i++){

     let ch = s[i];
     if(map.has(ch)&& map.get(ch)>=start){

        start = map.get(ch)+1;

     }

     map.set(ch,i);

     if(i-start+1>maxLength){

        maxLength = i-start+1;
        maxStart = start;

     }


}


console.log(s.substring(maxStart,maxLength+maxStart));

