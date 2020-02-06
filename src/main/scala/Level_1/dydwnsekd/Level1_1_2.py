def solution(array, commands):
    answer = []
    
    for command in commands:
        temp_array = array[(command[0]-1):(command[1])]
        temp_array.sort()
        answer.append(temp_array[command[2]-1])
    
    return answer