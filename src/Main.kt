fun Main() {

}

class CountingCombinations {
    /*
    Task
Write a function that counts how many different ways you can make change for an amount of money given an array of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:

1+1+1+1, 1+1+2, 2+2.
The order of coins does not matter:

1+1+2 == 2+1+1
Also, assume that you have an infinite ammount of coins.

Your function should take an amount to change and an array of unique denominations for the coins.

Specification
Challenge.countChange(money, coins)
Parameters
money: Int - Number to make change for

coins: Array<Int> - Array of denominations

Return Value
Int - Number of ways change can be made

Examples
money	coins	Return Value
4	    [1,2]	    3
10  	[5,2,3]	    4
11	    [5,7]	    0
     */

    fun countChange(money: Int, coins: ArrayList<Int>): Int {
            // Write your code here
        //in case of money less than or equal to zero or coins to change to is zero or null, we just return one for coin and zero for the empty list
     if(money == 0) return 1
      if(coins.isEmpty()) return 0 // because there is no denomination to change to
        val changes = IntArray(money+1) //a list where all number of way a coin can be changed is stored, this is an empty list with money+1 size
    changes[0]=1 //atleast any amount can be changed 1 number of ways
        
     // loop through the coins 
    for(coin in coins){ // for each coin in the list of coins
        for (j in coin..money){ //j takes index from the coin to change with to the amount
            changes[j] += changes[j-coin] //same as changes[j] = changes[j]+changes[j-coins] >>>re- assigning values of empty list we created for changes
        }
    }
   // println(result.toList())
    return changes[money]
    }
    
    //i found out that the above solution was failing 3 test cases on hackerrank so 
    //I was debugging and found out that some values are actually lost when the int becomes too long
    // then i modified the return value to long and it works fine
    //see solution below
    fun countChange(money: Int, coins: ArrayList<Int>): Long { //return statment becomes long instead of int
            // Write your code here
     if(money == 0) return 1
      if(coins.isEmpty()) return 0 
      val changes = LongArray(money+1) //this becomes Long Array
      changes[0]=1 
      for(coin in coins){         
          for (j in coin..money){ 
            changes[j] += changes[j-coin]
        }
    }
   // println(result.toList())
    return changes[money]
    }
    
}
