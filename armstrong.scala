import scala.io.StdIn.{readLine}
import scala.math.pow
object armStrong
{
    def main(args:Array[String]):Unit={
        println("enter the number")
        var n=readLine
        var len=n.length()
        var nm=n.toInt
        var sum:Int=0;
        var n1=nm
        while(n1!=0){
            var rem=n1%10
            sum=sum+(pow(rem,len)).toInt
            n1=n1/10
            
        }
        if(sum==nm)
        println(nm,"is ArmStrong")
        else
         println(nm,"is not ArmStrong")
        
    }
}
