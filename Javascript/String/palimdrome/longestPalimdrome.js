let s = "abccccdd";

const result = longestPalindrome(s);

console.log(result);

function longestPalindrome(input){

    const freqMap = new Map();

    for(const ch of s){

        freqMap.set(ch,(freqMap.get(ch)||0)+1);

    }

    let half = '';
    let middle= '';
     
     for([ch,count] of freqMap.entries()){
           if(count ===1 || middle === '')
            middle=ch
 
           half = half + ch.repeat(Math.floor(count/2));

     }

        // Step 3: Form full palindrome
    const reversedHalf = half.split('').reverse().join('');
    const palindrome = half + middle + reversedHalf;

    return palindrome;
}

