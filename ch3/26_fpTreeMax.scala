// 3.26: Write a function fpTreeMax that returns the maximum element
// in a Tree[Int].

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def fpTreeMax[A <: Tree[Int]](t: A): Int = t match {
  case Branch(l, r) => fpTreeMax(l) max fpTreeMax(r)
  case Leaf(value) => value
}