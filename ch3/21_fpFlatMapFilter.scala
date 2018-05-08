def fpFlatMap[A,B](l: List[A])(f: A => List[B]): List[B] = {
  l.foldLeft(List[B]())((i, c) => i ++ f(c))
}
def fpFlatMapFilter[A](l: List[A])(f: A => Boolean): List[A] = {
  fpFlatMap(l)(a => if (f(a)) List(a) else List())
}