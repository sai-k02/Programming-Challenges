# program will output the highest stock price from buying and then selling
"""
Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.

Time complexity: O(N^2)

"""

def main():
    stockPrices = [9, 11, 8, 5, 7, 10]
    print(getMaxProfit(stockPrices))
    
def getMaxProfit(stockPrices):
    maxElement = stockPrices[1] - stockPrices[0]

    for p1 in range(0, len(stockPrices)):
        for p2 in range(p1+1, len(stockPrices)):
            if(maxElement < stockPrices[p2] - stockPrices[p1]):
                maxElement = stockPrices[p2] - stockPrices[p1]
                print(maxElement, stockPrices[p2], stockPrices[p1])
            p2 += 1

    return maxElement
        
        



main()