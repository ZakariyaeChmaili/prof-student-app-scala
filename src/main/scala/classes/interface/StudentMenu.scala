package classes.interface

import scala.io.StdIn
import classes.types.Student
import classes.services.StudentService.StudentService

object  StudentMenu extends MainInterface {

  val studentService = new StudentService

  def studentMenu: Int = {
    println("-" * 5 + "Gestion Students" + "-" * 5)
    println("1-Display All Students")
    println("2-Show Student By Id")
    println("3-Add Student")
    println("4-Delete Student")
    println("0-Back")
    Integer.parseInt(input("Please Select An Option : "))
  }

  def studentForm: Student = {
    var s = new Student

    s.firstName = input("First Name :")
    s.lastName = input("Last Name :")
    s.age = Integer.parseInt(input("Age :"))
    s.year = input("Scholar Year :")
    s.major = input("Major :")
    s
  }

  def displayStudentList(students: List[Student]): Unit = {
    println(
      f"${"ID"}%-36s ${"First Name"}%-15s ${"Last Name"}%-15s ${"Age"}%-5s ${"Year"}%-10s ${"Major"}"
    )

    students.foreach { s =>
      println(
        f"${s.id}%-36s ${s.firstName}%-15s ${s.lastName}%-15s ${s.age}%-5d ${s.year}%-10s ${s.major}"
      )
    }
  }

  def showStudent(s: Student): Unit = {

    println(
      f"${"ID"}%-36s ${"First Name"}%-15s ${"Last Name"}%-15s ${"Age"}%-5s ${"Year"}%-10s ${"Major"}"
    )

    println(
      f"${s.id}%-36s ${s.firstName}%-15s ${s.lastName}%-15s ${s.age}%-5d ${s.year}%-10s ${s.major}"
    )

  }

  def studentApp(): Unit = {
    var flag = true
    while (flag) {
      studentMenu match
        case 0 => flag = false
        case 1 =>
          displayStudentList(studentService.showAll)
        case 2 =>
          var student: Option[Student] =
            studentService.show(input("Student ID :"))
          if (student != None)
            showStudent(student.get)
        case 3 =>
          studentService.add(studentForm)
        case 4 =>
          studentService.delete(input("Student ID :"))
        case _ =>
          println("!! Please choose a right Option !!")

    }
  }

}
