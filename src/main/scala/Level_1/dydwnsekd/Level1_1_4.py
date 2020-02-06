def solution(a, b):
    
    month_to_day = [31,29,31,30,31,30,31,31,30,31,30]
    Day_of_week = ['SUN','MON','TUE','WED','THU','FRI','SAT']
    day = 0
    for i in range(a-1):
        day += month_to_day[i]
        
    day = day + b + 4
    
    answer = Day_of_week[day%7]
    
    return answer