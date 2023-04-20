fun main(){
    repeat(readLine()!!.toInt()){
        val (n, m) = readLine()!!.split(" ").map(String::toInt)
        if(n <= m*6*6) println("Yes") else println("No")
    }
}
