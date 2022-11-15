fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y, z) = readLine()!!.split(" ").map(String::toInt)
        if(x+y <= z)
            println(2)
        else if(x <= z && x+y > z)
            println(1)
        else if(x > z)
            println(0)
    }
}