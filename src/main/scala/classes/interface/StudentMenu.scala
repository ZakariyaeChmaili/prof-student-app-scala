package classes.interface

import scala.io.StdIn
import classes.types.Student

object StudentMenu {

  def studentMenu: Int = {
    println("-" * 5 + "Gestion Students" + "-" * 5)
    println("1-Display All Students")
    println("2-Add Student")
    println("3-Delete Student")
    println("0-Back")
    print("Please Select An Option : ")
    var option: Int = StdIn.readInt()
    option
  }

  def studentForm: Student = {
    var s = new Student
    print("First Name :")
    s.firstName = StdIn.readLine()
    print("Last Name :")
    s.lastName = StdIn.readLine()
    print("Age :")
    s.age = StdIn.readInt()
    print("Scholar Year :")
    s.year = StdIn.readLine()
    print("Major :")
    s.major = StdIn.readLine()
    s
  }

  def deleteStudentForm: String = {
    print("Student ID :")
    StdIn.readLine()
  }

    def displayStudentList(students: List[Student]): Unit = {
      // Print table header
      println(
        f"${"ID"}%-36s ${"First Name"}%-15s ${"Last Name"}%-15s ${"Age"}%-5s ${"Year"}%-10s ${"Major"}"
      )

      // Print each student's information
      students.foreach { s =>
        println(
          f"${s.id}%-36s ${s.firstName}%-15s ${s.lastName}%-15s ${s.age}%-5d ${s.year}%-10s ${s.major}"
        )
      }
    }
  

}
