# # [10,  20,     30]
# # [60 , 100, 120]


# # 0	   0   10   20    30    40   50 

# # 0.   0   0    0     0     0     0
# # 10   0   60.  60.   60.  60.   60
# # 20.  0   60  100. 160  160.  160
# # 30   0   60   100. 160. 180.  220
# # curr_capacity = j - weights[i-1]
# #                 40 - 30
# # Capacity = 50 units
# # Weights = [10,  20, 30  ]
# # Profits=  [60, 100, 120 ]

# # Max_profit = 220

# Capacity = 50 
# weights = [10, 20, 30]
# profits = [60, 100,120]
# n = len(weights)

# dp = [[0  for _ in range(Capacity+1)] for i in range(len(weights)+1)]
# # print(len(dp), len(dp[0]))

# for i in range(1,len(dp)):
#     for j in range(len(dp[0])):
#         if weights[i-1] <= j:
#             dp[i][j] = max(dp[i-1][j], profits[i-1]+ dp[i-1][j - weights[i-1]])
#         else:
#             dp[i][j] = dp[i-1][j]

# for i in range(len(dp)):
#     for j in range(len(dp[0])):
#         if j in [10, 20, 30, 40, 50]:
#             print(dp[i][j])





# # for i in range(1, n + 1):
# #     for j in range(Capacity + 1):
# #         if weights[i - 1] <= j:
# #             dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + profits[i - 1])
# #         else:

# #             dp[i][j] = dp[i - 1][j]

# # print( dp[n][Capacity])