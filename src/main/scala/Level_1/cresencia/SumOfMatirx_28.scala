package Level_1.cresencia

/**
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
입출력 예
arr1	arr2	return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]	[[3],[4]]	[[4],[6]]
  */
object SumOfMatirx_28 {
  def main(args: Array[String]): Unit = {
    val arr1 = Vector(Vector(1,2), Vector(2,3))
    val arr2 = Vector(Vector(3,4),Vector(5,6))

    println(solution(arr1, arr2))
  }
  def solution(arr1: Vector[Vector[Int]], arr2: Vector[Vector[Int]]): Vector[Vector[Int]] = {
    var result = collection.mutable.ArrayBuffer[Vector[Int]]()

    // 배열 길이만큼
    for(idx1 <- 0 until arr1.length) {
      var row = collection.mutable.ArrayBuffer[Int]()
      // 행의 길이만큼
      for(idx2 <- 0 until arr2(idx1).length){
        row += (arr1(idx1)(idx2) + arr2(idx1)(idx2))
      }

      result += row.toVector
    }

    return result.toVector
  }
}
