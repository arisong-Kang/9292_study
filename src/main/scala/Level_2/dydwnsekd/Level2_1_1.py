def solution(arrangement):
    answer = 0
    pipe = 0
    
    for i in range(len(arrangement)):
        if arrangement[i] == '(' and arrangement[i+1] == ')':
            answer += pipe
        elif arrangement[i] == '(':
            pipe += 1
        elif arrangement[i] == ')' and arrangement[i-1] != '(':
            pipe -= 1
            answer += 1
            
    return answer