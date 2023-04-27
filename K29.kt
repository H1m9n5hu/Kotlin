fun main(){
    repeat(readLine()!!.toInt()){
        val x = readLine()!!.toLong()
        val a:Long = 1000000
        val b:Long = 1000001
        if(x == 1.toLong())
            println(-1)
        else if(x <= b)
            println("${1} ${x-1} ${1}")
        else if(x%a != 0.toLong())
            println("${a} ${x/a} ${x%a}")
        else
            println("${x/a-1} ${a} ${a}")
    }
}
