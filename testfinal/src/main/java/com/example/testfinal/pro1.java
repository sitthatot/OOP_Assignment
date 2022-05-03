package com.example.testfinal;
public class pro1 {


    public static void main(String[] args) {
        String[] student0 = new String[]{"A","B","A","C","C","D","E","E","A","D"};
        String[] student1 = new String[]{"D","B","A","B","C","A","E","E","A","D"};
        String[] student2 = new String[]{"E","D","D","A","C","B","E","E","A","D"};
        String[] student3 = new String[]{"C","B","A","E","D","C","E","E","A","D"};
        String[] student4 = new String[]{"A","B","D","C","C","D","E","E","A","D"};
        String[] student5 = new String[]{"B","B","E","C","C","D","E","E","A","D"};
        String[] student6 = new String[]{"B","B","A","C","C","D","E","E","A","D"};
        String[] student7 = new String[]{"E","B","E","C","C","D","E","E","A","D"};
        String[] ansKey = new String[]{"D","B","D","C","C","D","A","E","A","C"};
        int count = 0;

        correct(count,student0,ansKey,0);
        correct(count,student1,ansKey,1);
        correct(count,student2,ansKey,2);
        correct(count,student3,ansKey,3);
        correct(count,student4,ansKey,4);
        correct(count,student5,ansKey,5);
        correct(count,student6,ansKey,6);
        correct(count,student7,ansKey,7);
    }
        public static void correct(int count, String[] Student,String[] ansKey,int numberOfStudent){
            for(int i = 0; i<10; i++){
                if(Student[i] == ansKey[i])
                    count += 1;
            }
            System.out.println("Student "+numberOfStudent+"'s correct count is " + count);
    }
}