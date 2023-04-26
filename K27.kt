fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y) = readLine()!!.split(" ").map(String::toLong)
        if(x*x*x*x+4*y*y == 4*x*x*y)
            println("Yes")
        else
            println("No")
    }
}
