fun main(){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        val s = StringBuilder(readLine()!!)
        var count = 0
        for(i in 0 until n-1 step 2){
            if(s[i] != s[i+1])
                count++
        }
        if(count%2 == 0 || count == 0) println("Ramos") else println("Zlatan")
    }
}
