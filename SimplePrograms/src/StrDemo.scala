

object StrDemo {
  var str1 ="hello World"
  var str2=" india"
  val num=45
  val num2=2
  println(2.+(4))
  println(2+4)
  var sum=(x:Int,y:Int)=>x+y
  
  def main(args:Array[String]){
    println(str1.concat(str2))
    println("helo %s %s %d".format(str1,str2,num*num2))
    println(sum(1,2))
    var z=sum(2,_:Int)//partial functioning
    println(z(4))
    
    
  }
}









