import sun.java2d.Surface
import javax.swing.tree.FixedHeightLayoutCache

fun main(args: Array<String>) {
    var  a=volume(10f,7f
    )
   var b=volume(55f,71.99f)

    println(a)
    println(b)


    println(splitnames("john musa"))
    println(splitnames("mary jane"))

    println(add(10,20,30))
    println(add(20,20))
    var test="aaaaaaaaaaBbbbbbbbbbbc"
    test=test.replace("c","x",ignoreCase =true)
    println(test)

    surface_area(24f,16f)
    surface_area(67f,56f)
}

fun volume(height:Float,radius:Float):Float {

    var v = 22 / 7 * height * radius * radius
    println("volume of the cylinder is $v")
    return v;

}

fun surface_area(radius:Float,height: Float):Float{

    var s=2*22/7*radius* height + 2* 22/7*radius* height
    println("surface area of a cylinder is $s")
    return s

}

fun splitnames(fullnames:String): List<String>
{
    var splitted =fullnames.split(" ")
    return splitted
}

fun add(a:Int,b:Int,c:Int=0):Int{
    return a + b + c
}