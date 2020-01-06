package Level_1.skkang

//시저 암호
/**
  * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
  * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
  * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
  *
  * [제한 조건]
  * 공백은 아무리 밀어도 공백입니다.
  * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
  * s의 길이는 8000이하입니다.
  * n은 1 이상, 25이하인 자연수입니다.
  *
  * [입출력 예]
  *   s	    n  	result
  *  AB	    1	    BC
  *  AB     3     DE
  *   z	    1 	   a
  * a B z	  4	  e F d
  */
object Solution_14 {
  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine()
    val inputNumber = scala.io.StdIn.readLine()

    solution(inputString, inputNumber.toInt)

  }
  def solution(s: String, n: Int): String = {

    val upper = ('A' to 'Z').toList //65-90
    val lower = ('a' to 'z').toList //97-122

    var result = ""

    s.map{ x =>
      if (x == ' ') {
        result += " "
      } else if (65 <= x.toInt && x.toInt <= 90) { //upper
        result += upper(((x + n)%65)%26)
      } else if (97 <= x.toInt && x.toInt <= 122) { //lower
        result += lower(((x + n)%97)%26)
      }
    }
    return result
  }
}
