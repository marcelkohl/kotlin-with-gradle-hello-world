fun main(args: Array<String>) {
    println("Hello World")

    class Dog(name:String, age:Int) {
      var name: String = name
      var age: Int = age

      fun info() {
        println("$name is an animal and has $age years old")
      }

      fun addAge(age: Int) {
        this.age += age
      }
    }

    var dog = Dog("Pretinha", 11)

    dog.info()
    dog.addAge(3)

    println(dog.age)
}
