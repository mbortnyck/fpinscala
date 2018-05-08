def length[A](as: Array[A]): Int = {
  as.foldRight(0)((i, c) => c + 1)
}