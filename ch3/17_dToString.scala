def dToString(l: List[Double]): List[String] = {
  l.foldLeft(List[String]())((i, c) => i ++ List(c.toString))
}