def sumLeft(l: List[Int]): Int = {
  l.foldLeft(0)(_ + _)
}