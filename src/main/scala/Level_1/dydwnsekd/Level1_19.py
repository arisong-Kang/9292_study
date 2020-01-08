import math

def solution(n):
    answer = 0
    
    sqrt_n = math.sqrt(n)
    if int(sqrt_n) == sqrt_n:
        answer = (int(sqrt_n)+1) ** 2
    else:
        answer = -1
        
    return answer