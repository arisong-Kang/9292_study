## 풀이

### Level1 (2019.12.16 ~ 2019.12.20)
#### 1. 모의고사(mouigosa)
* 사용 알고리즘: 완전탐색
* mutableList와 mutableArray 사용할 것
* 0점이 만점인 경우 셋다 표시해주어야 하므로 조건절
* List(튜플, 튜플, 튜플)
* 알 수 없지만 정확도 35%
* 시간: 3시간?

#### 2. K번째 수(Kth_num)
* 사용 알고리즘: 정렬
* mutableArrayBuffer 사용하여 k번째 수를 모은 뒤 마지막에 toVector
* vector 인수를 for문으로 반복문돌고 i~j까지 자르는 부분은 , 을 seperator로 string으로 만든 뒤 배열로 전환
* 시간: 40분

### 3. 2016(quiz_2016)
* 사용 알고리즘: 없음
* 월별 일수 배열 저장 & 순차적으로 a-1월까지 일수 더하기
* 그 뒤 b일을 더하고 %7
* 포인트는 그해 시작하는 요일을 배열 0번으로 가기
* 더 쉬운 방법은 a월 b일을 caledar에 set해서 DAYS_OF_WEEK 을 가져오기
* 시간: 1시간 30분

### 4. 가운데 글자 가져오기(middleOfWord)
* 사용 알고리즘: 없음
* 홀수, 짝수 감안해서 몇글자 substring할것인지

### 5. 체육복(LostSportwear)
* 사용 알고리즘: 그리디 알고리즘(탐욕법)
* 탐욕법은 그때그때 가장 괜찮은 해법을 찾아 반복하기
* 가장 중요한 포인트는 "여벌의 체육복을 가진 학생이 체육복을 도둑맞은 경우" 해당 학생을 배열에서 미리 빼주어야 함

### 6. 나누어 떨어지는 숫자 배열(devidedNumberArray)
* 나머지 연산 %가 0인 케이스를 확인하기
* mutable.ListBuffer[Int]() 사용

### 7. 두 정수 사이의 합(sumOfNum)
* 음수부터 양수까지의 합이니 int로 받았어도 long으로 형변환해주기

### 8. 문자열 내 마음대로 정렬하기(sortStringWithCondition)
* (순번, 알파벳)을 가진 map 선언
* 순번에 따라 해당 알파벳이 몇번째인지 따져보기

### 9. 문자열 내림차순으로 배치하기(sortStringDescending)

### 10. 문자열 다루기 기본(manageString)
* 별다른 알고리즘 없음
* scala도 try catch 구문 사용 가능
* string을 int로 변환할 수 있는지 확인하려면 Some(s.toInt)
* 좀더 세련된 방법 => scala.util.Try(s.toInt).toOption != None


### 11. 서울에서 김서방 찾기(findKimInSeoul)
* contains를 사용