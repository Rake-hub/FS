// const prompt = require('prompt-sync')({ sigint: true });


var notas = [1, 5, 2, 7, 10, 4];
var mayor = notas[0];

Mayor(notas);
Menor(notas);
Media(notas);



function Mayor() {
    mayor=notas[0];
    for (let i = 0; i < notas.length; i++) {
        if (mayor < notas[i]) mayor = notas[i];
    }
    console.log(mayor);
}

function Menor() {
    mayor=notas[0];
    for (let i = 0; i < notas.length; i++) {
        if (mayor > notas[i]) mayor = notas[i];
    }
    console.log(mayor);
}

function Media() {
    let media=0;
    for (let i = 0; i < notas.length; i++) {
        media+=notas[i];
    }
    console.log(media/notas.length);
}

