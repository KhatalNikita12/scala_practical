import scala.io.StdIn.readInt

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Enter the size of the 1st Array:")
    val a = readInt()
    val arr1 = new Array[Int](a)
    println("Enter the elements of the 1st Array:")
    for (i <- 0 until a) {
      arr1(i) = readInt
    }
    var result=arr1.filter(x => x % 3 == 0 && x % 5 == 0)
    println("Divisible of 3 and 5")
    for(i<-result)
    println(i)

  
  }
}
