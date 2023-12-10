package classes.services.StudentService

import classes.services.mainService.IMainService
import classes.types.Student
import classes.services.mainService.MainService

class StudentService extends MainService[Student] :

  override def add(item: Student): Option[Student] =
    list = list :+ item
    Some(item)

  override def delete(Uid: String): Option[Student] =
    list = list.filterNot(i => i.id == Uid)
    var student: Option[Student] = list.find(i => i.id == Uid)
    student

    
