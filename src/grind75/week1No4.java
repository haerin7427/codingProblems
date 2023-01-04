package grind75;
import java.util.*;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// title : 121. Best Time to Buy and Sell Stock
// time : 30m + help
// Create by haerin on 2023/01/04

public class week1No4 {
    class Solution {
        // 시간복잡도 : n
        // 알고리즘 : DP
        public int maxProfit(int[] prices) {
            int min_price = Integer.MAX_VALUE;
            int max_profit = 0;
    
            for(int today_price : prices) {
                if(today_price < min_price) {
                    min_price = today_price;
                }
    
                if(max_profit < today_price - min_price) {
                    max_profit = today_price - min_price;
                }
            }
            return max_profit;
        }
    }
    class FalseSolution {
        // Time Limit 
        // 시간복잡도 n^2
        // 알고리즘 : 완전탐색
        public int maxProfit(int[] prices) {
            int max_profit = 0;
            for(int buy_day=0; buy_day < prices.length-1; buy_day+=1) {
                for(int sell_day=buy_day+1; sell_day < prices.length; sell_day+=1) {
                    if(prices[sell_day] -prices[buy_day] > max_profit) {
                        max_profit = prices[sell_day] -prices[buy_day];
                    }
                }
            }
            return max_profit;
        }
    }

    class FalseSolution2 {
        // Time Limit 
        // 시간복잡도 n^2
        public class Stock implements Comparable {
            int price;
            int day;
    
            public Stock(int price, int day) {
                this.price = price;
                this.day = day;
            }
            public Integer getPrice() {
                return this.price;
            }
            public Integer getDay() {
                return this.day;
            }
    
            public boolean equals(Stock obj) {
                return ((Stock) obj).getPrice().equals(getPrice());
            }
    
            @Override
            public int compareTo(Object o) {
                Stock stock = (Stock) o;
                return getPrice().compareTo(stock.getPrice());
            }
        }
        public int maxProfit(int[] prices) {
            Stock[] stockArray = new Stock[prices.length];
            for(int idx=0; idx<prices.length; idx+=1) {
                stockArray[idx] = new Stock(prices[idx], idx);
            }
            Arrays.sort(stockArray); 
            int max_profit = 0;
            for(int buy_idx=0; buy_idx<stockArray.length-1; buy_idx+=1) {
                for(int sell_idx=stockArray.length-1; sell_idx>=0; sell_idx-=1) {
    
                    if(stockArray[sell_idx].getPrice() - stockArray[buy_idx].getPrice() > max_profit) {
                        if(stockArray[sell_idx].getDay() > stockArray[buy_idx].getDay()) {
                            max_profit = stockArray[sell_idx].getPrice() - stockArray[buy_idx].getPrice();
                            continue;
                        }
    
                    } else {
                        continue;
                    }
                }
    
            }
            
            return max_profit;
        }
    }
}
