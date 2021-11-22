import javax.swing.JOptionPane;
import java.util.Arrays;
public class menu {
   public static void main (String[]args)
{
   int minNumGuest = 1;
   int maxNumGuest = 250; 
   int guestNums = getNumberOfGuests(minNumGuest, maxNumGuest);
   String [][] guestInfo = getGuestInfo(guestNums);
   int [] foodChoiceCount = calculateCount(guestInfo);
   int [] total = calculateTotal(foodChoiceCount);
   print(guestInfo, foodChoiceCount, total);
}
public static int getNumberOfGuests(int min, int max)
{
   int size = 0;
   do{
      try{
         size = Integer.parseInt(JOptionPane.showInputDialog("Input the number of guests: "));
         }
      catch (NumberFormatException e){
         size = 0;
      }
      if (size <=0)
      {
         JOptionPane.showInputDialog("Invalid entry. Try again.");
      }
      } while (size <= min || size >= max); 
   return size;
}

public static String[][] getGuestInfo(int size)
   {
   String[][] guestInfo = new String[size][2];
   for (int i = 0; i< size; i++){
         guestInfo[i][0] = getUserName(); 
         guestInfo[i][1] = getFoodChoice(); 
      }
    return guestInfo;
   }
public static String getUserName()
   { String name = "";
      do{
      name = JOptionPane.showInputDialog("Enter the guest name: ");
      if (name.equals("")){
         JOptionPane.showMessageDialog(null, "Invalid. Try again.");
        } 
        }while(name.equals("") || name.equals(null));
      return name;
      
   }
public static String getFoodChoice()
   {   
      String food = "";
      do{
            food = JOptionPane.showInputDialog("Enter the food choice: "); 
            if (!food.equalsIgnoreCase("Chicken")&&!food.equalsIgnoreCase("Pasta")&&!food.equalsIgnoreCase("Vegetarian")){
               JOptionPane.showMessageDialog(null, "Invalid entry. Note: Enter Vegetarian, not Veggie or other abbreviation. Try again.");
        }
      } while (!food.equalsIgnoreCase("Chicken")&&!food.equalsIgnoreCase("Pasta")&&!food.equalsIgnoreCase("Vegetarian"));  
      return food;
   }
public static int[] calculateCount(String[][] info)
{
   int[] FoodChoiceCount = {0,0,0};
   for (int i = 0; i< info.length; i++){
      if (info[i][1].equalsIgnoreCase("Chicken")){
            FoodChoiceCount[0]+=1;
       }
      else if (info[i][1].equalsIgnoreCase("Pasta")){
         FoodChoiceCount[1]+=1;
      }
      else{
         FoodChoiceCount[2]+=1;
      }
   }
   return FoodChoiceCount;
}
public static int[] calculateTotal(int[] foodChoiceCount)
{
int[] foodtotal = {0,0,0};
foodtotal[0] = foodChoiceCount[0] * 50;
foodtotal [1] = foodChoiceCount[1] * 45;
foodtotal [2] = foodChoiceCount[2] * 40;
return foodtotal;
}

public static void print(String[][] guestInfo, int[] FoodChoiceCount, int[] total)
{
String output = "";
for (int i = 0; i< guestInfo.length; i++){
   output+=guestInfo[i][0]+" chooses "+guestInfo[i][1]+"\n" ;
   }
   JOptionPane.showMessageDialog(null, output);
JOptionPane.showMessageDialog(null, "\nChicken Count: "+FoodChoiceCount[0]+"\nPasta Count: "+FoodChoiceCount[1]+"\nVegetarian Count: "+FoodChoiceCount[2]);
JOptionPane.showMessageDialog(null, "\nChicken Cost: "+total[0]+"\nPasta Cost: "+total[1]+"\nVegetarian Cost: "+total[2]);
}


}