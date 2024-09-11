import sys

def find_unique_names():
    input = sys.stdin.read
    data = input().strip().split('\n')
    
    n = int(data[0])
    names = data[1:]
    
    # 중복 제거
    unique_names = list(set(names))
    
    # 이름을 길이 순서로 정렬하고, 길이가 같으면 사전 순으로 정렬
    sorted_names = sorted(unique_names, key=lambda x: (len(x), x))
    
    # 결과 출력
    for name in sorted_names:
        print(name)

if __name__ == "__main__":
    find_unique_names()
