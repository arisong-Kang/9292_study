package Level_1.skkang

//체육복
object Solution_03 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine()

    val lostInputStringRaw = scala.io.StdIn.readLine()
    val lostInputString = lostInputStringRaw.substring(1, lostInputStringRaw.length() - 1)
    val lostInput = lostInputString.split(",")
    var lost = new Array[Int](lostInput.length)

    var i = 0
    lostInput.foreach{ x =>
      lost(i) = x.toInt
      i = i+1
    }

    val reserveInputStringRaw = scala.io.StdIn.readLine()
    val reserveInputString = reserveInputStringRaw.substring(1, reserveInputStringRaw.length() - 1)
    val reserveInput = reserveInputString.split(",")
    var reserve = new Array[Int](reserveInput.length)

    var j = 0
    reserveInput.foreach{ y =>
      reserve(j) = y.toInt
      j = j+1
    }

    solution(n.toInt, lost.toVector, reserve.toVector)
  }

  def solution(n: Int, lost: Vector[Int], reserve: Vector[Int]): Int = {
    lost.foreach(x=>println(x))
    reserve.foreach(x=>println(x))
    return 0
  }
}
