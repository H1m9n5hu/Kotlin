import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val (n1, n2, n3) = readLine()!!.split(" ").map(String::toInt)
    val arr = IntArray(n1+n2+n3)

    for(i in 0 until n1+n2+n3)
        arr[i] = sc.nextInt()
        
    var set = arr.toSet()
    var lst = mutableListOf<Int>()
    
    for(i in set)
        if(arr.filter{it == i}.count() > 1)
            lst.add(i)
    lst.sort()
    
    println(lst.size)
    for(element in lst)
        println(element)
}
