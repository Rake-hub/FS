// let x=5;

// while(x>0){
//     console.log(x);
//     x--;
// }

const prompt = require('prompt-sync')();

// var p="java";
console.log("Adivina la palabra (java):")
console.log(" ");

function comparar(p) {

    let i = 3;

    while (i > 0) {

        var palabra = prompt(`Introduce tu palabra (${i} intentos): `);

        if (p != palabra) {
            i--;
        }
        else{
        console.log(" ");
        console.log("Es correcto");
        return null;
        }
    }

    console.log(" ");
    console.log("Has fallado");
}

comparar("java");

