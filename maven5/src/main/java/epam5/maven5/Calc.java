package epam5.maven5;

public class Calc {
	private final  double standardMaterial =1200;
    private final  double mediumMaterial =1500;
    private final  double highMaterial = 1800;
    private final  double highMaterialAndAutomation = 2500;

    public double getInterest(double area ,String material , boolean automation) throws InvalidMaterial {
        double getCost = check(material,automation);
        return area*getCost;
    }
    public double check(String material , boolean automation) throws InvalidMaterial
    {
        if(material.toLowerCase().equals(MaterialType.std.toString().toLowerCase()))
        {
            return standardMaterial;
        }
        else if(material.toLowerCase().equals(MaterialType.mediumStd.toString().toLowerCase()))
        {
            return mediumMaterial;
        }
        else
        {
            boolean materials = material.toLowerCase().equals(MaterialType.highStd.toString().toLowerCase());
            {
                if(materials && !automation)
                {
                    return  highMaterial;
                }
                else if(materials && automation)
                {
                    return highMaterialAndAutomation;
                }
            }
            throw new InvalidMaterial();
        }
    }

}
