package com.corejava.concepts.basic;

public class GenericInput {
    /** This class is to demonstrate the Generic call when two classes extend the same class and we have to differentiate between the two classes.
     * Output-
     * In update method
     * Is studentRecord class name :DayScholar
     * In update method
     * Is studentRecord class name :Hostel
     */
   public static <E> void update(E studentRecord){
       System.out.println("In update method");
       System.out.println("Is studentRecord class name :"+studentRecord.getClass().getSimpleName());
   }

    public static void main(String[] args) {
       DayScholar dayScholar= new DayScholar(1,"anu","GandhiNagar");
        GenericInput.update(dayScholar);
        Hostel hostel= new Hostel(2,"Megh",5);
        GenericInput.update(hostel);
    }
}
