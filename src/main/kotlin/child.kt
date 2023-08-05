class child (var name :String,var height :Int): parent(height) {
    fun child(){
        println("i am a child ")
    }
    override fun parent(){
        println("override ")
    }
}
fun main(){
    val obj=child("radha",20)
    obj.parent()
    obj.child()
    println(obj.height)
}