fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val str = StringBuilder(readLine()!!)
        
        var x = mutableListOf<Int>()
        for(s in str)
            x.add(s.digitToInt())
            
        var y = mutableListOf<Int>()
        y.add(0)
        for(i in 0..n-2)
            y.add(x[i] xor y[i])
        var t1 = y.filter{it == 1}.count()
        
        y.clear()
        y.add(1)
        for(i in 0..n-2)
            y.add(x[i] xor y[i])
        var t2 = y.filter{it == 1}.count()
        
        println(maxOf(t1, t2))
    }
}
