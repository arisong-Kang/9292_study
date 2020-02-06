#정수 내림차순으로 배치하기

def solution(n):
    n = str(n)
    answer = ''
    num_list = []
    for i in n:
        num_list.append(i)
    
    num_list.sort(reverse=True)
    
    for i in num_list:
        answer += i
    return int(answer)