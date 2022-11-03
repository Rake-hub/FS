let hangar = {
    marcaAvión: "Boeing",
    númeroAvión: "B-07078",
    capacidad: 220,
    añoConstitución: 1990
};


const removeAccents=(str)=>{
    return str.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
}
let array=Object.keys(hangar);
let array2=Object.values(hangar);
hangar={};

for (let i = 0; i < array.length; i++) {
array[i]=removeAccents(array[i]);
hangar[array[i]]=array2[i];
}
 console.log(hangar);

 console.log(Object.entries(hangar)[0][1]);




/*
let array = Object.keys(hangar);

for (let i = 0; i < array.length; i++) {
    array[i] = array[i].replace(/á/g, "a");
    array[i] = array[i].replace(/é/g, "e");
    array[i] = array[i].replace(/í/g, "i");
    array[i] = array[i].replace(/ó/g, "o");
    array[i] = array[i].replace(/ú/g, "u");

    if (old_key !== new_key) {
        Object.defineProperty(o, new_key,
            Object.getOwnPropertyDescriptor(o, old_key));
        delete o[old_key];
    }

}

console.log(array);

console.log(hangar);

*/
