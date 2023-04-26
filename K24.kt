fun main(){
    repeat(readLine()!!.toInt()){
        val x = readLine()!!.toInt()
        if(4*x <= 1000)
            println("Yes")
        else
            println("No")
    }
}
