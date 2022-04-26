const val PI = 3.1416;
fun main(args: Array<String>){
    println("Hello world!")
    //tipo de variable es inferido
    var dinero : Int = 10;
    println(dinero);
    dinero = 5;
    println(dinero);

    //solo lectura
    val nombre = "Maria";
    println(nombre);

    println(PI)
}