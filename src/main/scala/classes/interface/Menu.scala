package classes.interface

import scala.io.StdIn
import scala.annotation.switch
import classes.services.StudentService.StudentService
import classes.types.Student

object Menu {
  def startApp: Unit = {
    var flag = true
    val studentService = new StudentService()
    studentService.add(new Student() {
      firstName = "zakariyae"; lastName = "chamili"
    })

    while (flag) {
      this.mainMenu match
        case 1 =>
          var flag = true
          while (flag) {
            StudentMenu.studentMenu match
              
              case 0 => flag = false
              case 1 =>
                StudentMenu.displayStudentList(studentService.showAll)
              case 2 =>
                studentService.add(StudentMenu.studentForm)
              case 3 =>
                studentService.delete(StudentMenu.deleteStudentForm)
              case _ =>
                println("!! Please choose a right Option !!")

          }

        case 2 => this.profMenu
        case 0 => flag = false
        case _ =>
                println("!! Please choose a right Option !!")

    }
    println("-" * 5 + "♥ See You ♥" + "-" * 5)

  }

  def mainMenu: Int =
    println("-" * 5 + "Welcome" + "-" * 5)
    println("1-Gestion Students")
    println("2-Gestion Profs")
    println("0-exit")
    print("Please Select An Option : ")
    var option: Int = StdIn.readInt()
    option

  def profMenu: Int = {
    println("-" * 5 + "Gestion Profs" + "-" * 5)
    println("1-Display All Profs")
    println("2-Add Prof")
    println("3-Delete Prof")
    println("0-Back")
    print("Please Select An Option : ")
    var option: Int = StdIn.readInt()
    option
  }

}
