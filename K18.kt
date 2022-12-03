fun main(){
    repeat(readLine()!!.toInt()){
        val (n, m, k) = readLine()!!.split(" ").map(String::toInt)
        if(k+n <= m )
            println("Yes")
        else
            println("No")
    }
}