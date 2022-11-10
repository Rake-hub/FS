<?php
$x=$_GET['mapa_x'];
$y=$_GET['mapa_y'];

echo("X:".$x." ");
echo("Y:".$y);
?>
<head>
    <style>
        form{
            position: absolute;
            top:20px;
            left:800px;
        }
    </style>

<script>
function mostrar(){
        let node=document.createElement("img");
        node.setAttribute('src', '../../Images/Madrid.jpg');
        node.setAttribute('style','position:absolute;top:20px;left:0px');
        document.getElementById("madrid").appendChild(node);
    }
</script>
</head>

 <body>
    <h1>CASAS</h1>
    <?php 
    echo('<input type="text" id="cajaX" value="'.$x.'">');
    echo('<input type="text" id="cajaY" value="'.$y.'">');
    ?>
    <!-- controles -->
    <button onclick="mostrar()">Click</button>
    <div id="madrid"></div>

    <form action="">
        <select name="" id="">
            <option value="">Casa</option>
        </select>
        <br><br>
        <textarea name="" id="" cols="30" rows="3"></textarea>
        <br><br>
        <button>Mostrar</button>
    </form>
</body> 
