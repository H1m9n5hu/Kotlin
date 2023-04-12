fun main(){
    repeat(readLine()!!.toInt()){
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(2*y%15 == 0 && 2*y/15 <= x)
            println("Yes")
        else if(2*y%15 != 0 && 2*y/15+1 <= x)
            println("Yes")
        else 
            println("No")
    }
}
