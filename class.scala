class ChecksumAccumulator{
  private var sum =0;
  def add(b:Byte) : Unit={
    sum+=b
  }
  def checksum() : Int = ~ (sum & 0xFF) +1

}

import scala.collection.mutable.Map

object ChecksumAccumulator{
  private val cache = Map[String, Int]()
  def calculate(s:String) : Int ={
    if(cache.contains(s))
      cache(s)
    else{
      val acc =  new ChecksumAccumulator
      for(c<-s){
        println(c.toByte)
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s->cs)
      cs
    }
  }
}

//val check = new ChecksumAccumulator()
//check.add(1)
//check.add(9)
//println(check.checksum())
println(ChecksumAccumulator.calculate("1223"))
println(ChecksumAccumulator.calculate("1223"))
