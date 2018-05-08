def foldAppend[A](l: List[A], a: A): List[A] = {
  List(List(a)).foldLeft(l)(_ ++ _)
}