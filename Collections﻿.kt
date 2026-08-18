// Tema 3: Collections
// Carlos Santiago Chipahua Alvarez

// Ejercicio 1: Contar el total de numeros en listas "green" y "red"
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    // Write your code here
    val total = greenNumbers.count() + redNumbers.count()
    println(total) // 5
}

// ---------------------------------------------------------------------------
// Ejercicio 2: Verificar si un protocolo solicitado esta soportado
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

// ------------------------------------------------------------
// Ejercicio 3: Definir un mapa que relacione numeros del 1 al 3 con su escritura
fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelled as '${number2word[n]}'")
}