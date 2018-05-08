def reverseFold[A](l: List[A]): List[A] = {
  l.foldRight(List[A]())((i, c) => c ++ List(i))
}