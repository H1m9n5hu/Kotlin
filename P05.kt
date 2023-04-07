fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val str = StringBuilder(readLine()!!)
        var x = StringBuilder("1")
        var y = StringBuilder("0")
        var count = 1
        for(i in 0 until n-1){
            if(x[i] != str[i]){
                count++
                x.append('1')
            }
            else
                x.append('0')
        }
        var temp = count
        count = 0
        for(i in 0 until n-1){
            if(y[i] != str[i]){
                count++
                y.append('1')
            }
            else
                y.append('0')
        }
        println(maxOf(temp, count))
    }
}
