fun main(args: Array<String>) {
    var names= arrayListOf<String>("john","musa","mary","mike","morgan","miry")
    fun add(x:Int,y:Int)= println(x+y)//inline functions
    add(10,40)

    var results=names.filter { name->name.startsWith("mi") }

    results.forEach { name-> println(name) }
   var uppernames=names.map {name->name.toUpperCase()  }
    uppernames.forEach { x-> println(x) }
}