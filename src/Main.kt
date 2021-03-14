fun main(args: Array<String>) {
  fun hello() {
    println("Hello World")
  }

  hello()

  fun addAndPrnt(number1: Int, number2: Int) {
    println(number1 + number2)
  }

  addAndPrnt(2, 5)

  fun addIfExistsAndPrint(number1: Int = 0, number2: Int = 0): Int {
    var result : Int = number1 + number2

    println(result)

    return result
  }

  addIfExistsAndPrint(number2 = 8)

  fun printOptionalIfExists(name: String, age: Int = 0) {
    println("name is $name and age is $age")
  }

  printOptionalIfExists("Roger")

  fun calculateForMe(number1: Int, number2: Int): Int {
    return addIfExistsAndPrint(number1, number2)
  }

  println("calculation is " + calculateForMe(2, 3))

}
