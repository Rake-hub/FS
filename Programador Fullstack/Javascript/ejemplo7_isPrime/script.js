const prompt = require('prompt-sync')({ sigint: true });

// var num=2169;
var num = prompt("Introduce tu número: ");
num = Number(num);

function isPrime(n) {
    if (isNaN(n) || !isFinite(n)) return false;
    for (var i = 2; i < n; i++)
        if (n % i == 0) return false;
    return true;
}

function divisible(n) {
    for (var i = 2; i < n; i++) {
        if (n % i == 0) console.log(i);
    }
}

console.log(isPrime(num));
console.log(" ");
console.log(divisible(num));