package classes.types

class Student(
    var year: String,
    var major: String,
    firstName: String,
    lastName: String,
    age: Int
) extends Person(firstName = firstName, lastName = lastName, age = age):
  def this() =
    this(null, null, null, null, 0)

  def this(year: String, major: String) =
    this(year, major, null, null, 0)

  override def toString(): String =
    super.toString() + s" year = $year, major = $major"
