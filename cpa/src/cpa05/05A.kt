package cpa05

/**
 * 05A
 * n 以上 m 以下の整数の和を再帰的関数 sum で定義する。
 */

fun main(args: Array<String>) {
  val N = 100 // 雑
  var n = (N*Math.random()).toInt()
  var m = (N*Math.random()).toInt()

  println("sum($n, $m): ${sum(n, m)}")
}

fun sum(n: Int, m: Int): Int {
  when {
    n > m -> return 0
    else -> return sum(n, m-1) + m
  }
}