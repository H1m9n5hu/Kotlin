fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(3*x+y <= y*2+x)
            println(3*x+y)
        else
            println(y*2+x)
    }
}
