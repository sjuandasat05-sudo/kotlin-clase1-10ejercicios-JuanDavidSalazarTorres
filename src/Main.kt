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

    println("---------Ejercicio3---------")

    println("Clasificador de edad")


    println("Coloca tu edad:")
    val edad_clasificacion = readln().toInt()

    when {

        edad_clasificacion <= 17 -> println("Eres menor de edad")
        edad_clasificacion >= 18 -> println("Eres mayor de edad")
    }

// ==============EJERCICIO 4 =============//

    println("----------Ejercicio4--------")

    println("Contador regresivo")

    println("Escribe un numero")
    var usuario = readln().toInt()

    while (usuario >= 0) {

        println(usuario)
        usuario -= 1
    }

// =============EJERCICIO 5 ===============//

    println("----------Ejercicio5----------")

    println("Pormedio de 5 notas")

    println("Primer nota")
    val nota_1 = readln().toInt().toFloat()

    println("Segunda nota")
    val nota_2 = readln().toInt().toFloat()

    println("Tercera nota")
    val nota_3 = readln().toInt().toFloat()

    println("Cuarta nota")
    val nota_4 = readln().toInt().toFloat()

    println("Quinta nota")
    val nota_5 = readln().toInt().toFloat()

    val notas = listOf(nota_1, nota_2, nota_3, nota_4, nota_5)

    var suma = 0.0

    for (numero in notas) {
        suma += numero
    }

    val promedio = suma // notas

    println("El promedio es ${promedio}")


//===================EJERCICIO 6==============//

    println("-------------Ejercicio 6--------------")

    println("Validador de datos (Null Safety)")

    println("Escribe tu nombre")
    val nombre_dato = readln().toString()

    println("Dame tu edad")
    val edad_dato = readln().toIntOrNull()

    println("Coloca tu altura")
    val altura_dato = readln().toFloatOrNull()

    println("Tu nombre es ${nombre_dato}")

    println("Tienes ${edad_dato} años")

    println("Y mides ${altura_dato}")

//====================EJERCICIO 7============//

    println("----------Ejercicio 7-----------")

    println("Funcion con parametros por defecto")

    fun imprimirDatosPersonales(
        nombre: String = "Juan David Salazar Torres",
        edad: Int = 20,
        ciudad: String = "Medellin"
    ) {

        println("Nombre de usuario $nombre")
        println("Tiene $edad años de edad")
        println("Y vive en la ciudad de $ciudad")

    }

//==================EJERCICIO 8 ==============//

    println("----------Ejercicio 8------------")

    println("Tabla de multiplicar")

    //===Escribe cualquier numero======//

    println("Escribe el numero")
    val multiplicacion = readln().toInt()

    for (multiplicacion in 1..10) {

        println("Tabla del $multiplicacion")

        for (i in 1..10) {
            println("$multiplicacion x $i = ${multiplicacion * i}")
        }
        println()
    }

//=================EJERCICIO 9=================//

    println("-----------Ejercicio 9------------")

    println("Conversor de temperatura")



    fun celsiusAFahrenheit(celsius: Double): Double {
        return (celsius * 9 / 5) + 32
    }

    fun fahrenheitACelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }

    fun integrador() {

        println("Conversor de temperatura")
        println("1. Celsius a Fahrenheit")
        println("2. Fahrenheit a Celsius")

        print("Seleccione una opción: ")
        val opcion = readln().toInt()

        when (opcion) {

            1 -> {
                print("Ingrese los grados Celsius: ")
                val celsius = readln().toDouble()

                println("Resultado: ${celsiusAFahrenheit(celsius)} °F")
            }

            2 -> {
                print("Ingrese los grados Fahrenheit: ")
                val fahrenheit = readln().toDouble()

                println("Resultado: ${fahrenheitACelsius(fahrenheit)} °C")
            }

            else -> {
                println("Opción incorrecta.")
            }
        }
    }

    //====================EJERCICIO 10==========//

    println("--------------Ejercicio 10--------------")

    fun mostrarResumen(nombre: String, edad: Int, categoria: String, mensaje: String) {
        println()
        println("----- Resumen -----")
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Categoría: $categoria")
        println("Mensaje: $mensaje")
    }

    fun final() {

        println("Ingrese su nombre:")
        val nombre = readln()

        println("Ingrese su edad:")
        val edad = readln().toInt()

        var categoria = ""
        var mensaje = ""

        if (edad >= 18) {
            categoria = "Mayor de edad"
            mensaje = "Ya eres un adulto."
        } else {
            categoria = "Menor de edad"
            mensaje = "Aún eres menor de edad."
        }

        mostrarResumen(nombre, edad, categoria, mensaje)
    }
}