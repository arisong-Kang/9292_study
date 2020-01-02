package Level_1.skkang

//문자열 다루기 기본
/**
  * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
  * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
  * [제한 사항]
  * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
  * [입출력 예]
  *   s 	return
  * a234	false
  * 1234	true
 */
object Solution_10 {
  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine()

    solution2(inputString)

  }
  def solution(s: String): Boolean = {
    var result = true
    //0-9.toInt: 48-57
    if (s.length == 4 || s.length == 6) {
      s.foreach{ x =>
        if (48 <= x.toInt && x.toInt <= 57) {
          result = result&&true
        } else result = result&&false
      }
      return result
    } else {
      return !result
    }
  }

  def solution2(s: String): Boolean = {
    s.forall(_.isDigit)

    if (s.forall(_.isDigit) == true && List(4,6).contains(s.length)){
      return true
    }else {
      return false
    }
  }
}
