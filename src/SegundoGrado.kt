fun main(args:Array<String>){
    println("Ingrese los siguientes datos");
    println("Ingrese el coeficiente de segundo grado")
    var coef2 = readLine()!!.toInt();
    println("Ingrese el coeficiente de primer grado")
    var coef1 = readLine()!!.toInt();

    println("Ingrese el coeficiente de grado cero")
    var coef0 = readLine()!!.toInt();

    var raiz = (coef1 * coef1) - 4 * (coef2 * coef0);
    var b1 = coef2 * (-1);
    var a1 = 2 * coef2;

    println("Las raices son: ");
    println("La raiz 1 es $b1 + $raiz / $a1")
    println("La raiz 2 es $b1 + $raiz / $a1")
}