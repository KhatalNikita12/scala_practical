import scala.io.StdIn.{readFloat}
abstract class shape(dim1:Float,dim2:Float,dim3:Float){
    def area():Float
    def perimeter():Float
    def volume():Float
    final val pi:Float=3.142f
}
class circleshape(r:Float) extends shape(r:Float,0.0f,0.0f){
    def area():Float=return pi*r*r
    def perimeter():Float=return 2*pi*r
    def volume():Float=return 0.0f
}

class reactangleshape(l:Float, b:Float) extends shape(l:Float,b:Float,0.0f){
    def area():Float=return l*b
    def perimeter():Float=return 2*(l+b)
    def volume():Float=return 0.0f
}
class coneshape(r:Float,h:Float,l:Float) extends shape(r:Float,h:Float,l:Float){
    def area():Float=return pi*r*(r+l)
    def perimeter():Float=return 0.0f
    def volume():Float=return 0.33f*pi*r*r*h
}
object Ass18{
    def main(args:Array[String]):Unit={
        println("enter radius of circle")
        var c=new circleshape(readFloat)
        println("Area of Circle is:"+c.area())
        println("circumference of circle:"+c.perimeter())
        
         println("enter length and breath of rectangle")
        var r=new reactangleshape(readFloat,readFloat)
        println("Area of rectangle is:"+r.area())
        println("perimeter of rectangle:"+r.perimeter())
        
           println("enter  radius ,height and length   of cone")
        var cs=new coneshape(readFloat,readFloat,readFloat) 
        println("Area of Cone is:"+cs.area())
        println("Volume of Cone:"+cs.volume())
        
    }
}