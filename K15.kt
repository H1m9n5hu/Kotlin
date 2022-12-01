fun main(){
    repeat(readLine()!!.toInt()){
        val (a, b) = readLine()!!.split(" ").map(String::toInt)
        println(a%b)
    }
}