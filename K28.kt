fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        var arr = lst.toTypedArray()
        
        arr.sort()
        var r = arr[0]
        var min = arr[0]
        for(i in 1..n-1)
            r += arr[i]-arr[0]
        
        if(r%2 == 0 && n%2 == 1 || r%2 == 0 && n%2 == 0 && min%2 == 0)
            println("Chefina")
        else 
            println("Chef")
    }
}
