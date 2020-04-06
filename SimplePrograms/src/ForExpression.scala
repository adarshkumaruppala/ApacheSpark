

object ForExpression {
  def main(args:Array[String]):Unit={
    //using for expression
    
    println("-------countries with more CORONA cases-------")
     println("\n")
    for(country<-List("USA","ITALY","SPAIN","CHINA","INDIA","JAPAN")){
      country match{
        case "USA"  => println(country+" : More than 3 laks")
        case "ITALY" => println(country+" : more than 1.3 laks")
        case "SPAIN" => println(country+ " : more than 1 lak")
        case "CHINA" => println(country+ " : more than 85 k ")
        case _ => println(country+" : less than 10 k ")
      }
    }
   println("\n\n")
    val stateList=List("MH","TN","KL","TS","AP")
    println("------------ TOP 5 CORONA STATES--------")
    println("\n")
    stateList.foreach(state => state match{
      case "MH" => println(state + " :1000 cases till now")
      case "TN" => println(state + " :1200 cases till now")
      
      case "KL" => println(state + " :780 cases till now")
      
      case "TS" => println(state + " :480 cases till now")
      case "AP" => println(state + " :400 cases till now")
      case  _=> println(state + " :LESS THAN 200")
    
    })
    
    println("\n\n")
    println("--------districts with Corona cases----------")
    println("\n")
    val s=for(dist<-List("hyd","nzb","mdk","sdp","kammam"))yield{
      dist match{
        case "hyd"  =>  (dist, 120 )
        case "nzb" =>  (dist,60) 
        case "mdk" => (dist,40) 
        case "sdp" =>(dist,30) 
        case _=> (dist,"less than 30")
        
        
      }
    }
   print(s)
    
    // more on for loops 
   for{i<- 1 to 3 ; if(i%2==0)
       j<- 1 to 2}
     println(s"i=$i   j=$j")
   
    
    
    
  }
}