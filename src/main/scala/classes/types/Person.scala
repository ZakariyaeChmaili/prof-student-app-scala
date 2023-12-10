package classes.types

import java.util.UUID

class Person(val id : String,var firstName : String, var lastName :String, var age : Int):
    def this() = 
        this(UUID.randomUUID().toString(),null,null,0)

    def this(firstName :String , lastName : String , age : Int)= 
        this(UUID.randomUUID().toString(),firstName,lastName,age)
    override def toString(): String = 
        s"Person : id = $id firstname = $firstName , lastname = $lastName, age = $age"

