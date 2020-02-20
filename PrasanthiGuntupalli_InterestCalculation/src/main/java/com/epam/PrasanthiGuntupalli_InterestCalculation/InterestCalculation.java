package com.epam.PrasanthiGuntupalli_InterestCalculation;
import java.util.Scanner;
public class InterestCalculation {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        float principleAmount=sc.nextFloat();
        System.out.println("Enter rate of Interset:");
        float rateOfInterest=sc.nextFloat();
        System.out.println("Enter TimePeriod:");
        float timePeriod=sc.nextFloat();
        InterestImplementation si=new InterestImplementation();
        System.out.println("Simple Interest is :"+(int) si.calculateSimpleInterest(principleAmount,rateOfInterest,timePeriod));
        System.out.println("Compound Interest is :"+(int)si.calculateCompoundInterest(principleAmount, rateOfInterest, timePeriod));
    }
}
