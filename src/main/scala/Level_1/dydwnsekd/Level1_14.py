#시저 암호
def solution(s, n):
    answer = ''
    for i in s:
        if 97 <= ord(i) <= 122:
            temp = ord(i) - 97 + n
            temp %= 26
            temp += 97
            answer += chr(temp)
        elif 65 <= ord(i) <= 90:
            temp = ord(i) - 65 + n
            temp %= 26
            temp += 65
            answer += chr(temp)
        else:
            answer += i
    return answer