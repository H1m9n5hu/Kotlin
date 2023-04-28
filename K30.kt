fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        var str = readLine()!!
        str = str.toCharArray().apply{sort()}.joinToString("")
        println(str)
    }
}
