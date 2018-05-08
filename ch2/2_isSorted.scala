def isSorted[A](as: Array[A], f: (A,A) => Boolean): Boolean = {
  as.sliding(2).foldLeft(true)((p, c) => p && f(c(0), c(1)))
}