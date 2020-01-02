def solution(n):
    
    div_n = int(n/2)
    answer = "수박" * div_n
    
    if n % 2 == 1:
        n = int(n/2)
        answer = answer + "수"
        
    return answer