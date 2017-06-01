package cpa02

/**
 *  02B
 *  ユーグリッドの互除法
 */

fun main(args: Array<String>) {
  val N = 100 // 雑
  var m = (N*Math.random()).toInt()
  var n = (N*Math.random()).toInt()

  println("gcd(${m}, ${n}): ${gcd(m, n)}")
}

fun gcd(m: Int, n: Int): Int {
  var x = m
  var y = n

  if (y > x) {
    val tmp = y
    y = x
    x = tmp
  }

  // println("x: ${x}, y: ${y}")

  when (y) {
    0 -> return x
    else -> return gcd(y, x%y)
  }
}