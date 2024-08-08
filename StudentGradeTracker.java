import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    // List to store grades entered by the user
    private ArrayList<Double> grades;

    // Constructor to initialize the grades list
    public StudentGradeTracker() {
        grades = new ArrayList<>();
    }

    /**
     * Adds a grade to the grades list.
     * 
     * @param grade The grade to be added (e.g., 85.5).
     */
    public void addGrade(double grade) {
        grades.add(grade);
    }

    /**
     * Calculates the average of all grades in the list.
     * 
     * @return The average grade.
     */
    public double calculateAverage() {
        double sum = 0;
        // Summing up all the grades
        for (double grade : grades) {
            sum += grade;
        }
        // Dividing by the number of grades to get the average
        return sum / grades.size();
    }

    /**
     * Converts an average grade to a letter grade.
     * 
     * @param average The average grade to be converted.
     * @return The corresponding letter grade (e.g., "A", "B").
     */
    public String getLetterGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F"; // Any average below 60 is an "F"
    }

    /**
     * Displays the grades, the average grade, and the corresponding letter grade.
     */
    public void displayGrades() {
        // Display the list of grades
        System.out.println("Grades: " + grades);
        
        // Calculate and display the average grade
        double average = calculateAverage();
        System.out.println("Overall Grade: " + average);
        
        // Calculate and display the corresponding letter grade
        System.out.println("Letter Grade: " + getLetterGrade(average));
    }

    /**
     * Main method to run the program. It allows the user to input grades and
     * displays the results.
     */
    public static void main(String[] args) {
        // Create an instance of StudentGradeTracker
        StudentGradeTracker tracker = new StudentGradeTracker();
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter grades
        System.out.println("Enter Marks for different subjects  (-1 to finish): ");
        
        // Loop to input grades until the user enters -1
        double grade;
        while ((grade = scanner.nextDouble()) != -1) {
            tracker.addGrade(grade);
        }
        
        // Display the entered grades, average, and letter grade
        tracker.displayGrades();
    }
