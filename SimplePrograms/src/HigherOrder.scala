

object HigherOrder {
  def  main(args:Array[String]):Unit={
    println(sumOfSquraes(x=>x*x, 1, 4))
    val square=sumOfSquraes(x=>x,_:Int , _:Int)
    print(square(1,4))
  }
  def sumOfSquraes(f:Int=>Int,a:Int,b:Int):Int={
    if(a>b)b
    else f(a)+sumOfSquraes(f, a+1, b)}
    
}