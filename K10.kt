fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        println(y/x)
    }
}