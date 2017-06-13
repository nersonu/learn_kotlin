package cpa06

/**
 * 06A
 * 組み合わせ（再帰関数）
 * _nC_m = _n-1C_m-1 + _n-1C_m
 * stack overflow と Int の overflow が起こる
 */

fun main(args: Array<String>) {
  val N = 15 // 雑
  var n = (N*Math.random()).toInt()
  var m = (N*Math.random()).toInt()

  if (m > n) {
    val t = n
    n = m
    m = t
  }

  println("combination($n, $m): ${combination(n, m)}")
}

fun combination(n: Int, m: Int): Int {
  when {
    m == 1 -> return n
    n == m -> return 1
    else -> return combination(n-1, m-1) + combination(n-1, m)
  }
}
