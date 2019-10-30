class BetterCylinder(radius:Double, height:Double){

        var _radius:Double=radius
        var _height:Double=height
        fun volume() {
            var result = 22 / 7 * _radius * _radius * _height

            println("The volume is $result")
        }

        fun surface_area() {
            var results = 22 / 7 * _radius * _radius* 2 + 22 / 7 *2* _radius * _height
            println("The surface area is $results")
        }
    }


fun main(args: Array<String>) {
    var c1=BetterCylinder(17.0,100.0)
    var c2=BetterCylinder(7.0,15.0)
    var c3=BetterCylinder(12.55,89.0)
    var c4=BetterCylinder(18.90,1300.0)
    var c5=BetterCylinder(123.0,780.0)

    c3.volume()
    c3.surface_area()
    var cylinder= arrayListOf<BetterCylinder>(c1,c2,c3,c4,c5)
    for (s in cylinder){
        s.volume()

    }

    cylinder.forEach { s->s.surface_area() }
     var results=cylinder.filter { s->s._radius>50 }
}