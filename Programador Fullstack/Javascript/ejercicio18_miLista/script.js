
function anadir_li() {
    let texto = find_li('Agua Mineral') ;
    if (texto) {
        let node = document.createElement("LI");
        let textnode = document.createTextNode("Agua Mineral");
        node.appendChild(textnode);
        document.getElementById("milista").appendChild(node);
    }
    else alert("El elemento ya existe");
}

function find_li(contenido) {
    let list = document.getElementById("milista").getElementsByTagName("LI");
    for (let i = 0; i < list.length; i++) {
        if (list[i].innerHTML == contenido) {
            return false; //Repetido
        }  
    }
    return true; //No repetido
}
