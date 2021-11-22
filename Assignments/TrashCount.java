/*
The purpose of this program is to print waste management data.  
It should print the Class Name, Class Size, Total Waste, Total Students, and the average of both recyable waste and nonrecyclable waste.*/
import java.util.*;
import javax.swing.JOptionPane;
public class TrashCount{
   public static void main(String[]args){

//this sets up the variables needed in the for loop outside of the for loop
double totalStudents = 0;
double allNonTotal = 0;
double allRecTotal = 0;

//This will allow the user to input the average individual amounts of waste before the while loop
//try and catch catches negative numbers hopefully
  double indivAveNon = 0;
      try {
         indivAveNon = Double.parseDouble(JOptionPane.showInputDialog("Enter the average amount of nonrecyclable waste an individual may produce: "));
      }
      catch (NumberFormatException e) {                 
         JOptionPane.showMessageDialog(null, "Sorry, you did not enter a valid value. Please try again.");         
         }
   double indivAveRec = 0;
      try {
         indivAveRec = Double.parseDouble(JOptionPane.showInputDialog("Enter the average amount of recyclable waste an individual may produce: "));
         }
      catch(NumberFormatException e) {        
         JOptionPane.showMessageDialog(null, "Sorry, you did not enter a valid value. Please try again.");         
         }
   if (indivAveNon < 0 ){
      JOptionPane.showMessageDialog(null, "Invalid amount, must be above 0");
      } 
   if (indivAveRec < 0 ){
      JOptionPane.showMessageDialog(null, "Invalid amount, must be above 0");
      } 

//this starts the for loop
   for (int i = 0; i <= 3; i++)
      {
         String className = JOptionPane.showInputDialog("Enter the name of the class: ");
         int classSize = 0;
            try {
            classSize = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the class: "));
            }
            catch(NumberFormatException e) {        
            JOptionPane.showMessageDialog(null, "Sorry, you did not enter a valid value. Please try again.");
            }
            if (classSize < 0 ){
               JOptionPane.showMessageDialog(null, "Invalid grade, must be between 0 and 100");
            }

   //calculations within the for loop      
         double nonTotal = indivAveNon * classSize;
         double recTotal = indivAveRec * classSize;
         totalStudents = totalStudents + classSize;
         double totalWaste = (recTotal + nonTotal) * classSize;
         allNonTotal = allNonTotal + nonTotal;
         allRecTotal = allRecTotal + recTotal;
         
      }

     //print statements
   JOptionPane.showMessageDialog(null, "The total number of nonrecyclable waste is "+allNonTotal+".");
   JOptionPane.showMessageDialog(null, "The total number of recyclable waste is "+allRecTotal+".");
   JOptionPane.showMessageDialog(null, "The total students attending GMU is "+totalStudents+".");
   }
}