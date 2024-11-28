/* Online Scala Compiler */
import scala.io.StdIn.{readInt}
import scala.util.control._
import scala.util.control.Breaks._
object primebreak {
   def main(args: Array[String]) {
    println("Enter how many number")
    var n:Int=readInt;
    val outerloop=new Breaks
   outerloop.breakable{ for(i<-1 to n){
        println("Enter the number to check prime or not");
        var n1=readInt
        if(n1==2 || n1==3)
        print(n1)
        else if(n1%2==0)
        outerloop.break
        else {
        val innerloop=new Breaks
        innerloop.breakable{
            for(j<-3 to n1-1 by 2)
          {
              if(n1%j==0)
                outerloop.break
          }
           println(n1)   
        }
      
        
    }
       
   }
   }
}
}