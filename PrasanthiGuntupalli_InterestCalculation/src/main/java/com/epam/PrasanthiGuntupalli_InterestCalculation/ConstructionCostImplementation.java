package com.epam.PrasanthiGuntupalli_InterestCalculation;

public class ConstructionCostImplementation {
    public int calculation(String material_standard,double area, String fullyautomatedhome)
    {
        if (material_standard.equals("high standard materials") && fullyautomatedhome.equals("Yes"))
        {
            return (int) (2500 * area);
        }
        else if (material_standard.equals("standard materials"))
        {
            return (int) (1200 * area);
        }
        else if (material_standard.equals("above standard materials"))
        {
            return (int) (1500 * area);
        }
        else if (material_standard.equals("high standard materials"))
        {
            return (int) (1800 * area);
        }
        return 0;
    }
}
