import sys

def find_unique_words():
    input = sys.stdin.read
    data = input().strip().split('\n')
    
    n = int(data[0])
    words = data[1:]
    
    # 중복 제거
    unique_words = list(set(words))
    
    # 단어를 길이 순서로 정렬하고, 길이가 같으면 사전 순으로 정렬
    sorted_words = sorted(unique_words, key=lambda x: (len(x), x))
    
    # 결과 출력
    for word in sorted_words:
        print(word)

if __name__ == "__main__":
    find_unique_words()
