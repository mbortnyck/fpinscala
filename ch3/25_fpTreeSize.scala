// 3.26: Write a function size that counts the number of nodes
// (leaves and branches) in a tree.

sealed trait Tree[+A]
case class Leaf[A](Value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def fpTreeSize[A <: Tree[Int]](t: A): Int = t match {
  case Branch(l, r) => 1 + fpTreeSize(l) + fpTreeSize(r)
  case Leaf(_) => 1
}