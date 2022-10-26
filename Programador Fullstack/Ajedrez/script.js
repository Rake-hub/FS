
// espacio en blanco &nbsp;
//border='1px solid black'

// style='margin:50px 0px 0px 50px'>

//EJECUTO EL DIBUJO DE AJEDREZ
Ajedrez();



function Ajedrez() {
    document.write("<table class='tabla' >")
    for (let i = 1; i <= 8; i++) {
        document.write("<tr> ")
        for (let j = 1; j <= 8; j++) {
            if ((i + j) % 2 == 0)
                document.write(`<td align='center' id='td${i}${j}' bgcolor='313131' width='70' height='70'></td>`) //style='padding:10px'
            else document.write(`<td align='center' id='td${i}${j}' bgcolor='white' width='70' height='70'></td>`)
            // bgcolor='EEE8C9'
        }
        document.write("</tr>")
        // document.write("<br>")
    }
    document.write("</table>")
    peon();
    torre();
    caballo();
    alfil();
    rey();
    reina();


}

function peon() {
    for (let i = 1; i <= 8; i++) {
        document.getElementById(`td2${i}`).innerHTML = '<big><big><big><big><big><big>&#9823;</big></big></big></big></big></big>'
        document.getElementById(`td7${i}`).innerHTML = '<big><big><big><big><big><big>&#9817;</big></big></big></big></big></big>'
    }
}

function torre() {

        for (let i = 1; i <= 8; i++) {
            if ((i==1)||(i==8)) {
                document.getElementById(`td1${i}`).innerHTML = '<big><big><big><big><big><big>&#9820;</big></big></big></big></big></big>'
                document.getElementById(`td8${i}`).innerHTML = '<big><big><big><big><big><big>&#9814;</big></big></big></big></big></big>'
            }
        }
}

function caballo() {

    for (let i = 1; i <= 8; i++) {
        if ((i==2)||(i==7)) {
            document.getElementById(`td1${i}`).innerHTML = '<big><big><big><big><big><big>&#9822;</big></big></big></big></big></big>'
            document.getElementById(`td8${i}`).innerHTML = '<big><big><big><big><big><big>&#9816;</big></big></big></big></big></big>'
        }
    }
}

function alfil() {

    for (let i = 1; i <= 8; i++) {
        if ((i==3)||(i==6)) {
            document.getElementById(`td1${i}`).innerHTML = '<big><big><big><big><big><big>&#9821;</big></big></big></big></big></big>'
            document.getElementById(`td8${i}`).innerHTML = '<big><big><big><big><big><big>&#9815;</big></big></big></big></big></big>'
        }
    }
}

function rey() {

    for (let i = 1; i <= 8; i++) {
        if (i==5) {
            document.getElementById(`td1${i}`).innerHTML = '<big><big><big><big><big><big>&#9818;</big></big></big></big></big></big>'
            document.getElementById(`td8${i}`).innerHTML = '<big><big><big><big><big><big>&#9812;</big></big></big></big></big></big>'
        }
    }
}

function reina() {

    for (let i = 1; i <= 8; i++) {
        if (i==4) {
            document.getElementById(`td1${i}`).innerHTML = '<big><big><big><big><big><big>&#9819;</big></big></big></big></big></big>'
            document.getElementById(`td8${i}`).innerHTML = '<big><big><big><big><big><big>&#9813;</big></big></big></big></big></big>'
        }
    }
}