fun main() {
    var n = 9;
    var t1 = 1;
    var t2 = 1
    var suma = 0
    var sumaF = 0;
    //print("First $n terms ")

    for(i in 1..n){
        print("$t1 + ")

        suma = t1 + t2;
        t1 = t2;
        t2 = suma

        sumaF = suma - 1
    }
    print("\nLa suma del primer $n terminos es : $sumaF")
}