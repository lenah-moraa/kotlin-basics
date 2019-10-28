fun main(args: Array<String>) {
    for (j in 1..100)
        if (j%3==0)
            println("fizz $j")
    println("-------buzz------")

    for (q in 1..100)
        if (q%5==0)
            println("buzz $q")

    println("----------fizzbuzz-------")

    for (w in 1..100)
        if (w%3==0 && w%5==0)
            println("fizzbuzz $w")


}