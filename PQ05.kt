fun main(){
    repeat(readLine()!!.toInt()){
        val (p, q, r, s) = readLine()!!.split(" ").map(String::toInt)
        if(p+q+r < s || q+r+s < p || r+s+p < q || s+p+q < r || p+q+r < s)
            println("Yes")
        else 
            println("No")
    }
}