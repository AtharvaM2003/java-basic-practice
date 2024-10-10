def reverse_arr_sum(arr, n):
    # Step 1: Reverse the array
    reversed_arr = arr[::-1]
    
    # Step 2: Sum the elements at even indices in the reversed array
    
    
    return sum(reversed_arr[i] for i in range(n) if i % 2 == 0)

# Example usage
input1 = [10, 20, 30, 40, 50, 60]
input2 = 6
result = reverse_arr_sum(input1, input2)
print(result)  # Output should be 150 (60 + 40 + 10)
