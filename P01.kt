import java.util.Scanner 
fun main(){
    val sc = Scanner(System.`in`)
    var t = sc.nextInt()
    repeat(t){
        var n = sc.nextInt()
        var str = sc.next()
        var arr = str.toCharArray()
        for(i in 0 until n-1 step 2){
            if(arr[i] == '0' && arr[i+1] == '0')
                print("A")
            else if(arr[i] == '0' && arr[i+1] == '1')
                print("T")
            else if(arr[i] == '1' && arr[i+1] == '0')
                print("C")
            else
                print("G")
        }
        print("\n")
    }
}
