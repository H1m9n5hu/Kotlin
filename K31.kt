fun main(){
    repeat(readLine()!!.toInt()){
        val (b, c) = readLine()!!.split(" ").map(String::toLong)
        var i:Long = b
        var j:Long = c
        while (i != j) {
            if (i > j)
                i -= j
            else
                j -= i
        }
        println(c/i)
    }
}
