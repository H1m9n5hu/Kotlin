fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        var a = StringBuilder(readLine()!!)
        val b = StringBuilder(readLine()!!)
        var s = StringBuilder("")
        if(a == b)
            println(0)
        else
            for(i in 0..n-1)
                if(a[i] != b[i])
                    s.append(b[i])
        println(s.toSet().size)
    }
}
