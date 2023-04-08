fun main(){
    repeat(readLine()!!.toInt()){
        var (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(2*x > y*5)
            println("Chocolate")
        else if(2*x < y*5)
            println("Candy")
        else
            println("Either")
    }
}