fun main(){
    val no_of_workers = readLine()!!.toInt()
    val no_of_coins = readLine()!!.split(" ").map{it.toInt()}
    val types_of_workers = readLine()!!.split(" ").map{it.toInt()}
    var min_of_1 = 100000
    var min_of_2 = 100000
    var min_of_3 = 100000
    
    for(i in 0 until no_of_workers){
        if(types_of_workers[i] == 1)
            if(no_of_coins[i] < min_of_1)
                min_of_1 = no_of_coins[i]
           
        if(types_of_workers[i] == 2)
            if(no_of_coins[i] < min_of_2)
                min_of_2 = no_of_coins[i]
                
        if(types_of_workers[i] == 3 && min_of_3 != 0)
            if(no_of_coins[i] < min_of_3)
                min_of_3 = no_of_coins[i]
    }
    
    if(min_of_1+min_of_2 <= min_of_3)
        println(min_of_1+min_of_2)
    else
        println(min_of_3)
}
