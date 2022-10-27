

//Numero de vocales y de letras e

let cadena = "hoy es vEintisiEte dE octubrE de dosmilvEintidos";
let vocal=0;
let e=0;

cadena=cadena.toLowerCase();

for (let i = 0; i < cadena.length; i++) {
    switch (cadena.charAt(i)) {
        case 'a': vocal+=1;
            break;
        case 'e': e+=1; vocal+=1;
            break;
        case 'i': vocal+=1;
            break;
        case 'o': vocal+=1;
            break;
        case 'u': vocal+=1;
            break;
        default: break;
    }
}

console.log("El numero de vocales es: "+vocal);
console.log("El numero de la letra 'e' es: "+e);
