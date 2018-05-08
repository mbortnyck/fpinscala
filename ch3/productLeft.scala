def productLeft(l: List[Int]): Int = {
  l.foldLeft(1)(_ * _)
}