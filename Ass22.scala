import scala.collection.mutable.Set
object HelloWorld{
  def main(args:Array[String]){
       var s1=Set(1,2,3,4)
   var s2=Set(4,7,9)
   println("First set="+s1)
   println("second set="+s2)
   s1+=10
   println("First set after="+s1)
   s2++==List(24,86,97)
   println("Second set after="+s2)
   s1.add(45)
   println("First set after="+s1)
   println("common element are:"+s1.intersect(s2))
    
  }
    
}