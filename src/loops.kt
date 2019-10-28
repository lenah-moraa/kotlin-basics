fun main(args: Array<String>) {
//    loops
    for (x in 1..20){
        if (x==7)
            continue
        if (x==17)
            break
        println(x)



    }

    println("-------------while loop-----------")

    var z=1
    while (z<=100){

        println("lenah $z")
        z+=2
    }

    println("----------do while loop--------")
    var k=10
    do {
        println("k is $k")
        k++
    }
        while (k<=100)
}

//fizzbuzz
//3==fizz
//5==buzz
//3 and 5==fizzbuzz
