# 가장 큰 수
# 문제 설명
# 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

# 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

# 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

# 제한 사항
# numbers의 길이는 1 이상 100,000 이하입니다.
# numbers의 원소는 0 이상 1,000 이하입니다.
# 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
# 입출력 예
# numbers	return
# [6, 10, 2]	6210
# [3, 30, 34, 5, 9]	9534330

# 1 틀림
# from operator import itemgetter

# def solution(numbers):
#     answer = ''
#     temp_numbers = []
    
#     for i in numbers:
#         temp_numbers.append(str(i))
        
#     sort_numbers = sorted(temp_numbers, key=lambda x : (x[0:len(x)],x), reverse=True)

#     print (sort_numbers)
    
#     for i in sort_numbers:
#         answer += i
    
#     return answer

# 2 시간초과
# from itertools import permutations

# def solution(numbers):
#     answer = ''
#     temp_list = []
#     num_list = []
    
#     str_numbers = []
#     for i in numbers:
#         str_numbers.append(str(i))
    
#     temp_list = list(permutations(str_numbers, len(numbers)))
    
#     for i in temp_list:
#         num_list.append(int("".join(i)))
        
#     num_list.sort()
        
#     return str(num_list[-1])

# 3 또 틀림
# ljust, rjust 이용 방식 확인
# https://ngee.tistory.com/397

# def solution(numbers):
#     answer = ''
#     temp_list = []
#     num_list = []
    
#     str_numbers = []
#     for i in numbers:
#         str_numbers.append(str(i).ljust(7, 'a'))
    
#     str_numbers.sort()
#     str_numbers.reverse()
#     answer = "".join(str_numbers)
#     answer = answer.replace("a", "")
#     print (answer)
        
#     return answer

# 4
# https://dailyheumsi.tistory.com/102

def solution(numbers):
    answer = ''
    str_numbers = []

    # numbers = list(map(str, numbers))
    for i in numbers:
        str_numbers.append(str(i))

    sort_numbers = sorted(str_numbers, key=lambda x : (x*4)[:5], reverse=True)
    
    for i in sort_numbers:
        answer += i
        
    # testcase 11번
    return str(int(answer))