class DBQueryCounter{
    private int totalOperations=0;
    private DBQueryCounter(){}
    
    private static class Holder{
        private static final DBQueryCounter instance = new DBQueryCounter();
    }

    public static DBQueryCounter getInstance(){
        return Holder.instance;
    }

    public synchronized void addOperations(){
        totalOperations+=1;
    }
    public synchronized int calculateDBQueries(){
        return totalOperations;
    }
}