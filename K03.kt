fun main(){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        if(n%3 == 0)
            println("Yes")
        else 
            println("No")
    }
}