console.log(" ");
console.log("Bienvenido al Blackjack:");

let mensaje;
function getMessage(mensaje){
if(mano==21){
    return "¡Black Jack!";
}else{
    mensaje=(mano>21)?"Perdiste!":"Sigue jugando";
}
return mensaje;
}
function getRandomCard(){
    return Math.floor(Math.random()*11)+1;
}

let carta1=getRandomCard();
let carta2=getRandomCard();

console.log("carta 1: "+carta1+"    carta 2: "+carta2);
let mano=carta1+carta2;
console.log("mano: "+mano);
let message=getMessage(mano);

while(message=="Sigue jugando"){
    carta1=getRandomCard();
    carta2=getRandomCard();
    mano+=(carta1+carta2);
    console.log("carta 1: "+carta1+"    carta 2: "+carta2);
    console.log("mano: "+mano);
    message=getMessage(mano);
}

console.log(message);