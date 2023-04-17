fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(y*10 < x)
            println("Yes")
        else
            println("No")
    }
}