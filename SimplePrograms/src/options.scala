

object options extends App {
  
  var list=List.range(1, 4)
  var names=Map("uppala"->"adarsh","konda"->"raviteja")
  println("the value of key uppala is "+show(names.get("uppala")))
    println("the value of key uppala is "+show(names.get("konda")))
  println(" the value of kandani is "+show(names.get("kandadi")))
   def show(x:Option[String])=x match{
    case Some(x) =>x
    case None=>"--- the mentioned key is not present in the map"
  }
  def findEven(x:Option[Int]):Boolean={
    x match{
      case Some(x) if x%2==0 => true
      case Some(x) if x%2!=0 => false
    }
  }
  def findOdd(x:Int):Option[Boolean]={
    x match{
      case x if x%2==1 =>Some(true)
      case x if x%2!=10 => None
    }
  }
   for(i<-list){
    i match{
        case i if findOdd(i)==Some(true) => println(s"$i is  odd")
      // case i if findOdd(i)==Some(i) => println(s"$i is  odd")
      case i if findOdd(i)==None => println(f"$i is even") 
    }}
  for(i<-list){
    i match{
      case i if findEven(Some(i))==true => println(s"$i is even")
      case i if findEven(Some(i))==false => println(f"$i is odd")
   
    }
  }
  
}