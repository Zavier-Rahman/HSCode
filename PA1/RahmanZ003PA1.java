/**
 * Method Purpose:  Users are prompted for the projected sales revenue, the number of sales reps, the number of 
 * quarters a rep has worked, the quarter(s) in which revenue was earned, and he sales revenue for each month within a 
 * quarter. If the sales rep is earning 50% or above their target, then an encouraging message is given; otherwise, a 
 * warning that sales are lagging. If sales revenue for the company is greater than or equal to 100% of projected 
 * annual sales, then employees qualify for a 2-5% year-end bonus; otherwise, the sales are not on track to meet 
 * projections, and no year-end bonus can be expected.
 */
 //Code import statements.
 import java.util.Scanner;
 public class RahmanZ003PA1
 {
   public static void main(String[] args)
   {
     String salesRep, monthNo, quarter;
     double salesRevenue, quarterlySales, annualSales, projectedSales;
     double percOfTargetCo, perceOfTargetRep;
     int qtrChoice, monthCounter, qtrCounter, noOfMonths;
     int noOfQtrs, noSalesReps, salesRepCtr;
     //Lines 15-19 initialize all variables
     
     Scanner kb = new Scanner(System.in); //creates scanner objects
     System.out.printf("%nWhat is the projected annual sales for Tandem?>> ");
     projectedSales = kb.nextDouble();
     //Gets and assigns projected sales (Prompt 1)
     
     System.out.printf("%nHow many sales reps work for Tandem?>> ");
     noSalesReps = kb.nextInt();
     //Gets and assigns the number of sales reps (Prompt 2)
     
     qtrCounter = 0;
     salesRepCtr = 0;
     
     do{ //controls the sales reps
       qtrCounter = 1;
       quarterlySales = 0;
       annualSales = 0;
       salesRevenue = 0;
  
       System.out.printf("%nEnter the name of %s sales rep: ", salesRepCtr == 0 ? "a":"the next");
       salesRep = kb.next();
       //Gets and assigns name of sales rep (Prompt 3)
       kb.nextLine();
       
       System.out.printf("%nEnter the number of quarters worked (no less than 1 or greater than 4): %n");
       noOfQtrs = kb.nextInt();
       //Gets and assigns number of quarters worked (Prompt 4)
       
       qtrCounter = 0; //Assigns 0 to qtrCounter, resets when looped
       kb.nextLine();
       while(qtrCounter < noOfQtrs){ //Controls the number of quarters
         System.out.printf("%n1. First Quarter\n2. Second Quarter\n3. Third Quarter\n4. Fourth Quarter");
         System.out.printf("%n%nChoose the %squarter in which sales were earned: ", qtrCounter > 0 ?"next ":"");
         qtrChoice = kb.nextInt();
         //Gets and assigns quarter choice (Prompt 5)
         
         quarter = (qtrChoice == 1) ? "First Quarter":(qtrChoice == 2) ? "Second Quarter:":(qtrChoice==3)?
                    "Third Quarter":"Fourth Quarter";
         
         kb.nextLine();
         monthCounter = 1;
         
         while(monthCounter <= 3){ //controls the number of months
           if(monthCounter == 1){
             monthNo = "1st";
           }
           else if(monthCounter == 2){
             monthNo = "2nd";
           }
           else{
             monthNo = "3rd";
           }
           
           System.out.printf("%nEnter the sales revenue for the " + monthNo + " month of the " + quarter);
           salesRevenue += kb.nextInt();
           kb.nextLine();
           //Adds input to sales revenue when looped (Prompt 6)
           
           monthCounter++;
           
         }
         quarterlySales += annualSales;
         
         qtrCounter++;
       }
       
       System.out.printf("%nTANDEM ENTERPRISES\nSALES REVENUE FOR " + noOfQtrs + " QUARTER(S) OF 2022");
       System.out.printf("%nSALES REP: " + salesRep);
       System.out.printf("%n%nTotal Year-To-Date:  $   %,.0f ", salesRevenue);
       
       percOfTargetCo = (salesRevenue / projectedSales) * 100;
       
       if(noOfQtrs < 4){
         if(percOfTargetCo >= 50){
           System.out.printf("%nKeep up the GOOD work, %s. There is a "
                               + "possible year-end bonus!%n",salesRep);
         }
         else{
           System.out.printf("%nSo far sales are lagging behind projections.");
         }
       }
       
       salesRepCtr++;
     }while(salesRepCtr < noSalesReps);  
     
     percOfTargetCo = (salesRevenue / projectedSales) * 100;
     
     if(percOfTargetCo >= 100){
       System.out.printf("%nIt\'s been a GOOD year so far. There could be a year-end bonus of about 2-5% if we can "
                         + "keep on top of our sales goals. Thank you all and please continue your excellent effort!");
     }
     
   }//END main()
 }//END APPLICATION CLASS RahmanZ003PA1