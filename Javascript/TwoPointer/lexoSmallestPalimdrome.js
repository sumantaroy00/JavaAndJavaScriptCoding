const s = "egcfe";

console.log(palimdrome(s));

 function palimdrome(text){
   
    let ch = text.split("");  // Convert to array
    let left = 0;
    let right = ch.length - 1;

    while (left < right) {
        if (ch[left] !== ch[right]) {
            if (ch[left] < ch[right]) {
                ch[right] = ch[left];
            } else {
                ch[left] = ch[right];
            }
        }
        left++;
        right--;
    }

    return ch.join("");
}