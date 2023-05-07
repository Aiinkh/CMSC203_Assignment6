/*
 * Class: CMSC203 
 * Instructor: Khandan-Monshi
 * Description: The smoothie class that provides the size, numOfFruits and addprotein to the beverage smoothie.
 * Due: 5/7/2023
 * Platform/compiler: Eclipse-IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Aiin Khalilzadeh
*/

class Smoothie extends Beverage{
    private int numOfFruits;
    private boolean addProtein;
    private final double FRUIT_COST = .5;
    private final double PROTEIN_COST = 1.5;
    
    /** Constructors */
    public Smoothie(String n, Size s, int nof, boolean ap) {
            super(n, Type.SMOOTHIE, s);
            numOfFruits = nof;
            addProtein = ap;
    }
    
    /** Utility */
    public String toString() {
            String s = getBevName() +", " +getSize() +" " +numOfFruits +" Fruits";
            
            if (addProtein) {
                    s += " Protein powder";
            }
            
            s += ", $" +calcPrice();
            
            return s;
    }
    public boolean equals(Smoothie s) {
            if (super.equals(s) && numOfFruits==s.getNumOfFruits() && addProtein==s.getAddProtien()) {
                    return true;
            }
            else {
                    return false;
            }
    }
    public double calcPrice() {
            double price = super.getBasePrice();
            
            if (super.getSize() == Size.MEDIUM) {
                    price += super.getSizePrice();
            }
            else if (super.getSize() == Size.LARGE) {
                    price += 2 * super.getSizePrice();
            }
            
            price += numOfFruits * FRUIT_COST;
            if (addProtein) {
                    price += PROTEIN_COST;
            }
            
            return price;
    }
    
    /** Accessors */
    public int getNumOfFruits() {
            return numOfFruits;
    }
    public boolean getAddProtien() {
            return addProtein;
    }
    public double getFruitCost() {
            return FRUIT_COST;
    }
    public double getProteinCost() {
            return PROTEIN_COST;
    }
    
    /** Mutators */
    public void setNumOfFruits(int nof) {
            numOfFruits = nof;
    }
    public void setProteinPowder(boolean ap) {
            addProtein = ap;
    }
}