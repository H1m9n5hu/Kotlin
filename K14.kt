fun main(){
    repeat(readLine()!!.toInt()){
        val (n, x) = readLine()!!.split(" ").map(String::toInt)
        if(n-x <= x)
            println("Yes")
        else
            println("No")
    }
}