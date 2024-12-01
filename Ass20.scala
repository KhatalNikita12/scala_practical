object Ass20{
    def main(args:Array[String]){
        println("List in Lisp Style")
        var list1=100::200::300::Nil
        println(list1)
        println("List in Java")
        var list2=List("Apple","Banana")
        println(list2)
        println("List Using Range ")
        var list3=List.range(1,10)
        println(list3)
        println("List using fill")
        var list4=List.fill(5)("Hello")
        println(list4)
        println("list Using tabulate method")
        var list5=List.tabulate(10)(n=>n*n*n)
        println(list5)
        
    }
}