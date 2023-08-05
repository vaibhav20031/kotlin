//class class_constructor( num1:Int, num2:Int) {
//    var num1:Int
//    var num2:Int
//    init{
//        this.num1=num1
//        this.num2=num2
//    }
//}

                                            // OR  SHORTCUT
//class class_constructor(var num1:Int,var num2:Int)
//fun main(){
//    val obj1=class_constructor(10,20)
//    println(obj1.num1)
//}

                                             //DATA CLASS
data class class_constructor(var num1:Int,var num2:Int)
fun main(){
    val obj1=class_constructor(10,20)
    println(obj1)
}
