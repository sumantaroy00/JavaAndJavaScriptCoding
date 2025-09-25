


let str = ["a2b", "b3c", "g4d"];
let map = new Map();


let result = manipulation(str);
console.log(result);
console.log(Object.fromEntries(result));

function manipulation(str){

            for( const s of str){


                let value = s[0];

                for( let ch of s){
                    
                    if(ch>=0 && ch<=9){ //!isNaN(ch) // key = parseInt(ch) -1;

                        map.set(ch-'1',value);
                    }


                }
            }
            return map;


}