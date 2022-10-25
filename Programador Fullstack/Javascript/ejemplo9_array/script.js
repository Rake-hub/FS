const prompt = require('prompt-sync')({ sigint: true });

// let nums= new Array(3);
// nums[0]=1;
// nums[1]=3;
// nums[2]=5;

// for (let i=0;i<nums.length;i++){
//     console.log(nums[i]);
// }

console.log("---------------------------");
console.log(" ");

let notas= new Array(5);

for(let i=0;i<notas.length;i++){

    notas[i]=prompt("Introduce nota: ");
    notas[i]=Number(notas[i]);
}

console.log(" ");

var media=0;

for(let i=0;i<notas.length;i++){

    console.log(`La nota del alumno ${i+1} es `+notas[i]);
    media+=notas[i];
}

console.log(" ");

console.log("La media es "+media/notas.length);