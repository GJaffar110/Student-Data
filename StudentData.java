class StudentData
{
    public static void main(String args[]){
        String studentdata = "Ahmed:67,Hassan:78, Hussain:85,Ali:57";
        String[] records = studentdata.split(",");
        String[] names = new String[records.length];
        int[] scores = new int[records.length];
        for(int i = 0; i< records.length; i++){
            String[] parts = records[i].split(":");
            names[i] = parts[0].trim();
            scores[i] = Integer.parseInt(parts[1].trim());
        }
        int totalStudents = names.length;
        System.out.println("Total number of students: "  + totalStudents);
        int sum = 0;
        for (int score : scores)
        {
            sum += score;
        }
        double averageScore = (double) sum/totalStudents;
        System.out.println("Average score of Students:" + averageScore);
        int highestScore = scores[0];
        String studentWithHighestScore  = names[0];
        for (int i = 1; i<scores.length; i++)
        {
            if(scores[i] > highestScore)
            {
                highestScore = scores[i];
                studentWithHighestScore = names[i];
            }
        }
        System.out.println("Highest score:" + highestScore );
        System.out.println("Student with highest score:" + studentWithHighestScore);
        int lowestScore = scores[0];
        String studentWithLowestScore = names[0];
        for (int i = 1; i<scores.length; i++)
        {
            if (scores[i] < lowestScore)
            {
                lowestScore = scores[i];
                studentWithLowestScore = names[i];
            }
        }
        System.out.println("Lowest Score; " + lowestScore);
        System.out.println("Student with lowest Score:" + studentWithLowestScore);
    }
}