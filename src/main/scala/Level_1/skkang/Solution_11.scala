package Level_1.skkang

//서울에서 김서방 찾기
object Solution_11 {
  def main(args: Array[String]): Unit = {
    val inputArrayRaw = scala.io.StdIn.readLine()
    val inputArray = inputArrayRaw.substring(1, inputArrayRaw.length() - 1)
    val array = inputArray.split(",")

    val inputMutableArray = new Array[String](array.length)
    var i = 0
    array.foreach{ x =>
      inputMutableArray(i) = x
      i = i+1
    }

    solution(inputMutableArray.toVector)
  }

  def solution(seoul: Vector[String]): String = {
    var i = 0
    var resultNum = 0

    seoul.foreach{ x =>
      if(x == "\"Kim\"") { resultNum = i }
      i += 1
    }

    return "김서방은 " + resultNum.toString + "에 있다"
  }

  def solution2(seoul: Vector[String]): String = {
    return  "김서방은 " + seoul.indexOf("\"Kim\"") + "에 있다"
  }
}
