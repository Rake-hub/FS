<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $escudo=$_GET['escudos'];

    if($escudo=='rmadrid')
        echo('<img src=../../Images/escudo-actual-del-real-madrid.jpeg />');
    if($escudo=='atmadrid')
        echo('<img src=../../Images/escudo_actual_del_club_atletico_de_madrid_modificado_por_ultima_vez_en_2017_y_creando__001.jpg />');
    if($escudo=='barça')
        echo('<img src=../../Images/barça.jpeg />');
    if($escudo=='valencia')
        echo('<img src=../../Images/Valencia_F.C.png />');        

    ?>
</body>
</html>