
//higher order functions
object HigherFunc {//object ie singleton object as there is no support for static in scala
  def math(x:Int,y:Int,sum:(Int,Int)=>Int):Int=sum(x,y)
  def mathh1(x:Int,y:Int,sub:(Int,Int)=>Int):Int=sub(x,y)
  def sub(a:Int,b:Int):Int=a-b
  
  
   def main(args:Array[String])//main method
  {
    val result=math(2,3,(x,y)=>x+y)
    println(result)
    var result2=mathh1(3,2,sub)
    println(result2)
    println(sum(x=>x,1,2))
    val sumOfSquares=sum(x=>x*x ,1,2)
    //applySums((x,y)=>x+y)
    applySums(f)
  }
  def sum(f:Int=>Int,a:Int,b:Int):Int={
    if(a>b)0
    else f(a)+sum(f,a+1,b)
    
  }
  def f(a:Int,b:Int):Int=b-a
  def applySums(sub1:(Int,Int)=>Int)=print(sub1(1,4))
  
  
          
  
  
}