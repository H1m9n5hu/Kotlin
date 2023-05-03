fun main(){
    repeat(readLine()!!.toInt()){
        val (n, m) = readLine()!!.split(" ").map(String::toInt)
        if(n - n*10.00/100.00 < m)
            println("ONLINE")
        else if(n - n*10.00/100.00 > m)
            println("DINING")
        else
            println("EITHER")
    }
}
