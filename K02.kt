fun main(){
    repeat(readLine()!!.toInt()){
        var (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(x+y > 6)
            println("Yes")
        else
            println("No")
    }
}