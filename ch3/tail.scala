def tail[A](l: List[A]): List[A] = {
  l match {
    case Nil => Nil
    case _ => l.tail
  }
}