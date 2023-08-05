//fun main(){
//    for(i in 1 .. 10){
//        println(i)
//    }
//}

//fun main(){
//    for(i in 10 downTo 1){
//        println(i)
//    }
//}

//fun main(){
//    for(i in 1 .. 10 step 2){
//        println(i)
//    }
//}

//fun main(){
//    var a= arrayOf(1,2,3,4,5,6)
//    for(i in 0 .. a.size-1){
//        println(a[i])
//    }
//}

//fun main(){
//    var a= arrayOf(1,2,3,4,5,6)
//    for(i in 0 until a.size-1){
//        println(a[i])
//    }
//}
fun main(){
    var a = listOf(1,2,3,4,5)
    println(a)
    var b = mutableListOf("vaibhav","radha","krishna")
    b.add("radha vallabh")
    b.add(2,"harivansh")
    b.removeAt(0)
    println(b)

}