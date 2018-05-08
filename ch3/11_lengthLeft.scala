def lengthLeft[A](l: List[A]): Int = {
  l.foldLeft(0)((i, c) => 1 + i)
}