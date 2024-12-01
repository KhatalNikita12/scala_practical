import scala.io.StdIn.{readFloat}
trait resizable{
    def resizeWidth(width:Float):Unit
    def resizeHeight(height:Float):Unit
}
trait drawable{
    def draw():Unit
}
class Rectangle (var width:Float, var height:Float) extends resizable with drawable{
    override def toString()={
        s"Width:$width and Height:$height"
    }
    def resizeWidth(width:Float):Unit={
        this.width=this.width+width
    }
    def resizeHeight(height:Float):Unit={
        this.height=this.height+height
    }
    def draw():Unit={
        println("rectangle is drawn")
    }
}
object Ass19{
    def main(args:Array[String])
    {
        println("Enter width and height ")
        var rect=new Rectangle(readFloat,readFloat)
        rect.resizeWidth(4.0f)
        rect.resizeHeight(5.0f)
        println("new rectangle="+rect)
        rect.draw()
    }
}