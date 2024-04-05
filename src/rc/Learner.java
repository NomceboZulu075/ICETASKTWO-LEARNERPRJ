/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;
import javax.swing.JOptionPane;

/**
 *
 * @author Nomcebo Zulu ST10452658
 */
public class Learner {

    //Create attributes and make the private to achieve encapsulation
        private String fullName;
        private String subject;
        private double assignmentMark;
        private double testMark;
        private double examMark;
        
    //Create default constructors to set all default values for the attributes
        public Learner() {
           this.fullName="";
           this.subject="";
           this.assignmentMark=0;
           this.testMark=0;
           this.examMark=0;
        }
           
    //Create accessor methods/getters to return the values of each attribute
        public String getFullName() {
           return this.fullName; 
        }
        public String getSubject(){
            return this.subject;
        }
        public double getAssignmentMark() {
            return this.assignmentMark;
        }
        public double getTestMark() {
            return this.testMark;
        }
        public double getExamMark() {
            return this.examMark;
        }
        
    //Create mutator methods/ setters to assign values to each attribute
        public void setFullName(String fullName) {
            this.fullName= fullName;
        }
        public void setSubject(String subject) {
            this.subject= subject;
        }
        public void setAssignmentMark(double assignmentMark) {
            this.assignmentMark= assignmentMark;
        }
        public void setTestMark(double testMark) {
            this.testMark= testMark;
        }
        public void setExamMark(double examMark) {
            this.examMark= examMark;
        }
        
        //Create learner object and this process is called instatiation
         static Learner objLearner= new Learner();

        public static void main(String[] args) {
        //Call method to get the student's details
            getLearnerInput();
            
        //Call method to display the final mark of the student
            displayFinalMark();
        
    }
           
         public static void getLearnerInput() {
             objLearner.setFullName(JOptionPane.showInputDialog("Enter your full name:"));
             objLearner.setSubject(JOptionPane.showInputDialog("Enter your subject:"));
             objLearner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter your assignment mark:")));
             objLearner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter yor test mark:")));
             objLearner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter your exam mark")));
        }
        
        /*A method to calculate final mark and a method
        to display final mark
        */
         public double calculateFinalMark() {
             return (this.assignmentMark + this.testMark + this.examMark)/3; //this is the average mark of all three marks combined
        }
         public static void displayFinalMark() {
             double finalMark= objLearner.calculateFinalMark();
             JOptionPane.showInputDialog(null, "This is your final Mark"+ finalMark);
         }
            
            
        }
 
    
    

