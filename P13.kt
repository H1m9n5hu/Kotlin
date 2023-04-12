fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        var count = 0
        var sum = 0
        for(i in 0..n-1){
            sum += lst[i]
            if(sum*100/(i+1) == 100 && sum%(i+1) == 0)
                count++
        }
        println(count)
    }
}
