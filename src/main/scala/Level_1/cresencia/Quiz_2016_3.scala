package Level_1.cresencia

/**
  * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
*두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
*요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
 **
 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
 **
 제한 조건
*2016년은 윤년입니다.
*2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
*입출력 예
  */
object Quiz_2016_3 {

  def main(args: Array[String]): Unit = {

    val a = 1
    val b = 4

   println(solution(a, b))
  }

  def solution(a: Int, b: Int): String = {
    val weekName:Array[String] = Array("FRI", "SAT","SUN", "MON", "TUE", "WED", "THU")
    val daysPerMonth:Array[Int] = Array(30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var totalDays = 0

    for (month <- 1 until a) {
      totalDays += daysPerMonth(month-1)
    }

    totalDays += b

    return if (totalDays < 8) {
      weekName(b-1)
    } else {
      weekName(totalDays % 7)
    }
  }

}
