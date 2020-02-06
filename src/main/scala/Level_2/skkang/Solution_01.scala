package Level_2.skkang

/**
  * 쇠막대기
  * https://programmers.co.kr/learn/courses/30/lessons/42585
  *
  * 여러 개의 쇠막대기를 레이저로 절단하려고 합니다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
  * 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자릅니다. 쇠막대기와 레이저의 배치는 다음 조건을 만족합니다.
  * - 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있습니다.
  * - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓습니다.
  * - 각 쇠막대기를 자르는 레이저는 적어도 하나 존재합니다.
  * - 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않습니다.
  * 아래 그림은 위 조건을 만족하는 예를 보여줍니다. 수평으로 그려진 굵은 실선은 쇠막대기이고, 점은 레이저의 위치, 수직으로 그려진 점선 화살표는 레이저의 발사 방향입니다.
  *
  * 이러한 레이저와 쇠막대기의 배치는 다음과 같이 괄호를 이용하여 왼쪽부터 순서대로 표현할 수 있습니다.
  * (a) 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 '()'으로 표현합니다. 또한 모든 '()'는 반드시 레이저를 표현합니다.
  * (b) 쇠막대기의 왼쪽 끝은 여는 괄호 '('로, 오른쪽 끝은 닫힌 괄호 ')'로 표현됩니다.
  * 위 예의 괄호 표현은 그림 위에 주어져 있습니다.
  * 쇠막대기는 레이저에 의해 몇 개의 조각으로 잘리는데, 위 예에서 가장 위에 있는 두 개의 쇠막대기는 각각 3개와 2개의 조각으로 잘리고, 이와 같은 방식으로 주어진 쇠막대기들은 총 17개의 조각으로 잘립니다.
  *
  * 쇠막대기와 레이저의 배치를 표현한 문자열 arrangement가 매개변수로 주어질 때, 잘린 쇠막대기 조각의 총 개수를 return 하도록 solution 함수를 작성해주세요.
  *
  * [제한사항]
  * arrangement의 길이는 최대 100,000입니다.
  * arrangement의 여는 괄호와 닫는 괄호는 항상 쌍을 이룹니다.
  *
  * [입출력 예]
  *       arrangement	        return
  * ()(((()())(())()))(())	    17
  * (()()())
  */
object Solution_01 {
  def main(args: Array[String]): Unit = {
    val arrangement = scala.io.StdIn.readLine()
    solution(arrangement)
  }
  //70점
  def solution(arrangement: String): Int = {
    import scala.collection.mutable.ArrayBuffer
    val parsed = arrangement.replace("(", "0").replace(")", "1")

    var leftList = new ArrayBuffer[Int]
    var rightList = new ArrayBuffer[Int]
    parsed.zipWithIndex.foreach( x => if (x._1.toString == "0") leftList += x._2 else if(x._1.toString == "1") rightList += x._2)

    var pointRangeList = new ArrayBuffer[(Int,Int)]
    var pointLeftList = new ArrayBuffer[Int]
    var pointRightList = new ArrayBuffer[Int]
    leftList.foreach( index => if(parsed(index+1).toString == "1") {
      pointRangeList += ((index, index+1))
      pointLeftList += index
      pointRightList += index+1
    })

    var removedLeftList = new ArrayBuffer[Int]()
    var removedRightList = new ArrayBuffer[Int]()
    removedLeftList = leftList.diff(pointLeftList)
    removedRightList = rightList.diff(pointRightList)

    var barRangeList = new ArrayBuffer[(Int, Int)]()
    def makeBarList(leftArray: ArrayBuffer[Int], rightArray: ArrayBuffer[Int]): Unit= {
      var removedLeftList = leftArray
      var removedRightList = rightArray

      if(removedLeftList.size > 0 && removedRightList.size > 0) {
        import  scala.util.control.Breaks._

        breakable {
          removedRightList.foreach { right =>
            breakable {
              removedLeftList.reverse.foreach { left =>
                if (right > left) {
                  barRangeList += ((left, right))
                  removedRightList = removedRightList.filter(_ != right)
                  removedLeftList = removedLeftList.filter(_ != left)
                  break
                }
              }
            }
            break()
          }
        }
        makeBarList(removedLeftList, removedRightList)
      }
    }
    makeBarList(removedLeftList, removedRightList)

    var cuttingCountList = new ArrayBuffer[Int]()
    def cuttingCount(barRange: (Int, Int), pointRangeList: ArrayBuffer[(Int, Int)]): Unit = {
      var count = 0
      pointRangeList.foreach{ point =>
        if ( barRange._1 < point._1 &&  point._2 < barRange._2) {
          count += 1
        }
      }
      cuttingCountList += count+1
    }
    barRangeList.foreach( x => cuttingCount(x,pointRangeList))

//    println(parsed) //0100001011001101110011
//    println("leftList: "+leftList) //ArrayBuffer(0, 2, 3, 4, 5, 7, 10, 11, 14, 18, 19)
//    println("rightList: "+rightList) //ArrayBuffer(1, 6, 8, 9, 12, 13, 15, 16, 17, 20, 21)
    println("pointLeftList: "+pointLeftList) //ArrayBuffer(0, 5, 7, 11, 14, 19)
    println("pointRangeList: "+pointRangeList) //pointRangeList: ArrayBuffer((0,1), (5,6), (7,8), (11,12), (14,15), (19,20))
    println("removedLeftList: "+removedLeftList.reverse) //ArrayBuffer(2, 3, 4, 10, 18)
    println("removedRightList: "+removedRightList) //ArrayBuffer(9, 13, 16, 17, 21)
    println("barRangeList: "+barRangeList) //ArrayBuffer((4,9), (10,13), (3,16), (2,17), (18,21))
    println("cuttingCountList: "+cuttingCountList)
    println("return: "+cuttingCountList.reduce(_+_))
    return cuttingCountList.reduce(_+_)
  }
}
