package Level_1.skkang

//수박수박수박수박수박수?
/**
  * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
  * 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
  *
  * [제한 조건]
  * n은 길이 10,000이하인 자연수입니다.
  *
  * [입출력 예]
  * n	return
  * 3	"수박수"
  * 4	"수박수박"
  */
object Solution_12 {
  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine()

    solution(inputString.toInt)

  }
  def solution(n: Int): String = {
    var result = new Array[String](n)

    for(i<-0 until result.length) {
      if (i%2 == 0) {
        result(i) = "수"
      } else if (i%2 == 1) {
        result(i) = "박"
      }
    }

    return result.mkString("")
  }
}
