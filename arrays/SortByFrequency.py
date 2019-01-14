def findFrequency(arr):
    frequency = dict({})
    for i in arr:
        if i in frequency.keys():
            frequency[i] = frequency[i]+1
        else:
            frequency[i] = 1
    return frequency
def sortArrayBasedOnFrequency(arr):
    sortedArr = []
    frequency = findFrequency(arr)
    frequencyOrder = sorted(frequency, key=frequency.get)
    loop = 0

    while len(frequencyOrder) > 0 :
        num = frequencyOrder.pop()
        count = frequency(num)
        loop = loop + 1

        while count > 0:
            loop = loop +1
            sortedArr.append(num)
            count = count -1
        print("Loop Count")
        print(loop)
    return sortedArr


#Driver Program
a=[1, 2, 3, 4, 3, 3, 3, 6, 7, 1, 1, 9, 3, 2]
print(a)
print("sorted array based on frequency of the number")
#print("sortArrayBasedOnFrequency(a)")
result = sortArrayBasedOnFrequency(a)
print(result)