def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean = {
  if (sub.isEmpty) true
  else if (sup.isEmpty) false
  else if (sup.head == sub.head) hasSubsequence(sup.tail, sub.tail)
  else hasSubsequence(sup.tail, sub)
}