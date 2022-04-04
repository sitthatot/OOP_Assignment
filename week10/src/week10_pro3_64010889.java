import java.io.FileWriter;
import java.io.IOException;

import java.text.DecimalFormat;
public class week10_pro3_64010889 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    static String Generate(int i) {
        int randomRank = (int)(Math.random()*3);
        String[] rank = {"assistant","associate","full"};
        float randomSalary = 0;
        if(rank[randomRank] == "assistant"){
            randomSalary = (float)((Math.random() * (80000 - 50000)) + 50000);
            //randomSalary = (float)((Math.random() * (1000 - 500)) + 500);
        }
        else if(rank[randomRank] == "associate"){
            randomSalary = (float)((Math.random() * (110000 - 60000)) + 60000);
            //randomSalary = (float)((Math.random() * (2000 - 1200)) + 1200);
        }
        else if(rank[randomRank] == "full"){
            randomSalary = (float)((Math.random() * (130000 - 75000)) + 75000);
            //randomSalary = (float)((Math.random() * (3000 - 2500)) + 2500);
        }
        i=i+1;
        return "FirstName"+i+" LastName"+i+" "+rank[randomRank]+" "+df.format(randomSalary)+"\n";
    }
    public static void main(String[] args) throws IOException {

            FileWriter myWriter = new FileWriter("Salary.txt");
            for(int i = 0; i<1000;i++){
                myWriter.write(Generate(i));
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
    }
}
