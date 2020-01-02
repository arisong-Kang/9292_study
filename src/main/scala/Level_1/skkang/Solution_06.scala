package Level_1.skkang

//나누어 떨어지는 숫자 배열
object Solution_06 {
  def main(args: Array[String]): Unit = {
    val inputArrayRaw = scala.io.StdIn.readLine()
    val inputArray = inputArrayRaw.substring(1, inputArrayRaw.length() - 1)
    val array = inputArray.split(",")

    val inputMutableArray = new Array[Int](array.length)
    var i = 0
    array.foreach{ x =>
      inputMutableArray(i) = x.toInt
      i = i+1
    }

    val inputNumber = scala.io.StdIn.readLine()
    val n = inputNumber.toInt

    solution(inputMutableArray.toVector, n)

  }
  def solution(arr: Vector[Int], divisor: Int): Vector[Int] = {
    val temp = new Array[Int](arr.length)
    var i = 0
    arr.foreach{ x =>
      if(x%divisor == 0){
        temp(i) = x
        i += 1
      }
    }
    var temp2 = temp.filter(_>0).sorted

    if (temp2.length == 0) {
      val result: Vector[Int] = Vector(-1)
      return result
    } else {
      return temp2.toVector
    }
  }

  def solution2(arr: Vector[Int], divisor: Int): Vector[Int] = {
    val result = arr.filter(_%divisor==0).sortWith(_<_)
    if (result.length!=0) {
      return result
    } else {
      return Vector(-1)
    }
  }
}
