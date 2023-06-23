fun main() {
    var strarr = arrayOf("hello","rohit ","virat","cricket","you")
    var intarr = arrayOf(1,34,16,7,8,98,65,36)
    var chararr = arrayOf('h','r','v','c','y')
    var l = intarr.size-1
    var temp = 0
// print(l)
    for (i in 0 .. l){
        for(j in 0 .. l) {
            if (intarr[i] > intarr[j]) {
                temp = intarr[i]
                intarr[i] = intarr[j]
                intarr[j] = temp
            }
        }
    }
    for (i in 0..l){
        println(intarr[i])
    }
    println()
    var l1 = strarr.size-1
    var temp1:String


    for (i in 0 .. l1){
        for(j in 0 .. l1) {
            if (strarr[i] > strarr[j]) {
                temp1 = strarr[i]
                strarr[i] = strarr[j]
                strarr[j] = temp1
            }
        }
    }
    for (i in 0..l1){
        println(strarr[i])
    }
    println()
    var l2 = chararr.size-1
    var temp2:Char
// print(l)
    for (i in 0 .. l2){
        for(j in 0 .. l2) {
            if (chararr[i] > chararr[j]) {
                temp2 = chararr[i]
                chararr[i] = chararr[j]
                chararr[j] = temp2
            }
        }
    }
    for (i in 0..l2){
        println(chararr[i])
    }

}
/*assing each variable different data type in same program array should be their */