

def sqrt(x : Double): Double= {
  def abs(x: Double) = if (x > 0) x else -x

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double): Boolean =
    abs(guess * guess - x) / x < 0.0001

  def improve(guess: Double): Double =
    (guess + x / guess) / 2

  sqrtIter(1.0)
}
sqrt(99999)


val x = 0
def f(y: Int) = y +1

val result = {
  val x = f(3);
  x * x
} + x

val y = 3*4;y * y

