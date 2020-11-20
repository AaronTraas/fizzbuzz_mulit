'use strict';

function fizzbuzzer(num, replacements) {
    var out = "";
    for (var multiple in replacements) {
        if (num % multiple == 0)
        out += replacements[multiple];
    }
    if (out === "") {
        return num;
    }
    return out;
}

function fizzbuzzRange(start, end, replacements) {
    var out = "";    
    for (var num = start; num < end; num++) {
        out += fizzbuzzer(num, replacements) + "\n";
    }
    return out;
}

console.log(fizzbuzzRange(1, 100, {
    3: "Fizz",
    5: "Buzz"
}));
