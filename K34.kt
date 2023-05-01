fun main(){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        var count = 0
        while(n != 0){
            if(n%2 != 0)
                count++
            n /= 2
        }
        println(count-1)
    }
}
