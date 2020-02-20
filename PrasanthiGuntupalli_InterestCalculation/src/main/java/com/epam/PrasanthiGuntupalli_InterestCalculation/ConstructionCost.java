package com.epam.PrasanthiGuntupalli_InterestCalculation;
import java.util.Scanner;
public class ConstructionCost {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Material Standard:");
        String material_standard=sc.nextLine();
        System.out.println("Enter the area of home:");
        double area=sc.nextDouble();
        System.out.println("Do you want Fully Automated Home:");
        String fullyautomatedhome=sc.next();
        ConstructionCostImplementation constructionCostImplementation=new ConstructionCostImplementation();
        System.out.println("Construction Cost is :"+constructionCostImplementation.calculation(material_standard,area,fullyautomatedhome));
        }
}