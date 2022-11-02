
var numero1=4;

console.log(nombre); //hoisting

function NumeroVar(){
    var numero1=9;
    var numero1=6;
    console.log(numero1);
    var edad='90';
    console.log(edad); //No se puede usar fuera
}


function NumeroLet(){
    // let numero1=5;
    let numero1=1;
    console.log(numero1);
    let pais="Portugal"
}

NumeroVar()
NumeroLet()
console.log(numero1);
console.log(" ");
console.log(pais);

var nombre="Alvaro"; //hoisting