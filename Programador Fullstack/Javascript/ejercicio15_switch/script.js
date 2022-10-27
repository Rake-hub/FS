const prompt = require('prompt-sync')({ sigint: true });

let numero = 4;

switch (numero) {
    case 1: console.log("impar");
        break;
    case 2: console.log("par");
        break;
    case 3: console.log("impar");
        break;
    case 4: console.log("par");
        break;
    default: numero = prompt("Introduce número menor que 4 o mayor que 1:")
        numero = parseInt(numero);
}