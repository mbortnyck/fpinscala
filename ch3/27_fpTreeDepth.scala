// 3.27: Write a function fpTreeDepth that returns the maximum path length
// from the root of a tree to any leaf.

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def fpTreeDepth[A <: Tree[Int]](t: A): Int = t match {
  case Branch(l, r) => 1 + (fpTreeDepth(l) max fpTreeDepth(r))
  case Leaf(v) => 1
}