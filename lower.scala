import scala.io.StdIn.readLine

object lower {
 
  def main(args: Array[String]): Unit = {
   println("enter the String")
   var str=readLine
    var cnt=0
    var output=""
  for(i<-str){
      if(i.isLetter && i.isUpper)
      cnt=cnt+1
      output=output+i.toLower
  }
  println("upper case ",cnt)
  println("String:",output)
  }
}
