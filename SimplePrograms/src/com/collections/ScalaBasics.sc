package com.collections
object ScalaBasics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val addOne :Int=>Int=x=>x+1                     //> addOne  : Int => Int = com.collections.ScalaBasics$$$Lambda$8/288665596@7c75
                                                  //| 222b
   addOne(1)                                      //> res0: Int = 2
  // addOne(2)
   val addTwo=new Function1[Int,Int](){
   def apply(x:Int):Int=x+2
   
   }                                              //> addTwo  : Int => Int = <function1>
   addTwo(1)                                      //> res1: Int = 3
   
   
   Math.sqrt(4.0)  //pure function                //> res2: Double = 2.0
   
   var g=10                                       //> g  : Int = 10
   def addg(i:Int,j:Int):Int={
    g=i+g+j//not a pure function as changing state every time
    g
   }                                              //> addg: (i: Int, j: Int)Int
  //implicit j=23
  var v1=addg(2,_:Int)                            //> v1  : Int => Int = com.collections.ScalaBasics$$$Lambda$9/1239731077@2133c8f
                                                  //| 8
v1(4)                                             //> res3: Int = 16


def f1=3                                          //> f1: => Int
def f2(f:Any)=f +"hj"                             //> f2: (f: Any)String
f2(f1)                                            //> res4: String = 3hj


def doubler(i:Int):Int=i*2                        //> doubler: (i: Int)Int
doubler(3)                                        //> res5: Int = 6
val d=doubler(_)                                  //> d  : Int => Int = com.collections.ScalaBasics$$$Lambda$10/885951223@b684286
                                                  //| 
d(3)                                              //> res6: Int = 6
val r= 1 to 3                                     //> r  : scala.collection.immutable.Range.Inclusive = Range 1 to 3
r.map(doubler)                                    //> res7: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6)




}