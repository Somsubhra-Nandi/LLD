class Main{
    public static void main(String[] args){
        String RiderName="Somsubhra";
        Rider rider= new Rider();
        rider.ConfirmRide(RiderName);

        String CaptainName="Goofy Bitch";
        Captain captain= new Captain();
        captain.ConfirmRide(CaptainName);


        rider.Rating(RiderName,5);
    }
}