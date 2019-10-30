import kotlin.reflect.jvm.internal.impl.utils.NumbersKt

fun main(args: Array<String>) {
   // println(add(10,20))
    //println(add(m=15))

    println(addMany(10.0,3.1,20.0,50.7,12.22,16.0,12.0))

   // var heights= doubleArrayOf(12.0,10.0,3.1,20.1,11.0,12.11,13.0,)
    //var total=addMany(*heights)
   // println(total)

    //var numbers= arrayOf(10,21,16,36,34,15,18,45,78,45,12,31.9)
   // println(findMax(*numbers))




}


fun add(k:Int=5,m:Int):Int{
    var result =k+m
    return result



}

fun multiply(x:Int,y:Int):Int
{
    return x*y
}


fun addMany(vararg numbers:Double):Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }

    return sum
}



