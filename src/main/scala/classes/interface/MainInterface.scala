package classes.interface

import scala.io.StdIn

class MainInterface {

  def input(text: String): String = {
    print(text)
    StdIn.readLine
  }


//   def form[T]( item : T) : Unit = {
//     var res = new T
//     var fields =  item.getClass().getDeclaredFields()
//     if(item.getClass().getSuperclass()!=null){
//         fields = fields.:++(item.getClass().getSuperclass().getDeclaredFields())
//     }

//     fields.foreach(f=>{
//        res.(f.getName()) = input(f.getName()+" :")
//     })

    
//   }

}
