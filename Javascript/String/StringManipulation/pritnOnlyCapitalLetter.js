let str = "hdha dsahdEsahjd hMjsadhsad dhsadsad dSahjdashjd";
let result = '';
for (let i = 0; i < str.length; i++) {
  if (str[i] === str[i].toUpperCase() && str[i] !== ' ') {
    result += str[i];
  }
}
console.log(result);

