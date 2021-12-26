1 + 1

val x = 42

x * x

x * 102

1 + 1

def sum(f: Int => Int): (Int, Int) => Int =
  def sumf(a: Int, b: Int): Int = f(a) + f(b)
  sumf

def cube(x: Int) = x * x * x
sum(cube)(1, 10)
