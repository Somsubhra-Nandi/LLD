class Main{
    public static void main(String[] args){
        DBQueryCounter dbcalculate = DBQueryCounter.getInstance();
        for(int i=0;i<10;i++){
            dbcalculate.addOperations();
        }
        System.out.println(dbcalculate.calculateDBQueries());
    }
}