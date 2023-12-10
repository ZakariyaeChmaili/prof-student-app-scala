package classes.interface

import scala.io.StdIn

object ProfMenu {

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
