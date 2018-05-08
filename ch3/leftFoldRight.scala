def leftFoldRight[B](z: B)(f: (A, B) => B): B = {
  l.reverse.foldLeft(z)((b,a) => f(a, b))
}