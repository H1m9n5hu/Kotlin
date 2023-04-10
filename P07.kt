fun main(){
    repeat(readLine()!!.toInt()){
        var (n, m) = readLine()!!.split(" ").map(String::toInt)
        while(n != m){
            if(n>m)
                n -= m
            else
                m -= n
        }
        println(n)
    }
}
