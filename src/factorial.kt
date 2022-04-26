fun main(){
    print("Ingrese el numero")

    var numero = readLine()!!.toInt()

    for (i in numero-1 downTo 1){
        numero *=i
    }
    print("El factorial es: $numero");
}