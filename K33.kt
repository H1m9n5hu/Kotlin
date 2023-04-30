fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toLong()}
        val element = lst.sumOf{it}/(n+1)
        if(n == 1)
            println(lst[0]/2)
        else{
            for(i in lst)
                print("${i-element} ")
            println()
        }
    }
}
