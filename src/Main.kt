fun main(args: Array<String>) {
  var dogs = mapOf<String, Int>("Fido" to 8, "Sara" to 15, "Sean" to 54)

  println(dogs["Fido"]);

  for ((k, v) in dogs) {
    println("The dog $k has $v years old");
  }
}
