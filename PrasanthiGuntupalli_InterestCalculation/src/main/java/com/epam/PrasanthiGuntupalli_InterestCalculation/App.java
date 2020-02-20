package com.epam.PrasanthiGuntupalli_InterestCalculation;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which one of the following do you want to calculate?");
        System.out.println("1.Construction cost\n2.Interest Calculation");
        int n=sc.nextInt();
        if(n==1){
            ConstructionCost constructionCost=new ConstructionCost();
            constructionCost.main(args);
        }
        if(n==2) {
            InterestCalculation interestCalculation = new InterestCalculation();
            interestCalculation.main(args);
        }
    }
}
