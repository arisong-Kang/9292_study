#제일 작은 수 제거하기

def solution(arr):
    
    arr.pop(arr.index(min(arr)))
    if len(arr) == 0:
        return [-1]
    else:    
        return arr