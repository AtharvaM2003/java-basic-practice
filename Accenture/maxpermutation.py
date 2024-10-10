class MaxPermutation:
    @classmethod
    def maxPermutationValue(cls, input1, input2):
        def fact(n):
            if n <= 1:
                return 1
            return n * fact(n - 1)
        
        max_val = 0  # To store the maximum permutation value
        
        # Iterate over each word in input1
        for word in input1:
            res = ""  # To store the consonants after removing vowels
            
            # Remove vowels from the word
            for char in word.lower():
                if char not in "aeiou":
                    res += char
            
            # Calculate factorial if there are consonants left
            if len(res) > 0:
                max_val = max(max_val, fact(len(res)))  # Update max permutation value
        
        return max_val


# Example usage
input1 = ["hello", "cchic", "aaeiou"]
input2 = len(input1)

# Call the class method
result = MaxPermutation.maxPermutationValue(input1, input2)
print(result)
