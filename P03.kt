fun main(){
    repeat(readLine()!!.toInt()){
        val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
        if(a > 50 && b < 50 && c < 50)
            println("A")
        else if(b > 50 && a < 50 && c < 50)
            println("B")
        else if(c > 50 && a < 50 && b < 50)
            println("C")
        else
            println("Nota")
    }
}
