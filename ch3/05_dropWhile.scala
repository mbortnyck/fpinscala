@annotation.tailrec
def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
  if (l.isEmpty) Nil
  else if (f(l.head)) dropWhile(l.tail, f)
  else l
}