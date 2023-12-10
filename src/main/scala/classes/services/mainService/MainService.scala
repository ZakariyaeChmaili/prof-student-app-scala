package classes.services.mainService

class MainService[T] extends IMainService[T] {

  protected var list: List[T] = List.empty

  override def delete(Uid: String): Option[T] = ???

  override def showAll: List[T] = 
    list

  override def add(item: T): Option[T] = ???

}
