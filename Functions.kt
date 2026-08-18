// Tema 5: Functions
// Carlos Santiago Chipahua Alvarez

/* **************************************************
    Ejercicios de funciones
*/
// Ejercicio 1: Funcion que calcula el area de un circulo
import kotlin.math.PI

fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

fun main() {
    println(circleArea(2))
}

// ----------------------------------------------
// Ejercicio 2: Reescritura como una funcion de expresion-singular 
import kotlin.math.PI

fun circleArea(radius: Int): Double = PI * radius * radius

fun main() {
    println(circleArea(2))
}

// -----------------------------------------------------------
// Ejercicio 3: Mejorar intervalInSeconds con valores por defecto y argumentos nombrados

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}

/* **************************************************
    Ejercicios de funciones lambda
*/
// Ejercicio 1: Construir URLs usando una lambda
fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}

// --------------------------------------------------------------
// Ejercicio 2: Funcion que repite una accion n veces

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

fun main() {
    repeatN(5) {
        println("Hello")
    }
}

