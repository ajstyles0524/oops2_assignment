package OOPS_Assignment_2

class Person(var name: String, var age: Int) extends Ordered[Person]
{

  def compare(that: Person): Int = {

    if (that.name == this.name) this.age.compare(that.age)

    else this.name.compare(that.name)
  }

}

object Person
{

  def main(args: Array[String]): Unit =
  {

    val personOne = new Person("Testing", 32)
    val personTwo = new Person("Testing", 45)
    println(personOne < personTwo)
    println(personOne > personTwo)
    personOne.name ="Testing Again"
    println("\n"+(personOne < personTwo))
    println(personOne > personTwo)

  }
}