def solution(s):
    answer = ''
    
    temp_list = []
    for i in s:
        temp_list.append(i)
    
    temp_list.sort()
    
    for i in range(len(temp_list)-1, -1, -1):
        answer += temp_list[i]

    return answer