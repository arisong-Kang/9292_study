package Level_1.cresencia

/**
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s	return
a234	false
1234	true
  */
object manageString {
  def main(args: Array[String]): Unit = {

    val s:String = "1234"

    println(solution(s))
  }

  def solution(s: String): Boolean = {
    try {
      if ((s.length == 4 || s.length == 6) ) {
        Some(s.toInt)

        return true
      } else {return false }
    }catch{
      case e: Exception => return false
    }
  }
}
