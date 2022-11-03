
const consumible = {
    nombre: 'manzana',
    categoria: 'frutas',
    precio: 1.99
}

console.log(consumible);

const pizza = {
    ingrediente: "queso",
    salsa: "marinara",
    tamaño: "pequeña"
};

console.log(pizza);
console.log(pizza.ingrediente);

pizza.ingrediente = 'jamón';

console.log(pizza);
console.log(pizza.ingrediente);

const carritoDeCompra = {
    1: "manzana",
    2: "naranjas"
};

console.log(carritoDeCompra);

const programador = {
    primerNombre: 'Phil',
    edad: 21,
    desarrolladorBackend: true,
    lenguajes: ["Python", "Javascript", "Java", "C++"],
    "nombre del proyecto actual": "La aplicación asombrosa"
}

console.log(programador);
console.log(programador.lenguajes[1]);

const animal = {
    tipo: 'gato',
    nombre: 'Milos',
    sonidos: () => "miau miau"
};

console.log("Mi gato se llama " + animal.nombre + " y dice " + animal.sonidos());
// console.log(" ");

const libro = new Object();
libro.autor = "Jane Smith";
libro.precio = 30;
libro.isbn = "B-272736435";

console.log(libro);

const jugadorDeBaloncesto = {
    nombre: "James",
    promedioDepuntosPorJuego: 20,
    estatura: "2 metros, 06 centímetros",
    posición: "escolta"
};

console.log(jugadorDeBaloncesto);
console.log(jugadorDeBaloncesto.posición);
delete jugadorDeBaloncesto.posición;
console.log(jugadorDeBaloncesto);

const empleado = {};

empleado["ocupación"] = "ventas";
empleado.salario = 1200;
empleado["viaja frecuentemente"] = true;
empleado["1er-territorio"] = "Chicago";
empleado[25] = "clientes totales";

let propiedad = "antiguedad de la empresa";
let valor = "5 años";

empleado[propiedad] = valor;

console.log(empleado);
console.log(empleado[25]);


const corredora = {
    nombre: "Jessica",
    edad: 20,
    kilómetrosPorSemana: 64,
    carrera: "maratón"
};

//solo devuelve los nombres de los atributos
let keys=Object.keys(corredora);
console.log(keys);

//solo devuelve los valores de los atributos
let values=Object.values(corredora);
console.log(values);