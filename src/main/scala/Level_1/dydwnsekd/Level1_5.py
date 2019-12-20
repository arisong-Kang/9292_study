def solution(s):
    len_s = len(s)
    answer = ''

    if len_s % 2 == 0:
        answer = s[int(int(len_s/2)-1):int(int(len_s/2)+1)]
    else:
        answer = (s[int(len(s)/2)])
    
    return answer