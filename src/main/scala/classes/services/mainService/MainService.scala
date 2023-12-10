package classes.services.mainService

class MainService[T] extends IMainService[T] {

  protected var list: List[T] = List.empty

  override def delete(Uid: String): Option[T] = ???

  override def showAll: List[T] = 
    list

  override def add(item: T): Option[T] = {
    this.list = this.list :+ item
    Some(item)
  }

  override def update(item: T): Option[T] = {
    var index : Int  = this.list.indexOf(item)
    list = list.updated(index,item)
    Some(item)
  }

  override def show(Uid : String)  : Option[T] = ???

}
