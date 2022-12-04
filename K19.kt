fun main(){
    repeat(readLine()!!.toInt()){
        val a = readLine()!!.toInt()
        if(a%2 == 0 && a%7 == 0)
            println("Alice")
        else if(a%2 == 1 && a%9 == 0)
            println("Bob")
        else
            println("Charlie")
    }
}