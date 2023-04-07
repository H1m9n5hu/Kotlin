fun main(){
    repeat(readLine()!!.toInt()){
        val x = readLine()!!.toInt()
        if(x > 24)
            println("Yes")
        else
            println("No")
    }
}