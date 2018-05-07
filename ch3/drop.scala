@annotation.tailrec
def drop[A](n: Int, l: List[A]): List[A] = {
  if (n == 0) l
  else drop(n-1, l.tail)
}