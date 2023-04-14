fun main(){
    repeat(readLine()!!.toInt()){
        var (n, x) = readLine()!!.split(" ").map(String::toInt)
        if(n <= x)
            println("Yes")
        else
            println("No")
    }
}