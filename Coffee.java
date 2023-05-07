/*
 * Class: CMSC203 
 * Instructor: Khandan-Monshi
 * Description: The Coffee class that provides information for the size, extra shot and syrup of the coffee beverage.
 * Due: 5/7/2023
 * Platform/compiler: Eclipse-IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Aiin Khalilzadeh
*/

public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    private final double SHOT_COST = 0.5;
    private final double SYRUP_COST = 0.5;

    public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
        super(name, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    public String toString() {
        String s = getBevName() + ", " + getSize();
        if (extraShot) {
            s += " Extra shot";
        }
        if (extraSyrup) {
            s += " Extra syrup";
        }
        s += ", $" + calcPrice();
        return s;
    }

    public double calcPrice() {
        double price = super.getBasePrice();
        if (super.getSize() == Size.MEDIUM) {
            price += super.getSizePrice();
        } else if (super.getSize() == Size.LARGE) {
            price += 2 * super.getSizePrice();
        }
        if (extraShot) {
            price += SHOT_COST;
        }
        if (extraSyrup) {
            price += SYRUP_COST;
        }
        return price;
    }

    public boolean equals(Coffee c) {
        if (super.equals(c) && extraShot == c.extraShot && extraSyrup == c.extraSyrup) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getExtraShot() {
        return extraShot;
    }

    public boolean getExtraSyrup() {
        return extraSyrup;
    }

    public double getShotCost() {
        return SHOT_COST;
    }

    public double getSyrupCost() {
        return SYRUP_COST;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public void setExtraSyrup(boolean extraSyrup) {
        this.extraSyrup = extraSyrup;
    }
}
