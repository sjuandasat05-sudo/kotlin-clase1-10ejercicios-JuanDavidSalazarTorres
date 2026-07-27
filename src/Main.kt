fun main() {
    println("===EJERCICIO CLASE 1===")

// ============== EJERCICIO 1 ==============//


    println("---- Ejercicio1------")

    println("Saludo personalizado")

    print("Ingrese su nombre: ")
    val nombre = readln()

    print("Ingrese su edad: ")
    val edad = readln().toInt()

    println("Hola $nombre")
    println("Tienes $edad años.")

// ============ EJERCICIO 2 ============//

    println("-----Ejercicio2--------")

    println("Calculadora basica")

    print("Escribe el primer numero:")
    val numero_1 = readln().toInt()

    print("Escribe el segundo numero:")
    val numero_2 = readln().toInt()

    println("Multiplicacion: ${numero_1 * numero_2}")

    println("Division: ${numero_1 / numero_2}")

    println("Suma: ${numero_1 + numero_2}")

    println("Resta: ${numero_1 - numero_2}")

// ==============EJERCICIO 3 ===========//

    print("---------Ejercicio3---------")

    println("Clasificador de edad")


    println("Coloca tu edad:")
    val edad_clasificacion = readln().toInt()

    when {

        edad_clasificacion <= 17  -> println("Eres menor de edad")
        edad_clasificacion >= 18  -> println("Eres mayor de edad")
    }

    









}