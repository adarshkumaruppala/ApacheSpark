

object ImplicitProgram extends App {
  def sumAdd( y:Int)(z:Int)( implicit x:Int)=x+y+z
  implicit var z=10
  var a=sumAdd(5)(7)
  println(a)
 class CustomInt(val num:Int){
    def multiply=num*num
  }
  implicit def mul(num:String)=new CustomInt(num.toInt)
  println("23".multiply)
   
}