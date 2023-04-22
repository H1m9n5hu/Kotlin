import java.util.Scanner
import java.math.BigInteger
fun main(){
    val sc = Scanner(System.`in`)
    repeat(readLine()!!.toInt()){
        val n = sc.nextBigInteger()
        val rem:BigInteger = n%20.toBigInteger()
        println(rem)
    }
}
