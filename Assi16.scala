/* Online Scala Compiler */
import scala.io.StdIn.{readInt,readFloat,readLine}
object Student {
  var cnt:Int=1000
  def getId():Int=
  {
      cnt=cnt+1
      return cnt
  }


}
class Student
{
    private var id:Int=0
    private var name:String=null
     private var course:String=null
    def this(name:String,course:String)=
    {
        this()
        this.id=Student.getId()
        this.name=name
        this.course=course
        
    }
    
 
 
    override def toString()=
    {
        s"Id =$id\n Name=$name \n course=$course"
        
    }
    def getId():Int={return id}
     // Getters
  def getName(): String = name
  def getCourse(): String = course
  
    def setName(Name:String)=
    {
        this.name=name
    }
    def setCourse(Course:String)=
    {
        this.course=course
    }
}
object Assi16
{
    def main(args:Array[String]):Unit=
    {
        println("Enter number of student ")
        var n=readInt
        var arr=new Array[Student](n)
        var a=new Student()
        for(i<-0 to n-1)
        {
            println("Enter name and course name:")
            arr(i)=new Student(readLine,readLine)
            println("congratulation you take addmission")
            println(arr(i))
        }
       
    while(true){
        
        println("Enter course name to search")
       var searchCourse = readLine
         println(s"Students enrolled in course '$searchCourse':")
    for (student <- arr) {
      if (student.getCourse() == searchCourse) {
        println(student.getName())
      }
    }
   
    
    }
  

     
 
        
    }
}