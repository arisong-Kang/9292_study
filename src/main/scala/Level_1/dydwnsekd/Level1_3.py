#체육복
def solution(n, lost, reserve):
    
    temp_list = []
    
    for i in reserve:
        if (i) in lost:
            print (i)
            temp_list.append(lost.pop(lost.index(i)))
            
    for i in temp_list:
        reserve.pop(reserve.index(i))
        
    for i in reserve:
        if (i-1) in lost:
            lost.pop(lost.index(i-1))
        elif (i+1) in lost:
            lost.pop(lost.index(i+1))
    
    answer = (n - len(lost))
    return answer