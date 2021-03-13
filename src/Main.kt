fun main(args: Array<String>) {
  for (count in 1..10) {
    println(count)
  }

  for (count in 5..8) {
    println(count)
  }

  var topCandies : MutableList<String> = mutableListOf("Snickers", "Milka", "Lindt")

  for (candy in topCandies) {
    println(candy)
  }
}
