fun main(){
    repeat(readLine()!!.toInt()){
        val x = readLine()!!.toInt()
        if(x > 0 && x < 11)
            println("YES")
        else
            println("NO")
    }
}
