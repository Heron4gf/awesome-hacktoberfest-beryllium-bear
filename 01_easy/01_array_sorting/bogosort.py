import random
# this is obviously just for fun, don't even think about putting more than 5 numbers into a bogosort algorithm
def is_sorted(arr):
    for i in range(1, len(arr)):
        if arr[i] < arr[i - 1]:
            return False
    return True

def bogosort(arr):
    while not is_sorted(arr):
        random.shuffle(arr)

    return arr

# Example usage:
my_list = [3, 1, 4]
sorted_list = bogosort(my_list)
print(sorted_list)
