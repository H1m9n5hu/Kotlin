fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(x < y)
            println(y-x)
        else if(x > y)
            println(x-y)
        else
            println(0)
    }
}