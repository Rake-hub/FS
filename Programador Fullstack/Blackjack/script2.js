let palos = ['C', 'D', 'H', 'S'];

document.getElementById("continuar").style.display="none";

//--------------------------------------------------


function dorso() {
    for (let i = 1; i <= 13; i++) {
        document.images[i - 1].src = (document.images[i - 1].src == 'http://127.0.0.1:5500/Blackjack/images/dorso.png') ? `images/${i}-C.png` : 'images/dorso.png';
        document.images[i - 1 + 13].src = (document.images[i - 1 + 13].src == 'http://127.0.0.1:5500/Blackjack/images/dorso.png') ? `images/${i}-D.png` : 'images/dorso.png';
        document.images[i - 1 + 26].src = (document.images[i - 1 + 26].src == 'http://127.0.0.1:5500/Blackjack/images/dorso.png') ? `images/${i}-H.png` : 'images/dorso.png';
        document.images[i - 1 + 39].src = (document.images[i - 1 + 39].src == 'http://127.0.0.1:5500/Blackjack/images/dorso.png') ? `images/${i}-S.png` : 'images/dorso.png';
    }
    document.getElementById("jugar").style.display="inline";
    document.getElementById("continuar").style.display="none";

}

function dorso2() {
    for (let i = 1; i <= 13; i++) {
        document.images[i - 1].src = 'http://127.0.0.1:5500/Blackjack/images/dorso.png';
        document.images[i - 1 + 13].src = 'http://127.0.0.1:5500/Blackjack/images/dorso.png';
        document.images[i - 1 + 26].src = 'http://127.0.0.1:5500/Blackjack/images/dorso.png';
        document.images[i - 1 + 39].src = 'http://127.0.0.1:5500/Blackjack/images/dorso.png';
    }
    document.getElementById("jugar").style.display="inline";
    document.getElementById("continuar").style.display="none";

}

function cara() {
    for (let i = 1; i <= 13; i++) {
        document.images[i - 1].src = `http://127.0.0.1:5500/Blackjack/images/${i}-C.png`;
        document.images[i - 1 + 13].src = `http://127.0.0.1:5500/Blackjack/images/${i}-D.png`;
        document.images[i - 1 + 26].src = `http://127.0.0.1:5500/Blackjack/images/${i}-H.png`;
        document.images[i - 1 + 39].src = `http://127.0.0.1:5500/Blackjack/images/${i}-S.png`;
    }

    document.getElementById("jugar").style.display="inline";
    document.getElementById("continuar").style.display="none";

}

//id aleatorio
function getRandomCard() {
    let repetido = false;
    let arrayCarta = [];

    let carta1 = Math.floor(Math.random() * 13) + 1
    let carta2 = palos[Math.floor(Math.random() * palos.length)]
    let carta = carta1 + "-" + carta2;

    document.getElementById(`${carta}`).src = `images/${carta}.png`;
    console.log(carta); //Muestra el id de la carta escogida

    for (let i = 0; i < arrayCarta.length; i++) {
        if (carta == arrayCarta[i]) {
            repetido = true;
        }
    }
    if (!repetido) { arrayCarta.push(carta); return carta; }
    else repetido = false;
}


function jugar() {
    dorso2();
    let carta1 = getRandomCard();
    let carta2 = getRandomCard();

    document.getElementById("jugar").style.display="none";
    document.getElementById("continuar").style.display="inline";

}


function continuar() {
    let carta = getRandomCard();

}


/*
let mensaje;
function getMessage(mensaje) {
    if (mano == 21) {
        return "¡Black Jack!";
    } else {
        mensaje = (mano > 21) ? "Perdiste!" : "Sigue jugando";
    }
    return mensaje;
}

function getRandomCard() {
    return Math.floor(Math.random() * 11) + 1;
}

let carta1 = getRandomCard();
let carta2 = getRandomCard();

console.log("carta 1: " + carta1 + "    carta 2: " + carta2);
let mano = carta1 + carta2;
console.log("mano: " + mano);
let message = getMessage(mano);

while (message == "Sigue jugando") {
    carta1 = getRandomCard();
    carta2 = getRandomCard();
    mano += (carta1 + carta2);
    console.log("carta 1: " + carta1 + "    carta 2: " + carta2);
    console.log("mano: " + mano);
    message = getMessage(mano);
}

console.log(message);
*/

var a = document.getElementById("1-C").getAttribute("data-value");

console.log(a);