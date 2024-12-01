object Ass21{
    def main(args:Array[String]){
        var list1=List("Apple","Banana","Dates","Cherry")
        var list2=List("Rose","Jasmin","Lilly")
        println("Concatination Using ++")
        println(list1++list2)
        println("Concatination Using :::")
        println(list1:::list2)
        println("Using Conacte method")
        var list3=List.concat(list1,list2)
        println(list3)
        println("in Ascending order")
        println(list1.sortWith(_<_))
           println("in descending order order")
        println(list1.sortWith(_>_))
    }
}