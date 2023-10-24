def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        # Flag to optimize by checking if any swaps were made in this pass
        swapped = False
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]  # Swap the elements
                swapped = True

        # If no two elements were swapped in this pass, the array is already sorted
        if not swapped:
            break

    return arr

# Example usage:
my_list = [64, 34, 25, 12, 22, 11, 90]
sorted_list = bubble_sort(my_list)
print(sorted_list)
