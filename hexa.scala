import scala.io.StdIn.readInt

object hexa {
    def decimaltohex(n:Int):Unit={
        if(n!=0){
            decimaltohex(n/16)
            var ch='A'
            n match{
                case x if(x%16<10)=>printf("%d",n%16)
                case _=> printf("%c",(ch+((n%16)-10)))
            }
        }
    }
  def main(args: Array[String]): Unit = {
   println("enter the number")
   var n=readInt
decimaltohex(n)
  
  }
}
