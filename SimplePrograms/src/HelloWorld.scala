

object HelloWorld {
  def main(args:Array[String]){
    var name="adarsh"
    var age=22
    var love=" "
    println(" %s is %d years old".format(name,age))
    println(s"$name is $age years old")
    println(f" $name is $age years old")
    println(raw"hello \t\tworld")
     println("hello \t\tworld")
    if (age>20){
      love="yes can be a lover\n"
      
    }
    else{
      love="stil has to wait\n"
    }
    print(love)
    println(if(age==22)"if block" else print("else"))
    
    for(i<-1 until (5)){
      print("hii  ")
    }
    println()
    var array=Array(1,1,3,4)
    
    for(i<-array; j<- 1 to 2){
      println("(i "+i+") ( j"+j+") ")  
    }
    
    
  }
}