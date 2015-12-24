import scala.io.Source
object HelloWorld{
  def main(args: Array[String]){
      println("Hello, World!")
  }
  def test(){
        val greetStrings = new Array[String](3)
        greetStrings(0) = "Hello"
        greetStrings(1) = ","
        greetStrings(2) = "world!\n"
        for(i<- 0 to 2)
          print(greetStrings(i))
  }
  def list(){
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet)

    val oneTwoThree = 1 :: 2::3::Nil
    println(oneTwoThree)
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwothreeFour = oneTwo ::: threeFour
    println(oneTwo + " and" + threeFour + " were not mutated.")
    println("Thus, " + oneTwothreeFour + "is a new list")
  }
  def readFile(){
    for( line <- Source.fromFile("a").getLines()){
      println(line.length + "" + line)
    }

  }
}

HelloWorld.readFile()
