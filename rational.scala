class Rational( n:Int, d:Int){
  require(d!=0)
  private val g = gcd(n.abs, d.abs)
  val number = n / g
  val denom = d / g
  //println("Created" + n + "/" +d)
  override def toString = number+"/"+denom
  def +(that:Rational) : Rational = {
    new Rational(number*that.denom + that.number*denom, denom*that.denom)
  }

  def this(n:Int) = this(n,1)
  def +(x:Int) :Rational = {
    new Rational(x*denom+number, denom)
  }
  private def gcd(a:Int, b:Int) :Int = {
    if(b==0) a else gcd(b, a%b)
  }
}

implicit def intToRational(x:Int) = new Rational(x)


val one = new Rational(1,2)
val two = new Rational(2,4)
val onetwo = one + two
println(one+2)
println(2+one)
