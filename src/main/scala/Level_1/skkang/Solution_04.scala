package Level_1.skkang

//2016년
object Solution_04 {
  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readLine()
    val b = scala.io.StdIn.readLine()
    solution(a.toInt, b.toInt)
  }
  def solution(a: Int, b: Int): String = {
    val dayOfTheWeekArray: Array[String] = Array("THU","FRI","SAT","SUN","MON","TUE","WED")
    val countDayOfTheMonth: Array[Int] = Array(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var countDay: Int = 0
    var dayOfTheWeek: String = ""

//    println(countDayOfTheMonth(a-1))
    for(i<-0 until a-1) {
      print(i+1 + "월, " + countDayOfTheMonth(i) + "일")
      println("")
      countDay += countDayOfTheMonth(i)
    }

    countDay += b

    dayOfTheWeek = dayOfTheWeekArray(countDay%7)
    println("countDay:",countDay)
    println("dayOfTheWeek:",dayOfTheWeek)
    return dayOfTheWeek
  }
}
