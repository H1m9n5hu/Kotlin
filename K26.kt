fun main(){
    repeat(readLine()!!.toInt()){
        val x = readLine()!!.toInt()
        var r = x/10
        if(x%10 >= 5)
            println(100-(r+1)*10)
        else
            println(100-r*10)
    }
}
