class Main{
    public static void main(String[] args){
        GeneralSoldier original = new GeneralSoldier("Major" , 100 , "Intermediate");

        GeneralSoldier g1 = original.clone();
        GeneralSoldier g2= original.clone();
        GeneralSoldier g3= original.clone();
        GeneralSoldier g4= original;

        g1.display();
        g2.setHeightGroup(190);
        g2.display();
        g3.display();

        System.out.println(original == g1);
        System.out.println(original == g2);
        System.out.println(original == g4);
    }
}