def fpFilter[A](l: List[A])(f: A => Boolean): List[A] = {
  l.foldLeft(List[A]())((i, c) => i ++ (if (f(c)) List(c) else Nil))
}