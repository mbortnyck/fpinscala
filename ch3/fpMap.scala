def fpMap[A, B](l: List[A])(f: A => B): List[B] = {
  l.foldLeft(List[B]())((i, c) => i ++ List(f(c)))
}