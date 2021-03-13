fun main(args: Array<String>) {
  var age : Int = 40
  var weight : Double = 56.4
  var candy : String = "xSnickers"
  var catIsAlive: Boolean = false

  var canRideCar : Boolean = age >= 18
  var isCandyGood : Boolean = candy == "Chocolate"

  // print(canRideCar)
  // print(isCandyGood)

  if (catIsAlive) {
    println("The cat lives!")
  } else {
    println("RIP the cat :(")
  }

  if (candy !== "Snickers") {
    println("Candy must be a snickers :\\")
  } else {
    println("Yeah, we have snickers :D")
  }
}
