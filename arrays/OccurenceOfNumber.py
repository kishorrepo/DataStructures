#
def countOccurences(arr, length, x):
	res=0
	for i in range (length):
		if x == arr[i]:
			res +=1
	return res

#Driver code
arr = [1,3,4,5,22,2,2,5,5,5]
length = len(arr)
x = 5
print( countOccurences(arr,length,x) )
