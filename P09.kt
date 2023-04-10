fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        var max = 0
        for(i in lst)
            if(max <= lst.filter{it==i}.count())
                max = lst.filter{it==i}.count()
        println(n-max)
    }
}
