package classes.services.mainService

trait IMainService[T] {
  

    def showAll : List[T] 
 
    def delete(Uid : String) : Option[T]

    def add(item : T) : Option[T]



}
