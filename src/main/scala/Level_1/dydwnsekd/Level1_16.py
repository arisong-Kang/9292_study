#이상한 문자 만들기

def solution(s):
    answer = ''
    split_s = s.split(" ")
    
    for ss in split_s:
        for i in range(len(ss)):
            if i % 2 == 0:
                answer += ss[i].upper()
            else:
                answer += ss[i].lower()
        
        answer += " "
    
    return answer[:-1]