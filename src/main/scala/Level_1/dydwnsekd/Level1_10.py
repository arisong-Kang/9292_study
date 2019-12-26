def solution(s):
    answer = True
    
    
    if len(s) == 4 or len(s) == 6:
        try:
            for i in s:
                int(i)
        except:
            answer = False
    else:
        answer = False
    
    return answer