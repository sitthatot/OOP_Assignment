import java.util.GregorianCalendar;
import java.util.Arrays;

class StopWatch
{
    private long startTime, endTime;
    
    public StopWatch()
    { 
        GregorianCalendar calendar = new GregorianCalendar();
        startTime = calendar.getTimeInMillis();
    }
    // public long getStartTime()
    // {
    //     return startTime;
    // }
    // public long getEndTime()
    // {
    //     return endTime;
    // }
    public void start()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        startTime = calendar.getTimeInMillis();
    }
    public void stop()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        endTime = calendar.getTimeInMillis();
    }

    public long getElapsedTime()
    {
        return endTime - startTime;
    }
}

public class Pro3_64010889_week4 {
    static boolean isPrime(int num){
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    static boolean isPalindrome(int num){
        int r;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            r = num%10;
            sum = (sum*10)+r; //กลับเลข
            num = num/10; //ตัดหลักสุดท้ายไปเรื่อยๆ
        }
        if(temp == sum){
            return true; //เช็กว่าเท่ากันทั้งคู่ 121 = 121
        }
        else
            return false;
    }
    public static void main(String[] args){
        StopWatch stopWatch = new StopWatch();
        System.out.println("Creating a list containing 1000 elements," );
        double[] arr = new double[1000];
        for( int i=0; i < arr.length; i++ )
        {
            arr[i] = Math.random() * 1000;
        }
        for(int i = 0 ; i<1000;i++)
        {
        
            System.out.printf("%8.2f ",arr[i]);
            if((i+1) % 5 == 0)
            {
                System.out.print("\n");

            }
        }
        // System.out.println("   ...");
        // for (int i = 990; i < 1000; i++) 
        // {
        //     System.out.printf("%8.2f ", arr[i]);
        //     if ((i + 1) % 5 == 0) {
        //         System.out.print("\n");
        //     }
        // }
        ///////////////////////////////////////////
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        stopWatch.start();
        Arrays.sort(arr);
        
        for(int i = 0 ; i<1000;i++)
        {
            System.out.printf("%8.2f ",arr[i]);
            if((i+1) % 5 == 0)
            {
                System.out.print("\n");
            }
        }
        // System.out.println("   ...");
        // for (int i = 995; i < 1000; i++) 
        // {
        //     System.out.printf("%8.2f ", arr[i]);
        //     if ((i + 1) % 5 == 0) 
        //     {
        //         System.out.print("\n");
        //     }
        // }

        stopWatch.stop();

        System.out.println();
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is " + stopWatch.getElapsedTime() + " milliseconds." );
        System.out.println("------------------------------------------------------------");
        
        System.out.println("The palindromPrime stopwatch starts...");
        stopWatch.start();
        int count=0;
        for(int i = 0;count<1000;i++)
        {
            if(isPalindrome(i) && isPrime(i))
            {
                count++;
                System.out.print(i);
                if (count % 10 == 0) {
                    System.out.println();
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
        stopWatch.stop();
        System.out.println(" ");
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+stopWatch.getElapsedTime()+" milliseconds.");
    }

}