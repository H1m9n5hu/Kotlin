fun main(){
    repeat(readLine()!!.toInt()){
        val (n, m) = readLine()!!.split(" ").map(String::toInt)
        if(n-m > 0)
            println(n-m)
        else
            println(0)
    }
}
