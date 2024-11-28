import scala.io.StdIn.readInt

object transpose {
  def main(args: Array[String]): Unit = {
    println("Enter the rows")
    val r= readInt
    println("Enter the clos")
    val c = readInt
    val arr1 =  Array.ofDim[Int](r,c)
    println("Enter the elements of the 1st Array:")
    for (i <- 0 until r) {
        for(j<-0 until c){
      arr1(i)(j) = readInt
        }
    }
   println("Original matrix")
   for (i <-0 until r) {
        for(j<-0 until c){
      
      print(arr1(i)(j) +"\t")
      
        }
        println() 
    }

  println("Transpose matrix is:")
  for(i<-0 until c)
  {
      for(j<-0 until r){
          print(arr1(j)(i)+"\t")
      }
      println()
  }
  }
}
