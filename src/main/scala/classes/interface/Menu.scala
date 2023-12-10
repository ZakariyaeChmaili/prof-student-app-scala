package classes.interface

import scala.io.StdIn
import scala.annotation.switch
import classes.services.StudentService.StudentService
import classes.types.Student

object Menu extends MainInterface {
  def startApp: Unit = {
    var flag = true
    val studentService = new StudentService()
    studentService.add(new Student() {
      firstName = "zakariyae"; lastName = "chamili"
    })

    while (flag) {
      this.mainMenu match
        case 1 =>
          StudentMenu.studentApp()
        case 2 => ProfMenu.profMenu
        case 0 => flag = false
        case _ =>
          println("!! Please choose a right Option !!")

    }
    println("-" * 5 + "♥ See You ♥" + "-" * 5)

  }

  def mainMenu: Int =
    println("-" * 5 + "Welcome" + "-" * 5)
    println("1-Gestion Students")
    println("2-Gestion Profs (Currentlty Not Available)")
    println("0-exit")
    print("Please Select An Option : ")
    var option: Int = StdIn.readInt()
    option

}
