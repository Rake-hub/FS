const prompt = require('prompt-sync')({sigint: true});

var bol = true;

while (bol) {
    var fact = prompt("Introduce tu factorial: ");
    fact = Number(fact);


    if ((fact > 0) && (fact <= 10)) {
        var result = 1;
        for (let i = 1; i <= fact; i++) {
            result *= i;
        }
        console.log("El factorial de " + fact + " es " + result);
        bol = false;
    }
    else {
        console.log("Error, introduce el número de nuevo")
        console.log(" ")
    }
}