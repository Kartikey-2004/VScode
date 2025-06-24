# count = 1
# while count <= 5:
#     print("hello", count)
#     count += 1

# count = 5
# while count >= 1:
#     print("hello", count)
#     count -= 1

# num = 1
# while num <= 100:
#     print(num)
#     num += 1

# num = 1
# while num <= 10:
#     print("2 *", num, "=", 2 * num)
#     num += 1

# i = 1
# while i <= 10:
#     print(i**2)
#     i += 1

# x = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
# y = int(input("Enter the you guess is in the list : "))
# i = 0
# while i < len(x):
#     if y == x[i]:
#         print("Found at inx :", i)
#         break
#     i += 1
# else:
#     print("Not present")

# x = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
# y = int(input("Enter the num u want to check : "))
# if y in x:
#     print("I am here")

# seq = range(6)
# for i in seq:
#     print(i)

# for i in range(7, 71, 7):
#     print(i)


# def avg(a, b, c):
#     return (a + b + c) / 3


# def len_list(list):
#     return len(list)


# def cal_fact(n):
#     fact = 1
#     for i in range(1, n + 1):
#         fact *= i
#     print(fact)


# def fact(n):
#     if n == 0 or n == 1:
#         return 1
#     else:
#         return fact(n - 1) * n


# def sum_n(n):
#     if n == 0:
#         return 0
#     else:
#         return sum_n(n - 1) + n


# f = open("demo.txt", "r")
# data = f.read()
# print(data)
# print(type(data))
# line1=f.readline()
# print(line1)
# f.close()

# with open("demo.txt", "r") as f:
#     data = f.read()
# new_data = data.replace("this", "that")
# print(new_data)
# if data.find != -1:
#     print("found")
# else:
#     print("not found")


# def sqr(n):
#     """This function calculates and prints the square of a number."""
#     n = int(input("Enter num : "))
#     sqr = n**2
#     print(sqr)


# sqr(2)
# print(sqr.__doc__)


