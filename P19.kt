import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val (n1, n2, n3) = readLine()!!.split(" ").map(String::toInt)
    var lst1 = mutableListOf<Int>()
    var lst2 = mutableListOf<Int>()
    var lst3 = mutableListOf<Int>()
    
    for(i in 0 until n1)
        lst1.add(sc.nextInt())
    for(i in 0 until n2)
        lst2.add(sc.nextInt())
    for(i in 0 until n3)
        lst3.add(sc.nextInt())
        
    var lst = mutableListOf<Int>()
    
    for(i in 0 until n1){
        if(lst2.contains(lst1[i]))
            lst.add(lst1[i])
        if(lst3.contains(lst1[i]) && !lst.contains(lst1[i]))
            lst.add(lst1[i])
    }
    for(i in 0 until n2)
        if(lst3.contains(lst2[i]) && !lst.contains(lst2[i]))
            lst.add(lst2[i])
            
    lst.sort()
    println(lst.size)
    for(i in lst)
        println(i)
}
