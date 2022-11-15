fun main(){
    repeat(readLine()!!.toInt()){
        val (a, b, c, x) = readLine()!!.split(" ").map(String::toInt)
        if(a+b >= x || b+c >= x || a+c >= x)
            println("Yes")
        else
            println("No")
    }
}