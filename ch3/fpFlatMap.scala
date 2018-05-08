def fpFlatMap[A,B](l: List[A])(f: A => List[B]): List[B] = {
  l.foldLeft(List[B]())((i, c) => i ++ f(c))
}