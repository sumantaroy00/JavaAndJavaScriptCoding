console.log(validWordAbbreviation("internationalization", "i12iz4n")); // true
console.log(validWordAbbreviation("apple", "a2e")); // false
console.log(validWordAbbreviation("substitution", "s10n")); // true
console.log(validWordAbbreviation("substitution", "s010n")); // false (leading zero)

function isDigit(ch) {
    return ch >= '0' && ch <= '9';
}

function validWordAbbreviation(word, abbr) {

    let i = 0; // Pointer for word
    let j = 0; // Pointer for abbr

    while (i < word.length && j < abbr.length) {
        if (isDigit(abbr[j])) {
            if (abbr[j] === '0') return false; // leading zeros are invalid

            let num = 0;
            while (j < abbr.length && isDigit(abbr[j])) {
                num = num * 10 + (abbr[j].charCodeAt(0) - '0'.charCodeAt(0));
                j++;
            }

            i += num;
        } else {
            if (i >= word.length || word[i] !== abbr[j]) return false;
            i++;
            j++;
        }
    }

    return i === word.length && j === abbr.length;
}