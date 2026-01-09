class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # If the list has more that one zero's then
        # the product at all the places will be zero
        if nums.count(0) > 1:
            return [0 for _ in range(len(nums))]
        # Process the list of nums and replace the 0 by 1
        # Since, there will be only 1 zero at this point,
        # the product by replacing the zero with 1 will
        # be used across the list since when place of zero
        # comes for calculation, we can place the product there
        processed_list = []
        for num in nums:
            processed_list.append(
                1 if num == 0 else num
            )
        product = math.prod(processed_list)
        result = []
        has_zero = bool(nums.count(0))
        for num in nums:
            if has_zero:
                # When zero is present in the list, all the places
                # except zero's place will have a product zero.
                # The zero's place will have product as product.
                prod_except_self = 0 if num != 0 else product
            else:
                # Take the product of all nums in the array,
                # and divide the product by the number at index i to
                # get the product except num at i
                prod_except_self = product / num
            result.append(int(prod_except_self))
        return result
