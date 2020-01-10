#자연수 뒤집어 배열로 만들기

def solution(n):
    answer = []
    n = str(n)
    
    for i in range(len(n)-1, -1, -1):
        answer.append(int(n[i]))
    return answer