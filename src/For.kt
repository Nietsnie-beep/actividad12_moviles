fun main() {
    // iteración regular
    for (char in 'a'..'f') print(char)

    // iteración con avance de 2
    println()
    for (char in 'a'..'f' step 2) print(char)

    println()
    // iteración en reversa
    for (char in 'f' downTo 'a') print(char)

    // iteración excluyendo el límite superior
    println()
    for (char in 'a' until 'f') print(char)
}