fun main(){
    repeat(readLine()!!.toInt()){
        val (n, x) = readLine()!!.split(" ").map(String::toInt)
        var y = n*x
        if(y.toString().length == 5)
            println("Yes")
        else
            println("No")
    }
}