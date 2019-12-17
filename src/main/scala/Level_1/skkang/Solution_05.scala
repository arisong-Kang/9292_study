package Level_1.skkang

//가운데 글자 가져오기
object Solution_05 {

  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine()
    solution(inputString)
  }
  def solution(s: String): String = {
    val inputLength = s.length
    var resultString = new String

    if(inputLength%2 == 0) {
      resultString = s.substring(inputLength/2-1,inputLength/2+1)
    } else if (inputLength%2 == 1) {
      resultString = s.substring((inputLength-1)/2,(inputLength-1)/2+1)
    }
    return resultString
  }
}
