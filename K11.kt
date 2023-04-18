fun main(){
    repeat(readLine()!!.toInt()){
        val (n, x, y) = readLine()!!.split(" ").map(String::toInt)
        if(n <= x*y)
            println("Yes")
        else
            println("No")
    }
}