def init[A](l: List[A]): List[A] = {
  l.reverse.tail.reverse
}