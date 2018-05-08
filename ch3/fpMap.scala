def fpMap[A](l: List[A], f: A => A): List[A] = {
  l.foldLeft(List[A]())((i, c) => i ++ List(f(c)))
}