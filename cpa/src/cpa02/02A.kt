package cpa02

/**
 *  02A(改)
 *  読み込んだ整数の列の中から2番目に大きな整数を出力するプログラムを作れ。
 *  同じ整数が複数回現れた場合は、これらを区別せよ。
 */



fun main(args: Array<String>) {
  val N = 10 // 雑
  var numbers = MutableList<Int>(N, {(20*Math.random()-10).toInt()})

  print("input: ")
  for (number in numbers)
    print("${number} ")
  println()

  numbers.removeAll { it == numbers.max() }
  println("output: ${numbers.max()}")
}