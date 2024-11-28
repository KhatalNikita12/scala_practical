import scala.io.StdIn.{readInt}
object perfectinarr{
    def main(args:Array[String])
    {
        println("Enter how many number")
        var n1=readInt
        var arr=Array[Int]()
        for(i<-1 to n1){
            println("ENter The Number")
            var n=readInt
            var sum=0
            for(j<-1 to n/2)
            {
                if(n%j==0){
                    sum=sum+j
                }
            }
            if(n==sum)
            arr=arr:+n
        }
        println("perferct numbre are:")
        for(i<-arr)
        println(i)
        }
        
    
}