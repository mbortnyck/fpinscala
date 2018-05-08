/* Exercise 3.25:
 *
 * Write a function that counts the number of nodes (leaves and branches)
 * in a tree.
 */

sealed trait Tree[+A]
case class Leaf[A](Value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def fpTreeSize[A](t: Tree[A]): Int = t match {
  case b: Branch[A] => 1 + fpTreeSize(b.left) + fpTreeSize(b.right)
  case l: Leaf[A] => 1
}