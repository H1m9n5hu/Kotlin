import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val (n1, n2, n3) = readLine()!!.split(" ").map(String::toInt)
    val lst = mutableListOf<Int>()
    val dict = hashMapOf<Int, Int>()
    
    for(i in 0 until n1+n2+n3){
        var j = sc.nextInt()
        if(j in dict)
            dict[j] = 2
        else
            dict[j] = 1
    }
    for((key, value) in dict)
        if(value > 1)
            lst.add(key)
    lst.sort()
    
    println(lst.size)
    for(element in lst)
        println(element)
}
