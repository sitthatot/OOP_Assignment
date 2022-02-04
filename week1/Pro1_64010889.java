public class Pro1_64010889 {

    public static void main(String[] args) {
        long secToYear = 60 * 60 * 24 * 365;
        for(int i = 1; i<= 5 ;i++){
            long birth = (secToYear * i)/7;
            long death = (secToYear * i)/13;
            long immigrant = (secToYear * i)/45;
            long population = 312032486;
            long calculate = population + birth - death +immigrant;
            System.out.println("Year "+i +" population are "+calculate);
        }
    }
}