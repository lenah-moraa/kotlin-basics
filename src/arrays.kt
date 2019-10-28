fun main(args: Array<String>) {
    var scores= listOf(10,67,81,90,43,77,56,79,90,34,55)
    var names= listOf("jane","jack","jerry","jim","jully","justin" )
    var cities= listOf("Nairobi","Mombasa","New York","Kampala","Arusha","Kisumu" )

    println(scores[1])
    println(names[3])
//    add

    var marks= arrayListOf(10,64,56,78,34,56,78,90,34,51,23)
    marks.add(99)
    marks.add(98)
    println(marks)

    marks.remove(56)
    println(marks)

    //marks.size
    //marks.clear()
   // marks.last()
   // marks.first()

    //loop

    for (m in marks){
        if (m%2==0)
        println(m)
    }

}