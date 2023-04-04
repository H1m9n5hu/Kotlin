import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var operator = sc.next()
    var arr = operator.toCharArray()
    if(arr[0] == '+')
        print(a+b)
    else if(arr[0] == '-')
        print(a-b)
    else if(arr[0] == '*')
        print(a*b)
    else
        print(a.toDouble()/b)
}
