import javax.swing.JOptionPane;
public class HouseCount1 {
   public static void main(String[] args) {
//initializing
int numofHome [] = {0,0,0,0};
int costOfeachHome [] = {99955, 423699, 777399, 1025999};
String homeType = ""; 
int totalCost[] = {0,0,0,0};
int totalallHomeCost = 0;
int i = 0;
int totalallHomeCount = 0;
//user input loop
while (!homeType.equals("QUIT")) {
homeType = JOptionPane.showInputDialog("Enter the home type or QUIT: "); 

if (homeType.equals("Cottage")){
   numofHome[0] = numofHome[0] + 1;
}

else if (homeType.equals("Victorian")) {
   numofHome [1] = numofHome [1] + 1;
}

else if (homeType.equals("Tudor Revival")) {
   numofHome[2] = numofHome[2] + 1;
}

else if (homeType.equals("Mansion")){
   numofHome[3] = numofHome[3] + 1;
}

else if (homeType.equals("QUIT")){
   JOptionPane.showMessageDialog(null,"Calculating Total...");
}

else {
   JOptionPane.showMessageDialog(null,"Invalid Input. Please enter the home type again: ");   
}
//ENDIF
//ENDDO
}

for (i=0; i < numofHome.length; i++) {
totalCost [i] = (numofHome [i] * costOfeachHome[i]);
}
int totalNumofHome = numofHome[0] + numofHome[1] + numofHome[2] + numofHome[3];
totalallHomeCost = totalCost[0] + totalCost[1] + totalCost[2] + totalCost[3];
int avgCostofHome = totalallHomeCost / totalNumofHome;

for (i = 0; i < numofHome.length; i++){  
JOptionPane.showMessageDialog(null, "There will be "+numofHome[i]+homeType+"built,");
} 

JOptionPane.showMessageDialog(null, "The total cost of all homes that will be built is $"+totalallHomeCost+"and the average cost of home is $"+avgCostofHome);
}
}