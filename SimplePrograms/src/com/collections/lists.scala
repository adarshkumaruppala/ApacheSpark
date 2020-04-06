package com.collections

object lists {
 def main(args:Array[String]){
 var list1=List(1,2,3,4)
 var list0=List
 println(list1)
 var list2="a"::("b"::("c"::Nil))
 var list3=List()
 var list4=Nil
 println(list2)
 println(list2.head)
 println(list2.tail)
 println(list3.isEmpty) 
 println(list4.isEmpty);println(list1.isEmpty)
 var dimen=1::(2::(3::Nil))::0::(1::(2::Nil))::Nil
 var dimen1=(1::(2::(3::Nil)))::(0::(1::(2::Nil)))::Nil
 println(dimen)
 println(dimen1)
 println(dimen:::dimen1)
 println(List.concat(list1,1::(2::Nil)))
 println(list1.:::(list4))
 var fill=List.fill(2)(list1)
 var table=List.tabulate(3, 4)(_+_)
 println(fill+" "+table)
 println(list1.sum)
 println(list1.take(3))
 println(list1.takeRight(2))
 var a=list1.toArray
 for(i<-a){print(i)}
 println()
 println(a.length)
 println(a.max+ " "+a.min)
 println(a.mkString(" "))
 
 
  
  
  
  
  
  
  
  }
  
}