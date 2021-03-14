fun main(args: Array<String>) {
  class Dog(name: String, age: Int) {
    var name : String = name
    var age : Int = age
  }

  var dog = Dog("Junky", 10)

  println(dog.name)

  dog.name = "New Fido"

  println(dog.name)
  println(dog.age)
}
