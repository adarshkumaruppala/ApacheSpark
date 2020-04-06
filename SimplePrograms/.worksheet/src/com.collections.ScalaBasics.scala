package com.collections
object ScalaBasics {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(30); 
  val addOne :Int=>Int=x=>x+1;System.out.println("""addOne  : Int => Int = """ + $show(addOne ));$skip(13); val res$0 = 
   addOne(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(92); 
  // addOne(2)
   val addTwo=new Function1[Int,Int](){
   def apply(x:Int):Int=x+2
   
   };System.out.println("""addTwo  : Int => Int = """ + $show(addTwo ));$skip(13); val res$1 = 
   addTwo(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(43); val res$2 = 
   
   
   Math.sqrt(4.0);System.out.println("""res2: Double = """ + $show(res$2));$skip(16);   //pure function
   
   var g=10;System.out.println("""g  : Int = """ + $show(g ));$skip(104); 
   def addg(i:Int,j:Int):Int={
    g=i+g+j//not a pure function as changing state every time
    g
   };System.out.println("""addg: (i: Int, j: Int)Int""");$skip(41); 
  //implicit j=23
  var v1=addg(2,_:Int);System.out.println("""v1  : Int => Int = """ + $show(v1 ));$skip(6); val res$3 = 
v1(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(11); 


def f1=3;System.out.println("""f1: => Int""");$skip(22); 
def f2(f:Any)=f +"hj";System.out.println("""f2: (f: Any)String""");$skip(7); val res$4 = 
f2(f1);System.out.println("""res4: String = """ + $show(res$4));$skip(29); 


def doubler(i:Int):Int=i*2;System.out.println("""doubler: (i: Int)Int""");$skip(11); val res$5 = 
doubler(3);System.out.println("""res5: Int = """ + $show(res$5));$skip(17); 
val d=doubler(_);System.out.println("""d  : Int => Int = """ + $show(d ));$skip(5); val res$6 = 
d(3);System.out.println("""res6: Int = """ + $show(res$6));$skip(14); 
val r= 1 to 3;System.out.println("""r  : scala.collection.immutable.Range.Inclusive = """ + $show(r ));$skip(15); val res$7 = 
r.map(doubler);System.out.println("""res7: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$7))}




}
