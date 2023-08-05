//fun main(){
//    val a=0;
//    try{
//        println(4/0)
//    }
//    catch(e :Exception ){
//        println("exception has occured")
//    }
//}

//null pointer exception
fun main(){
    val a : String?=null
    println(a)
    println(a?.length ?:"value is null")  // default message
          // or
    println(a?:"value is null")

    var b= mutableListOf(12,null,30,null)
    println(b.filterNotNull())

}