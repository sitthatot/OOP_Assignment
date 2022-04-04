import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.text.DecimalFormat;

class Record {
    String rank;
    String salary;

    public Record(String rank, String salary) {
        this.rank = rank;
        this.salary = salary;
    }
    static void showTotalSalary(String yourRank,double yourTotal){
        System.out.println("Total salary for "+yourRank+" is "+df.format(yourTotal));
    }
    static void showAverageSalary(String yourRank,double yourTotal){
        System.out.println("Average salary for "+yourRank+" is "+df.format(yourTotal));
    }

    private static final DecimalFormat df = new DecimalFormat("#,###.00");


    public static void main(String[] args) throws IOException {


        FileInputStream fstream = new FileInputStream("Salary.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        String[] rank = new String[1000];
        double[] salary = new double[1000];
        double assistantCollector = 0;
        double associateCollector = 0;
        double fullCollector = 0;
        int assistantCount = 0;
        int associateCount = 0;
        int fullCount = 0;
        for (int i = 0; i < 1000; i++) {
            strLine = br.readLine();
            String[] tokens = strLine.split(" ");
            Record record = new Record(tokens[2], tokens[3]);//process record , etc
            rank[i] = record.rank;
            salary[i] = Double.parseDouble(record.salary);
            if (rank[i].equals("assistant")) {
                assistantCollector = assistantCollector + salary[i];
                assistantCount = assistantCount + 1;
            } else if (rank[i].equals("associate")) {
                associateCollector = associateCollector + salary[i];
                associateCount = associateCount + 1;
            } else if (rank[i].equals(("full"))){
                fullCollector = fullCollector + salary[i];
                fullCount = fullCount + 1;
            }
        }
        in.close();
        double total = assistantCollector + associateCollector + fullCollector;
        double assistantAverage = assistantCollector/assistantCount;
        double associateAverage = associateCollector/associateCount;
        double fullAverage = fullCollector/fullCount;
        double totalAverage = assistantAverage + associateAverage + fullAverage;
        showTotalSalary("assistant professor",assistantCollector);
        showTotalSalary("associate professor", associateCollector);
        showTotalSalary("full professor",fullCollector);
        showTotalSalary("all professors",total);
        showAverageSalary("assistant professor",assistantAverage);
        showAverageSalary("associate professor",associateAverage);
        showAverageSalary("full professor",fullAverage);
        showAverageSalary("all professors",totalAverage);
    }
}
