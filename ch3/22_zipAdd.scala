def zipAdd(l1: List[Int], l2: List[Int]): List[Int] = {
  if (l1.isEmpty || l2.isEmpty) Nil
  else (l1.head + l2.head) :: zipAdd(l1.tail, l2.tail)
}