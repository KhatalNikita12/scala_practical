import scala.io.StdIn.{readInt}
object div3n5 {
   def main(args: Array[String]) {
      println("enter the number");
      var n:Int=readInt;
      var output=for(i<-1 to n ; if i%3==0 ;if i%5==0)
      yield i
      println(output)
   }
}