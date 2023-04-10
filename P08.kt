fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        if(lst[0] == 1 && lst[n-1] == n)
            println(0)
        else if(lst[0] != 1 && lst[n-1] == n)
            println(lst.indexOf(1))
        else if(lst[0] == 1 && lst[n-1] != n)
            println(n-1-lst.indexOf(n))
        else if(lst.indexOf(1) < lst.indexOf(n))
            println(lst.indexOf(1)+n-1-lst.indexOf(n))
        else
            println(lst.indexOf(1)+n-1-lst.indexOf(n)-1)
    }
}
