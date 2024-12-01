import scala.io.StdIn.{readLine}
object Ass23{
    def lowerToUpper(ch:Char):Char={
        if(ch.isLower){
            return(ch.toByte-32).toChar
        }
        else
        return ch
    }
    def main(args:Array[String])
    {
        println("Enter the String")
        var str:String=readLine
        var str1=str.map(lowerToUpper)
        println("Resulting String"+str1)
    }
}