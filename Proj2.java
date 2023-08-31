/**
 * <Eli james CIS200>
 * EXTRA CREDIT INCLUDED
 * <Lab B time: thurs @ 1:05 assignment completed
 * 8/31/2023 @ 12:12pm>
 * <COMPLETE description of the project:
 * the program takes input from the user to calculate their 2023 taxes based off of their
 * gross income and the program automatically does all of the calculations. Created
 * constants(4) for the standard tax deductions and created if statements for what
 * would happen if 1-4 was selected and have the calculations and values inside of the if
 * statements.
 **/
import java.util.Scanner;
import java.text.DecimalFormat;
//import java.math.RoundingMode;

public class Proj2 {
    public static void main(String[] args) {

        // constant deductions based on status
        final int SINGLETAXDEDUCTION = 13850;
        final int MARRIEDJOINTFILEWIDOWED = 27700;
        final int HEADOFHOUSEHOLD = 20800;
        final int MARRIEDFILESEPARATE = 13850;

        char under = 'Y';


        while ((under == 'Y' || under == 'y')) {
            //display board print statements
            System.out.println("Choose a filing status:");
            System.out.println("      (1) Single");
            System.out.println("      (2) Head of household");
            System.out.println("      (3) Married filing jointly");
            System.out.println("      (4) Married filing separately");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an option, 1-4: ");
            int option = sc.nextInt();
            if (option >= 1 && option <= 4) {

            }
            else{
                System.out.println("**Invalid value entered. Enter 1-4 only.");
                continue;
            }
            //if user selects 1
            if (option == 1) {
                Scanner ss = new Scanner(System.in);
                System.out.print("Enter your gross income from 2023: $");
                int grossIncome = ss.nextInt();
                int taxableIncome = grossIncome - SINGLETAXDEDUCTION;
                DecimalFormat sa = new DecimalFormat("#,###.##");
                System.out.printf("Your taxable income from 2023 is: $" + sa.format(taxableIncome));
                System.out.println();


                if (taxableIncome >= 578125) {
                    int taxedPercentCutoff37 = taxableIncome - 578125;
                    double taxedMoney1 = taxedPercentCutoff37 * .37;
                    double taxedPercentCutoff35 = 578125 - 231250;
                    double taxedMoney2 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 231250 - 182100;
                    double taxedMoney3 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95375;
                    double taxedMoney4 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney5 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney6 = taxedPercentCutoff12 * .12;
                    double taxedMoney7 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6 + taxedMoney7;
                    DecimalFormat ft = new DecimalFormat("#,###.##");
                    System.out.printf("Taxes owed: $" + ft.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 231250 && taxableIncome <= 578124)) {
                    int taxedPercentCutoff35 = taxableIncome - 231250;
                    double taxedMoney1 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 231250 - 182100;
                    double taxedMoney2 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95375;
                    double taxedMoney3 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney4 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney5 = taxedPercentCutoff12 * .12;
                    double taxedMoney6 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6;
                    DecimalFormat yn = new DecimalFormat("#,###.##");
                    System.out.printf("Taxes owed: $" + yn.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 182100 && taxableIncome <= 231249)) {
                    int taxedPercentCutoff32 = taxableIncome - 182100;
                    double taxedMoney1 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95375;
                    double taxedMoney2 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney3 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney4 = taxedPercentCutoff12 * .12;
                    double taxedMoney5 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5;
                    DecimalFormat sv = new DecimalFormat("#,###.##");
                    System.out.printf("Taxes owed: $" + sv.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 95375 && taxableIncome <= 182099)) {
                    int taxedPercentCutoff24 = taxableIncome - 95375;
                    double taxedMoney1 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney2 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney3 = taxedPercentCutoff12 * .12;
                    double taxedMoney4 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4;
                    DecimalFormat sv = new DecimalFormat("#,###.##");
                    System.out.printf("Taxes owed: $" + sv.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 44725 && taxableIncome <= 95374)) {
                    int taxedPercentCutoff22 = taxableIncome - 44725;
                    double taxedMoney1 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney2 = taxedPercentCutoff12 * .12;
                    double taxedMoney3 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3;
                    DecimalFormat ys = new DecimalFormat("#,###.##");
                    System.out.printf("Taxes Owed: $" + ys.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 11000 && taxableIncome <= 44724)) {
                    int taxedPercentCutoff12 = taxableIncome - 11000;
                    double taxedMoney1 = taxedPercentCutoff12 * .12;
                    double taxedMoney2 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2;
                    DecimalFormat yn = new DecimalFormat("#,###.##");
                    System.out.printf("Taxes owed: $" + yn.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 1 && taxableIncome <= 11000)) {
                    int taxedPercentCutoff10 = taxableIncome - 1;
                    double taxedMoney1 = taxedPercentCutoff10 * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    DecimalFormat bp = new DecimalFormat("#,###.00");
                    System.out.printf("Taxes owed: $" + bp.format(taxesOwed));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((grossIncome < SINGLETAXDEDUCTION)) {
                    double taxedMoney1 = taxableIncome * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    System.out.println("Taxes owed: $0.00");
                }
                
                
                Scanner ym = new Scanner(System.in);
                System.out.print("Do you wish to run the program again? (Y/N):");
                char restartChoice = ym.next().charAt(0);
                if((restartChoice != 'Y' && restartChoice != 'y')){
                    break;
                }
            }


            //if user selects 2
            if (option == 2) {
                Scanner sl = new Scanner(System.in);
                System.out.print("Enter your gross income from 2023 is: $");
                int grossIncome = sl.nextInt();
                int taxableIncome = grossIncome - HEADOFHOUSEHOLD;
                DecimalFormat tr = new DecimalFormat("#,###.##");
                System.out.printf("Your taxable income from 2023: $" + tr.format(taxableIncome));
                System.out.println();

                if (taxableIncome >= 578100) {
                    int taxedPercentCutoff37 = taxableIncome - 578100;
                    double taxedMoney1 = taxedPercentCutoff37 * .37;
                    double taxedPercentCutoff35 = 578100 - 231250;
                    double taxedMoney2 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 231250 - 182100;
                    double taxedMoney3 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95350;
                    double taxedMoney4 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95350 - 59850;
                    double taxedMoney5 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 59850 - 15700;
                    double taxedMoney6 = taxedPercentCutoff12 * .12;
                    double taxedMoney7 = 15700 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6 + taxedMoney7;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 231250 && taxableIncome <= 578099)) {
                    int taxedPercentCutoff35 = taxableIncome - 231250;
                    double taxedMoney1 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 231250 - 182100;
                    double taxedMoney2 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95350;
                    double taxedMoney3 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95350 - 59850;
                    double taxedMoney4 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 59850 - 15700;
                    double taxedMoney5 = taxedPercentCutoff12 * .12;
                    double taxedMoney6 = 15700 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 182100 && taxableIncome <= 231249)) {
                    int taxedPercentCutoff32 = taxableIncome - 182100;
                    double taxedMoney1 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95350;
                    double taxedMoney2 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95350 - 59850;
                    double taxedMoney3 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 59850 - 15700;
                    double taxedMoney4 = taxedPercentCutoff12 * .12;
                    double taxedMoney5 = 15700 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 95350 && taxableIncome <= 182099)) {
                    int taxedPercentCutoff24 = taxableIncome - 95350;
                    double taxedMoney1 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95350 - 59850;
                    double taxedMoney2 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 59850 - 15700;
                    double taxedMoney3 = taxedPercentCutoff12 * .12;
                    double taxedMoney4 = 15700 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 59850 && taxableIncome <= 95349)) {
                    int taxedPercentCutoff22 = taxableIncome - 59850;
                    double taxedMoney1 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 59850 - 15700;
                    double taxedMoney2 = taxedPercentCutoff12 * .12;
                    double taxedMoney3 = 15700 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 15700 && taxableIncome <= 59849)) {
                    int taxedPercentCutoff12 = taxableIncome - 15700;
                    double taxedMoney1 = taxedPercentCutoff12 * .12;
                    double taxedMoney2 = 15700 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 1 && taxableIncome <= 15699)) {
                    int taxedPercentCutoff10 = taxableIncome - 1;
                    double taxedMoney1 = taxedPercentCutoff10 * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((grossIncome < HEADOFHOUSEHOLD)) {
                    double taxedMoney1 = taxableIncome * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    System.out.println("Taxes owed: $0.00");
                }
                
                
                Scanner ym = new Scanner(System.in);
                System.out.print("Do you wish to run the program again? (Y/N):");
                char restartChoice = ym.next().charAt(0);
                if((restartChoice != 'Y' && restartChoice != 'y')){
                    break;
                }
            }


            //if user selects 3
            if (option == 3) {
                Scanner sr = new Scanner(System.in);
                System.out.print("Enter your gross income from 2023 is: $");
                int grossIncome = sr.nextInt();
                int taxableIncome = grossIncome - MARRIEDJOINTFILEWIDOWED;
                DecimalFormat tr = new DecimalFormat("#,###.##");
                System.out.printf("Your taxable income from 2023: $" + tr.format(taxableIncome));
                System.out.println();

                if (taxableIncome >= 693750) {
                    int taxedPercentCutoff37 = taxableIncome - 693750;
                    double taxedMoney1 = taxedPercentCutoff37 * .37;
                    double taxedPercentCutoff35 = 693750 - 462500;
                    double taxedMoney2 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 462500 - 364200;
                    double taxedMoney3 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 364200 - 19750;
                    double taxedMoney4 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 190750 - 89450;
                    double taxedMoney5 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 89450 - 22000;
                    double taxedMoney6 = taxedPercentCutoff12 * .12;
                    double taxedMoney7 = 22000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6 + taxedMoney7;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 462500 && taxableIncome <= 693749)) {
                    int taxedPercentCutoff35 = taxableIncome - 462500;
                    double taxedMoney1 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 462500 - 364200;
                    double taxedMoney2 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 364200 - 190750;
                    double taxedMoney3 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 190750 - 89450;
                    double taxedMoney4 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 89450 - 22000;
                    double taxedMoney5 = taxedPercentCutoff12 * .12;
                    double taxedMoney6 = 22000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 364200 && taxableIncome <= 462499)) {
                    int taxedPercentCutoff32 = taxableIncome - 364200;
                    double taxedMoney1 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 364200 - 190750;
                    double taxedMoney2 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 190750 - 89450;
                    double taxedMoney3 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 89450 - 22000;
                    double taxedMoney4 = taxedPercentCutoff12 * .12;
                    double taxedMoney5 = 22000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 190750 && taxableIncome <= 364199)) {
                    int taxedPercentCutoff24 = taxableIncome - 190750;
                    double taxedMoney1 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 190750 - 89450;
                    double taxedMoney2 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 89450 - 22000;
                    double taxedMoney3 = taxedPercentCutoff12 * .12;
                    double taxedMoney4 = 22000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 89450 && taxableIncome <= 190749)) {
                    int taxedPercentCutoff22 = taxableIncome - 89450;
                    double taxedMoney1 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 89450 - 22000;
                    double taxedMoney2 = taxedPercentCutoff12 * .12;
                    double taxedMoney3 = 22000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 22000 && taxableIncome <= 89449)) {
                    int taxedPercentCutoff12 = taxableIncome - 22000;
                    double taxedMoney1 = taxedPercentCutoff12 * .12;
                    double taxedMoney2 = 22000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 1 && taxableIncome <= 21999)) {
                    int taxedPercentCutoff10 = taxableIncome - 1;
                    double taxedMoney1 = taxedPercentCutoff10 * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");

                }


                if ((grossIncome < MARRIEDJOINTFILEWIDOWED)) {
                    double taxedMoney1 = taxableIncome * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    System.out.println("Taxes owed: $0.00");
                }
                
                
                Scanner ym = new Scanner(System.in);
                System.out.print("Do you wish to run the program again? (Y/N):");
                char restartChoice = ym.next().charAt(0);
                if((restartChoice != 'Y' && restartChoice != 'y')){
                    break;
                }
            }


            if (option == 4) {
                Scanner sb = new Scanner(System.in);
                System.out.print("Enter your gross income from 2023 is: $");
                int grossIncome = sb.nextInt();
                int taxableIncome = grossIncome - MARRIEDFILESEPARATE;
                DecimalFormat sa = new DecimalFormat("#,###.##");
                System.out.printf("Your taxable income from 2023: $" + sa.format(taxableIncome));
                System.out.println();


                if (taxableIncome >= 578125) {
                    int taxedPercentCutoff37 = taxableIncome - 578125;
                    double taxedMoney1 = taxedPercentCutoff37 * .37;
                    double taxedPercentCutoff35 = 578125 - 231250;
                    double taxedMoney2 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 231250 - 182100;
                    double taxedMoney3 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95375;
                    double taxedMoney4 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney5 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney6 = taxedPercentCutoff12 * .12;
                    double taxedMoney7 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6 + taxedMoney7;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 231250 && taxableIncome <= 578124)) {
                    int taxedPercentCutoff35 = taxableIncome - 231250;
                    double taxedMoney1 = taxedPercentCutoff35 * .35;
                    double taxedPercentCutoff32 = 231250 - 182100;
                    double taxedMoney2 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95375;
                    double taxedMoney3 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney4 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney5 = taxedPercentCutoff12 * .12;
                    double taxedMoney6 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5 + taxedMoney6;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 182100 && taxableIncome <= 231249)) {
                    int taxedPercentCutoff32 = taxableIncome - 182100;
                    double taxedMoney1 = taxedPercentCutoff32 * .32;
                    double taxedPercentCutoff24 = 182100 - 95375;
                    double taxedMoney2 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney3 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney4 = taxedPercentCutoff12 * .12;
                    double taxedMoney5 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4 + taxedMoney5;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 95375 && taxableIncome <= 182099)) {
                    int taxedPercentCutoff24 = taxableIncome - 95375;
                    double taxedMoney1 = taxedPercentCutoff24 * .24;
                    double taxedPercentCutoff22 = 95375 - 44725;
                    double taxedMoney2 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney3 = taxedPercentCutoff12 * .12;
                    double taxedMoney4 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3 + taxedMoney4;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 44725 && taxableIncome <= 95374)) {
                    int taxedPercentCutoff22 = taxableIncome - 44725;
                    double taxedMoney1 = taxedPercentCutoff22 * .22;
                    double taxedPercentCutoff12 = 44725 - 11000;
                    double taxedMoney2 = taxedPercentCutoff12 * .12;
                    double taxedMoney3 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2 + taxedMoney3;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 11000 && taxableIncome <= 44724)) {
                    int taxedPercentCutoff12 = taxableIncome - 11000;
                    double taxedMoney1 = taxedPercentCutoff12 * .12;
                    double taxedMoney2 = 11000 * .10;
                    double taxesOwed = taxedMoney1 + taxedMoney2;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if ((taxableIncome >= 1 && taxableIncome <= 11000)) {
                    int taxedPercentCutoff10 = taxableIncome - 1;
                    double taxedMoney1 = taxedPercentCutoff10 * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    int taxesOwed1 = (int) Math.round(taxesOwed);
                    DecimalFormat tp = new DecimalFormat("#,###");
                    System.out.printf("Taxes owed: $" + tp.format(taxesOwed1));
                    System.out.println();
                    double effectiveTax = taxesOwed / taxableIncome * 100;
                    DecimalFormat tc = new DecimalFormat("#,###.00");
                    System.out.println("Your Effective Tax Rate is " + tc.format(effectiveTax) + "%");
                }


                if (grossIncome < MARRIEDFILESEPARATE) {
                    double taxedMoney1 = taxableIncome * .10;
                    double taxesOwed = taxedMoney1 + 0.00;
                    System.out.println("Taxes owed: $0.00");
                }
                
                
                Scanner ym = new Scanner(System.in);
                System.out.print("Do you wish to run the program again? (Y/N):");
                char restartChoice = ym.next().charAt(0);
                
                
                if((restartChoice != 'Y' && restartChoice != 'y')){
                    break;
                }
            }
        }
    }
}