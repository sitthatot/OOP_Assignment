public class Pro1_64010889 {
    static boolean Isprime(int x)
    {
        int i=2;
        int num=x;
        while (i<num)
        {
            if (num%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }

    static boolean Palindromic(int x)
    {
        int ans=0;
        int num=x;
        while (num>0)
        {
            ans*=10;
            ans+=num%10;
            num/=10;
        }
        if (ans==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 100; i++) {
            if(Palindromic(i) && Isprime(i)){
                count++;
                System.out.print(i);
                if (count % 10 == 0) {
                    System.out.println();
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}
