fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        if(n == 50)
            println(0)
        else { 
            if(n > 50) {
                if((n-50)%3 == 0)
                    println((n-50)/3)
                else if((n-50)%3 == 1)
                    println((n-50)/3+2)
                else
                    println((n-50)/3+4)
            }
            else {
                if((50-n)%2 == 0) 
                    println((50-n)/2) 
                else 
                    println((50-n)/2+3)
            }
        }
    }
}
