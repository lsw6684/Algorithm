def solution(numbers):
    answer = []
    for x, a in enumerate(numbers):
        for y, b in enumerate(numbers):
            if x == y:
                continue;
            answer.append(a+b)
    return sorted(list(set(answer)))
