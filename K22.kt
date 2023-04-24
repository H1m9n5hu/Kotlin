fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val str = StringBuilder(readLine()!!)
        var count = 0
        for(i in 0 until n-1)
            if(str.substring(i..i+1) == "10")
                count++
        println(count)
    }
}
