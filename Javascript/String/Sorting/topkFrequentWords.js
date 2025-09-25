

       
        let words = ["i", "love", "leetcode", "i", "love", "coding"];
        let k = 2;
        console.log(topKFrequent(words, k)); // Output: [i, love]

        function topKFrequent(words,k){

            let map = new Map();
            for(let word of words){

                map.set(word,(map.get(word)||0)+1);
            }

           let list = Array.from(map.keys())

           list.sort((a,b)=> {

             let freq = map.get(b)-map.get(a);

             if(freq==0)
               return  a-b;

             return freq;

           });

           return list.slice(0,k);

        }