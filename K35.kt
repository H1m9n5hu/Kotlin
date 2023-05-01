fun main(){
    repeat(readLine()!!.toInt()){
        val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
        if(a < b && b < c)
            println(0)
        else if(a xor b < a xor c)
            println(a)
        else if(b xor c < a xor b && b xor c < a xor c)
            println(a xor b xor c)
        else
            println(-1)
    }
}
