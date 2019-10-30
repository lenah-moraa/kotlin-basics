

class Cylinder {
    var radius: Int = 0
    var height: Int = 0
// functions

    fun volume() {
        var result = 22 / 7 * radius * radius * height

        println("The volume is $result")
    }

    fun surface_area() {
        var results = 22 / 7 * radius * radius * 2 + 22 / 7 *2* radius * height
        println("The surface area is $results")
    }
}


fun main(args: Array<String>) {
    var c1=Cylinder()
    c1.radius=14
    c1.height=28

    var c2=Cylinder()
    c2.radius=100
    c2.height=30

    c1.volume()
    c2.volume()
}
