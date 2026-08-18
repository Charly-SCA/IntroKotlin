// Tema 4: Control Flow
// Carlos Santiago Chipahua Alvarez

/* **************************************************
    Ejercicios de expresiones condicionales
*/
// Ejercicio 1: Juego de dados
import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
    if (firstResult == secondResult) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
}

// ----------------------------------------------
// Ejercicio 2: Usar when para imprimir acciones segun el boton

fun main() {
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}

/* ************************************************************
    Ejercicios de loop o iteraciones
*/

// Ejercicio 1: Refactorizar el codigo con while y do-while 
fun main() {
    // Usando while
    var pizzaSlices = 0
    while (pizzaSlices < 8) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza")
    }

    // Usando do-while
    pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza")
    } while (pizzaSlices < 8)
}

// --------------------------------------------------------------------
// Ejercicio 2: Fizz Buzz del 1 al 100
fun main() {
    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("fizzbuzz")
            i % 3 == 0 -> println("fizz")
            i % 5 == 0 -> println("buzz")
            else -> println(i)
        }
    }
}

// ---------------------------------------------------------
// Ejercicio 3: Imprimir palabras que comienzan con 'l'
fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}