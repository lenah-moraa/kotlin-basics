fun main(args: Array<String>) {
    var text ="the quick brown fox jumped over a lazy dog"
    println(text.toUpperCase())

    var upper =text.toUpperCase()
    println(upper)

    print("please enter your age")
    var age = readLine()

    print("your age is $age")
    println("please enter your name")
    var name= readLine()
    var splitted=name?.split(" ")
    var firstname =splitted?.get(0) ?:"guest"//?null check
    var lastname =splitted?.get(1)?:"guest"//?: elvis operator provides alternative
    println("your first name is $firstname and your last name is $lastname")



    }

