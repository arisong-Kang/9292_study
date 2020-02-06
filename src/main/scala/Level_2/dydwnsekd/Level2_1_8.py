# 문제 설명
# 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

# 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

# 제한사항
# numbers는 길이 1 이상 7 이하인 문자열입니다.
# numbers는 0~9까지 숫자만으로 이루어져 있습니다.
# 013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
# 입출력 예
# numbers	return
# 17	3
# 011	2
# 입출력 예 설명
# 예제 #1
# [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

# 예제 #2
# [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

# 11과 011은 같은 숫자로 취급합니다.

# https://brenden.tistory.com/10
# https://bcp0109.tistory.com/14?category=848939
# https://ourcstory.tistory.com/414

from itertools import permutations

def solution(numbers):
    answer = 0
    
    # numbers를 잘라서 보관할 list
    num_split = []
    
    # numbers의 조합을 보관할 list
    num_list = []
    
    # 소수 판별할 flag
    flag = None
    
    for i in numbers:
        num_split.append(i)
        
    for i in range(1, len(numbers)+1):
        temp_list = list(permutations(num_split, i))
        
        for j in temp_list:
            num_list.append(int("".join(j)))
    
    num_list = list(set(num_list))
    
    for i in num_list:
        if i > 1:
            flag = True
            for j in range(2, i):
                if i % j == 0:
                    flag = False
                    break
        if flag:
            answer += 1
    return answer