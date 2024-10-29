//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Declaración de las variables diaNacimiento y mesNacimiento

    println("Bienvenido a juego sin nombre de Riot, su feedback ayudará a que este juego crezca para que sea una experiencia agradable para millones de usarios")
    println("Ingrese su día de nacimiento")
    var diaNacimiento = readln().toInt()
    println("Ingrese su mes de nacimiento")
    var mesNacimiento = readln().toInt()
    var cantidadRegalos = 0



    //Sección de control de errores
    while (diaNacimiento < 1 || diaNacimiento > 31 ){
        println("Día no válido, por favor ingrese el día de nuevo")
        diaNacimiento = readln().toInt()
    }

    while (mesNacimiento < 1 || mesNacimiento > 12){
        println("Mes no válido, por favor ingrese el mes de nuevo")
        mesNacimiento = readln().toInt()
    }

    //Sección para detectar si el jugador ingresa un día mayor de 31 si es un mes que normalmente tiene 30 días
    while (diaNacimiento > 30 && mesNacimiento == 4|| diaNacimiento > 30 && mesNacimiento == 6 || diaNacimiento > 30 && mesNacimiento == 9 || diaNacimiento > 30 && mesNacimiento == 11){
        println("Día no válido, por favor ingrese el día de nuevo")
        diaNacimiento = readln().toInt()
    }

    //Sección para detectar si el jugador ingresa un día mayor de 29 en el mes de febrero
    while (diaNacimiento > 29 && mesNacimiento == 2){
        println("Día no válido, por favor ingrese el día de nuevo")
        diaNacimiento = readln().toInt()
    }

    //La cantidad de regalos que recibirá el jugador
    if (diaNacimiento %2 == 0){
        cantidadRegalos = 5
    } else if (diaNacimiento %2 == 1 && diaNacimiento%3 == 0){
        cantidadRegalos = 7
    } else if (diaNacimiento %2 == 1 && diaNacimiento%3 != 0){
        cantidadRegalos = 30
    }


    for (cantidadRegalos in 1.rangeTo(cantidadRegalos)){
        val y = when (mesNacimiento) {
            1, 3, 5 -> {
                when (diaNacimiento) {
                    1 -> {
                        println("Felicidades, ha desbloqueado un secreto! Por favor ingrese su apellido para obtener un premio especial")
                        val apellido = readLine()
                        println("Felicidades, usted ha ganado la nave $apellido Y 5 potenciadores para sus x302 que duplicará sus puntos de vida")
                    }
                    else -> println("")
                }
                println("Ha obtenido 1000 créditos")
                println("Ha conseguido un refuerzo de x302 para el próximo combate! Durante 5 minutos, su velocidad se duplicará \n")
                println("-----------------------------------------------")
            }
            2, 4 -> {
                println("Ha obtenido 1000 créditos\n")
                println("Ha conseguido un refuerzo de x302, durante 5 minutos su salud se duplicará\n")
            }
            6,8,10,12 -> {
                println("Ha reclutado un Capitán© Clase S")
                println("Ha conseguido un refuerzo de x302! Para el próximo combate, durante 5 minutos, su salud se duplicará!")
                println("-----------------------------------------------------------------------------------------------------")
            }
            7,9,11 -> {
                println("Ha reclutado un capitán Clase S")
                println("Ha conseguido un refuerzo de x302 para el próximo combate! Durante 5 minutos, su velocidad se duplicará!")
                println("Ha desbloqueado la Fortaleza de clase carguero Colonial Destiny!")
                println("-----------------------------------------------------------------------------------------------------")
            }
            else -> {
                println("Pintamos toda la casa")
            }
        }
        println(y)
    }
}