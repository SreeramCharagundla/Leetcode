package NumberOfDaysBetweenTwoDates;

class Solution {

    public static void main(String[] args) {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        System.out.println(new Solution().daysBetweenDates(date1, date2));
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysSince1971(date1) - daysSince1971(date2));
    }
    
    private int daysSince1971(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        int totalDays = 0;
        
        // Days from years
        for (int y = 1971; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        
        // Days from months
        int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int m = 1; m < month; m++) {
            if (m == 2 && isLeapYear(year)) {
                totalDays += 29; // February in a leap year
            } else {
                totalDays += daysInMonths[m - 1];
            }
        }
        
        // Days from days
        totalDays += day;
        
        return totalDays;
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}

