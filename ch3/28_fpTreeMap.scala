// 3.28: Write a function fpTreeMap, analogous to the method of the same name
// on List, that modifies each element in a tree with a given function.

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def fpTreeMap[A, B](t: Tree[A])(f: A => B): Tree[B] = t match {
  case Branch(l, r) => Branch(fpTreeMap(l)(f), fpTreeMap(r)(f))
  case Leaf(v) => Leaf(f(v))
}