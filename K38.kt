fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val lst = readLine()!!.split(" ").map{it.toInt()}
        var set = lst.toSet()
        var arr = set.toIntArray()
        arr.sort()
        println(arr[set.size-1]+arr[set.size-2])
    }
}
