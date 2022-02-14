public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight * KILOGRAMS_PER_POUND;
        this.height = (feet * 12 + inches) * METERS_PER_INCH;
    }
    public double BMICalculate(){
        double bmi = weight/Math.pow(height,2);
        return bmi;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public String BMIStatus(){
        double bmi = BMICalculate();
        if(bmi < 18.5)
            return "UnderWeight";
        else if(bmi >=18.5 && bmi < 25)
            return "Normal";
        else if(bmi >= 25 && bmi < 30)
            return "OverWeight";
        else
            return "Obese";
    }

}
