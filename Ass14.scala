import scala.io.StdIn.{readLine,readChar}
object Ass14{
    def main(args:Array[String]){
        println("enter the String")
        var s=readLine
        println("enter the character")
        var ch=readChar
        var cnt=0
        for(i<-s; if (i==ch))
        cnt=cnt+1
       println("character "+ch+" found "+cnt+" times")
        var output= if(ch.isDigit) s.replace(ch,'*')
        else if(ch.isLetter) s.replace(ch,'?')
        else s.replace(ch,'@')
         
         println("new Sting is:"+output)
    }
    
}