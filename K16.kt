fun main(){
    repeat(readLine()!!.toInt()){
        val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
        if(a+b+c >= 100 && a >= 10 && b >= 10 && c >= 10)
            println("PASS")
        else
            println("FAIL")
    }
}