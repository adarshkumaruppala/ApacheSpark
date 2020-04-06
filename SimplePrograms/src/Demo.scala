

object Demo {
  def main(args:Array[String]){
    println("hello")
    var x=new Hello(2,3)
    println(x.sum())
    var y=new Hii()
    print(y.sub(5,1))
  }
  
}
class Hello(x:Int,y:Int){
  def sum()={
    x+y
  }
}
class Hii{
  def sub(x:Int,y:Int)={
      x-y
  }
}