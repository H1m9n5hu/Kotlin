fun main(){
    repeat(readLine()!!.toInt()){
        val (n, k) = readLine()!!.split(' ').map{it.toInt()}
        var str = readLine()!!
        var S = StringBuilder("")
        for(s in str)
            S.append(s)
        if(S[0] == '0'){
            S[0] = '1'
            for(i in  1..k-1)
                S.append('0')
        }
        else{
            for(i in 1..k)
                S.append('0')
        }
        println(S)
    }
}
