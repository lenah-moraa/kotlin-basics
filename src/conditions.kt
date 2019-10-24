import kotlin.test.fail

fun main(args: Array<String>) {
    var age=10
    if (age>19){

        println("mature")
    }
    else{
        println("immature")
    }

    var score= 65
    when (score){

        in 90..100-> println('A')
        in 80..89-> println('B')
        in 70..79-> println('C')
        in 60..69-> println('D')
        in 50..59-> println('E')
        else-> println("fail")

    }


    var day=6
    when (day){

        1-> println("monday")
        2-> println("tuesday")
        3-> println("wednesday")
        4-> println("thursday")
        5-> println("friday")
        6-> println("saturday")
        7-> println("sunday")

        else-> println("invalid day")
    }
}