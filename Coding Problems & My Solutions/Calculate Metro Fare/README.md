Calculate Metro Fare

Given the current time t (in int format) and the number of stations s (in int format) that a metro passenger rides, calculate and return the fare f(in double format) based on the criteria below:
• 0900 hrs to 1700 hrs are considered peak hours and any other hours are considered off-peak hours.
• Fare prices increase by 1.5x during peak hours as compared to off-peak hours.
• Fare for 0-5 stations for off-peak hours is $2
• Fare for 6-10 stations for off-peak hours is $4
• The fare for 10+ stations for off-peak hours is $4 + 20 cents for each additional station commuted.
• The maximum fare cannot exceed $6 during off-peak hours and $9 during peak hours.
• Return -1 in case of an invalid time format or stations traveled being fewer than 1.
Examples:
• If the tis 0800 and s is 3, the fare f = $2
• If the tis 1930 and s is 7, the fare f = $4
• If the tis 1030 and s is 9, the fare f = $6 (since 1.5*4 = 6).
• If the tis 2100 and s is 12, the fare f = $4.40 (since 4 + (.20 * 2) = 4.40)
For this test you're using