def plusOne(l: List[Int]): List[Int] = {
  l.foldLeft(List[Int]())((i, c) => i ++ List(c + 1))
}