## 요약 정리

* 1주차: Soulution_[01-05]
    * 모의고사(완전탐색)
        * MutableList
        * new Array\[Int]\()
    * K번째 수(정렬)
        * string 타입의 숫자 값을 가져올 때: getNumericValue
    * 체육복(탐욕법)
        * 그리디 알고리즘(탐욕법)
            * 매 선택에서 지금 이 순간 당장 최적인 답을 선택
            * 사용예시
                * AI에 있어서 결정 트리 학습법(Decision Tree Learning)
                * 활동 선택 문제(Activity selection problem)
                * 거스름돈 문제(동전들에 배수관계가 성립할때만 한정)
                * 최소 신장 트리 (Minimum spanning tree)
                * 제약조건이 많은 대부분의 문제(그리디인줄 알고 풀었다가 피보는 경우도 있음
                * 다익스트라 알고리즘
                * 허프만 코딩
                * 크러스컬 알고리즘
    * 2016년(연습문제)
    * 가운데 글자 가져오기(연습문제)
* 2주차
    * 나누어 떨어지는 숫자 배열(연습문제)
    * 두 정수 사이의 합(연습문제)
    * 문자열 내 마음대로 정렬하기(연습문제)
        * sortBy
        * sortWith
    * 문자열 내림차순으로 배치하기(연습문제)
        * reverse
    * 문자열 다루기 기본(연습문제)
        * forall: collection을 모두 조건검사할 때 사용 모두 참이어야 참 반환
        * contains: 메서드에 포함된 요소에 인수로 있는 요소가 목록에 있으면 true
    * 서울에서 김서방 찾기(연습문제)
        * indexOf
* 3주차
    * 수박수박수박수박수박수?(연습문제)
        * .mkString(""): 구분 기호와 함께 문자열 반환
    * 문자열을 정수로 바꾸기(연습문제)
* 4주차
    * 시저 암호(연습문제)
    * 약수의 합(연습문제)
    * 이상한 문자 만들기(연습문제)
        * .split(" ",-1) : -1 공백 문자열 제거
        * .map
        * .zipWithIndex
        * .toUpper, .toLower
    * 자릿수 더하기(연습문제)
        * map
        * reduce(_+_) : default는 reduceLeft, 왼쪽 _ 누적값, 오른쪽 _ 각 요소
    * 자연수 뒤집어 배열로 만들기(연습문제)
    * 정수 내림차순으로 배치하기(연습문제)
    * 정수 제곱근 판별(연습문제)
        * scala.math.sqrt: 제곱근 반환
        * scala.math.pow(x, y): x^y
        * .isValidInt: 정수판단
    * 제일 작은 수 제거하기(연습문제)
        * .diff
    * 짝수와 홀수(연습문제)
* 5주차
    * 최대공약수와 최소공배수
        * scala.math.BigInt.gcd: 최대공약수
    * 콜라츠 추측(연습문제)
        * 재귀함수
    * 평균 구하기(연습문제)
    * 하샤드 수(연습문제)
        * .foldLeft(0)(_+_- '0')): 초기값이 있는 reduce, '0'을 넣어 아스키코드값이 아닌 NumericValue 값으로 반환

    * 핸드폰 번호 가리기(연습문제)
    * 행렬의 덧셈(연습문제)
    * x만큼 간격이 있는 n개의 숫자(연습문제)
        * 제한조건 예외처리 주의할 것

        |type|scala(java)||
        |---|---|---|
        |Byte|1byte(8bits)||
        |Short|2byte(16bits)||
        |Int|4byte(32bits)||
        |Long|8byte(64bits)||

    * 직사각형 별찍기(연습문제)
