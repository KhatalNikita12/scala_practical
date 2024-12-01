import scala.io.StdIn.{readLine,readInt,readFloat}
class player(pno:Int,pname:String,age:Int){
    override def toString()={
        s"pno:$pno\n Player Name:$pname \n Player age:$age"
    }
}
class CricketPlayer(pno:Int,pname:String,age:Int,noofinngs:Int,batavg:Float,ballavg:Float) extends player(pno,pname,age)
{
    override def toString()=s"pno:$pno\n Player Name:$pname \n Player age:$age \n number of innings:$noofinngs \n batting average:$batavg\n balling average:$ballavg"
    def getbatavg():Float=return batavg
}
class FootBallPlayer(pno:Int,pname:String,age:Int,noofgames:Int,noofgoal:Int) extends player(pno,pname,age)
{
    override def toString()=s"pno:$pno\n Player Name:$pname \n Player age:$age \n number of games:$noofgames \n number of goals:$noofgoal"
    def getgoal():Int=return noofgoal
}
object Ass17{
    def main(args:Array[String]){
        println("Enter how many number")
        var n=readInt
        var arr=new Array[player](n)
        for(i<-0 to n-1){
            println("enter the player detail(pno, name,age)")
            var pno=readInt
            var pname=readLine
            var age=readInt
            println("enter 1 for cricket player and 2 for football player")
            var ch=readInt
            if(ch==1){
                println("enter no of inning,batting avg and balling avg")
                arr(i)=new CricketPlayer(pno,pname,age,readInt,readFloat,readFloat)
                
            }
            else if(ch==2)
            {
                println("enter the no of games and no of goals")
                arr(i)=new FootBallPlayer(pno,pname,age,readInt,readInt)
                
            }
        }
        println("player whose batting avg >50")
        for(i<-0 to n-1){
            if(arr(i).getClass().getName().equals("CricketPlayer") && (arr(i).asInstanceOf[CricketPlayer]).getbatavg()>50)
            println(arr(i))
        }
        
         println("player whose goal  >50")
        for(i<-0 to n-1){
            if(arr(i).getClass().getName().equals("FootBallPlayer") && (arr(i).asInstanceOf[FootBallPlayer]).getgoal()>50)
            println(arr(i))
        }
    }
}