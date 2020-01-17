package Level_1.cresencia

import scala.collection.mutable
/**
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
Zbcdefg	gfedcbZ
  */
object SortStringDescending_9 {

  def main(args:Array[String]):Unit = {
    val s = "Zbcdefg"
    println(solution(s))
    println(otherSolution(s))

  }

  def solution(s: String): String = {
    val dictionary:Map[String, Int] = Map(("a",1), ("b",2), ("c",3), ("d",4), ("e",5), ("f",6), ("g",7), ("h",8), ("i",9), ("j",10), ("k",11), ("l",12), ("m",13), ("n",14), ("o",15),
      ("p",16), ("q",17), ("r",18), ("s",19), ("t",20), ("u",21), ("v",22), ("w",23), ("x",24), ("y",25), ("z",26),
      ("A",27), ("B",28), ("C",29), ("D",30),("E",31),("F",32),("G",33),("H",34),("I",35),("J",36),("K",37),("L",38),("M",39),("N",40),("O",41),("P",42),("Q",43),("R",44),
      ("S",45),("T",46),("U",47),("V",48),("W",49),("X",50),("Y",51),("Z",52))
    val sortedList = mutable.ListBuffer[(Int, String)]()
    var sortedString = ""

    s.foreach( s => {
      sortedList += ((dictionary.get(s.toString).getOrElse().toString.toInt, s.toString))
    })

    sortedList.sortWith(_._2 > _._2).foreach( s => {
      sortedString += s._2
    })

    return sortedString
  }

  // 짧고 간결한 다른 사람의 풀이
  def otherSolution(s:String): String = s.sortWith(_.toInt > _.toInt).mkString("")
}
