public class ComputeTax {
    public double ComputeTaxNow(int status, double income) {
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = {
                { 8350, 33950, 82250, 171550, 372950 }, // Single filer
                { 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow(er)
                { 8350, 33950, 68525, 104425, 186475 }, // Married separately
                { 11950, 45500, 117450, 190200, 372950 } // Head of household
        };
        if (income <= brackets[status][0]) {
            return income * rates[0];
        }
        if (income <= brackets[status][1]) {
            return (brackets[status][0] * rates[0]) + (income - brackets[status][0]) * rates[1];
        }
        if (income <= brackets[status][2]) {
            return (brackets[status][0] * rates[0]) +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (income - brackets[status][1]) * rates[2];
        }
        if (income <= brackets[status][3]) {
            return (brackets[status][0] * rates[0]) +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (income - brackets[status][2]) * rates[3];
        }
        if (income <= brackets[status][4]){
            return (brackets[status][0] * rates[0]) +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (income - brackets[status][3]) * rates[4];
        }

        return (brackets[status][0] * rates[0]) +
                (brackets[status][1] - brackets[status][0]) * rates[1] +
                (brackets[status][2] - brackets[status][1]) * rates[2] +
                (brackets[status][3] - brackets[status][2]) * rates[3] +
                (brackets[status][4] - brackets[status][3]) * rates[4] +
                (income - brackets[status][4]) * rates[5];

    }

}
