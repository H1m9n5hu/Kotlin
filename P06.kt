fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        var temp = 0
        var max = 0
        for(i in 0..n-1){
            temp = lst.filter{it == lst[i]}.count()
            if(temp > max)
                max = temp
        }
        println(n-max)
    }
}
