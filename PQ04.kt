fun main(){
    repeat(readLine()!!.toInt()){
        val (n, x) = readLine()!!.split(" ").map(String::toInt)
        val r = n-x
        println(if(r < 0) 0 else if(r%4 == 0) r/4 else r/4+1)
    }
}