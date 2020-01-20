def solution(arrangement):
    answer = 0
    pipe = 0
    
    for i in range(len(arrangement)-1):
        if arrangement[i] == '(' and arrangement[i+1] == ')':
            print (pipe)
            answer += pipe
        elif arrangement[i] == '(':
            pipe += 1
            print (pipe)
        elif arrangement[i] == ')' and arrangement[i-1] != '(':
            pipe -= 1
            print (pipe)
        
    return answer