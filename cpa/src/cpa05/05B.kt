package cpa05

/**
 * 05B
 * n 以上 m 以下の素数の和を再帰的関数 primeSum で定義する。
 */

fun main(args: Array<String>) {
  val N = 100 // 雑
  var n = (N*Math.random()).toInt()
  var m = (N*Math.random()).toInt()

  println("primeSum($n, $m): ${primeSum(n, m)}")
}

fun primeSum(n: Int, m: Int): Int {
  when {
    n > m -> return 0
    isPrime(m) -> return primeSum(n, m-1) + m
    else -> return primeSum(n, m-1)
  }
}

fun isPrime(n: Int): Boolean {
  var i: Int = n - 1

  while (i != 1) {
    if (n % i == 0) return false
    --i
  }
  return true
}