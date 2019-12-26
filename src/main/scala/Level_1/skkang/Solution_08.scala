package Level_1.skkang

//문자열 내 마음대로 정렬하기
object Solution_08 {

  def main(args: Array[String]): Unit = {
    val inputArrayRaw = scala.io.StdIn.readLine()
    val inputArray = inputArrayRaw.substring(1, inputArrayRaw.length() - 1)
    val array = inputArray.split(",")

    val inputMutableArray = new Array[String](array.length)
    var i = 0
    array.foreach{ x =>
      inputMutableArray(i) = x.substring(1, x.length - 1)
      i = i+1
    }

    val inputNumber = scala.io.StdIn.readLine()
    val n = inputNumber.toInt

    solution(inputMutableArray.toVector, n)

  }

  def solution(strings: Vector[String], n: Int): Vector[String] = {

//    strings.sortBy(_.charAt(n))

    val result = strings.sortWith{ (s, t) =>
      if (s.charAt(n) == t.charAt(n) ) {
        s < t
      } else {
        s.charAt(n) < t.charAt(n)
      }
    }

    return result
  }
}
