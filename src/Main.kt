fun main(args: Array<String>) {
  var topCandies : List<String> = listOf("Snickers", "Lindt")
  var badCandies : Array<String> = arrayOf("xxxxx one", "yyyy other")
  var similarCandies : MutableList<String> = mutableListOf("Xnickers", "Nindt")

  // topCandies[0] = "A new good one" List element cannot be changed
  badCandies[0] = "The bad One"
  println(badCandies.last())

  similarCandies.add(1, "Xilka")

  println(similarCandies[0])
  println(similarCandies[1])
}
