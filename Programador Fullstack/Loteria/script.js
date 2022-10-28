//49 nums 6 escogidos sin repetir

function Jugar() {
    //Cambia todos los numeros al estilo inicial para reiniciar el Juego
    for (let i = 0; i <= 49; i++) document.getElementById(`boton_${i}`).className = "botonBoleto"; 

    let arrayLoto = [];
    let repetido = false;

    while (arrayLoto.length < 6) {
        let numEscogido = Math.round(Math.random() * (49 - 0) + 0);//Escribe 1 num al azar del 0 al 49
        for (let i = 0; i < arrayLoto.length; i++) {
            if (numEscogido == arrayLoto[i]) {
                repetido = true;
            }
        }
        if (!repetido) arrayLoto.push(numEscogido);
        else repetido = false;
    }
    for (let i = 0; i < arrayLoto.length; i++) document.getElementById(`boton_${arrayLoto[i]}`).className = "botonBoleto2";

}

//NO USAR
// function pulsado(id) {
//     var element = document.getElementById(id);
//     element.class = (element.class == "button.botonBoleto2") ? "button.botonBoleto" : "button.botonBoleto2";
// }
