def zipWith[A](l1: List[A], l2: List[A])(f: (A, A) => A): List[A] = {
  if (l1.isEmpty || l2.isEmpty) Nil
  else f(l1.head, l2.head) :: zipWith(l1.tail, l2.tail)(f)
}