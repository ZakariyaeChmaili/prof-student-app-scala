package classes.services.StudentService

import classes.services.mainService.IMainService
import classes.types.Student
import classes.services.mainService.MainService

class StudentService extends MainService[Student] :


  override def delete(Uid: String): Option[Student] =
    list = list.filterNot(i => i.id == Uid)
    var student: Option[Student] = list.find(i => i.id == Uid)
    student



  override def show(Uid: String): Option[Student] = {
    var item  = list.find(i => i.id==Uid).get
    Some(item)
  }

    
