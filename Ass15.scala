import scala.io.StdIn.{readInt,readFloat,readLine}
object Account {
  var cnt:Int=1000
  def getCnt():Int=
  {
      cnt=cnt+1
      return cnt
  }
//   def checkaccount(arr:Array[Account],acno:Int):Int=
//   {
//       for(i<-0 to (arr.length-1))
//       {
//           if(arr(i).getAccno()==acno)
//           return 1 
//       }
//       return -1
//   }
def checkaccount(arr:Array[Account], acno:Int):Int = {
  for(i <- arr.indices) {
    if(arr(i).getAccno() == acno)
      return i // Return the index instead of 1
  }
  return -1 // Return -1 if the account is not found
}

}
class Account
{
    private var accno:Int=0
    private var name:String=null
    private var balance:Float=0.0f
    private var minbal:Float=500.00f
    def this(name:String,balance:Float)=
    {
        this()
        this.accno=Account.getCnt()
        this.name=name
        this.balance=balance
        
    }
    def deposite(amt:Float)=
    {
        balance=balance+amt
    }
    def withdraw(amt:Float):Boolean=
    {
        if((balance-amt)<minbal)
        return false
        else
        {
            balance=balance-amt
            return true
            
        }
        
    }
    def viewBalance()={
        println(s"current balance=$balance")
        
    }
    override def toString()=
    {
        s"Account number=$accno\n Name=$name \n Balance=$balance"
        
    }
    def getAccno():Int={return accno}
    def getMinBalance():Float={return minbal}
    def setName(Name:String)=
    {
        this.name=name
    }
}
object Ass15
{
    def main(args:Array[String]):Unit=
    {
        println("Enter number of account to be opened")
        var n=readInt
        var arr=new Array[Account](n)
        var a=new Account()
        for(i<-0 to n-1)
        {
            println("Enter name and opening balance:")
            arr(i)=new Account(readLine,readFloat)
            println("congratulation your acconut opened")
            println(arr(i))
        }
        while(true){
            println("1)Withdraw \n 2)Deposite \n 3)View Balance\n 4)Exit")
            println("Enter your choice")
            var choice=readInt
            if(choice==4)
            return
            println("Enter account number to perform transaction")
            var ano=readInt
            var index:Int=Account.checkaccount(arr,ano)
            if(index == -1)
            println("wrong account number")
            else
            {
                
                choice match{
                    case 1=>println("Enter amount for transaction:")
                    var amt=readFloat
                    if(arr(index).withdraw(amt))
                    println("transaction successfull")
                    else
                    println("insufficient balance")
                    
                    case 2 =>println("enter the amount for transaction")
                    var amt=readFloat
                    arr(index).deposite(amt)
                    println("transaction successful")
                    case 3 =>arr(index).viewBalance()
                    
                }
            }
            
        }
        
    }
}