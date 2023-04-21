import kotlin.math.abs
fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        var value = Integer.MAX_VALUE
        for(i in 0 until n){
            var min = 0
            if(i > 0)
                min = Math.max(min, Math.abs(lst[i]-lst[i-1]))
            if(i+1 < n)
                min = Math.max(Math.abs(lst[i]-lst[i+1]), min)
            value = Math.min(value, min)
        }
        println(value)
    }
}
