def foldCat[A](l: List[List[A]]): List[A] = {
  l.foldLeft(List[A]())(_ ++ _)
}