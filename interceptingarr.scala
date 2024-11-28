import scala.io.StdIn.readInt

object interceptingarr {
  def main(args: Array[String]): Unit = {
    println("Enter the size of the 1st Array:")
    val a = readInt()
    val arr1 = new Array[Int](a)
    println("Enter the elements of the 1st Array:")
    for (i <- 0 until a) {
      arr1(i) = readInt()
    }

    println("Enter the size of the 2nd Array:")
    val b = readInt()
    val arr2 = new Array[Int](b)
    println("Enter the elements of the 2nd Array:")
    for (i <- 0 until b) {
      arr2(i) = readInt()
    }

    // Find the intersection of two arrays
    val arr3 = arr1.intersect(arr2)

    println("The intersecting array is:")
    arr3.foreach(println)
  }
}
