def setHead[A](l: List[A], h: A): List[A] = {
  List(h) ++ l.tail
}