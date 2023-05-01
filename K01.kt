fun main(){
    repeat(readLine()!!.toInt()){
        val x = readLine()!!.toInt()
        if(x > 0 && x <= 10)
            println("Yes")
        else
            println("No")
    }
}