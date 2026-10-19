interface RiderInterface{
    void ConfirmRide(String name);
    void CancelRide(String name,String cause);
    void Rating(String name,int stars);
}


class Rider implements RiderInterface{
    @Override
    public void ConfirmRide(String name){
        System.out.println(name + " booked the ride.");
    }

    @Override
    public void CancelRide(String name, String cause){
        System.out.println(name + " cancelled the ride. The reason is= "+ cause);
    }

    @Override
    public void Rating(String name,int stars){
        System.out.println(name + " rated the captain "+ stars +" stars.");
    }
}

interface CaptainInterface{
    void ConfirmRide(String name);
    void CancelRide(String name,String cause);
}

class Captain implements CaptainInterface{
    @Override
    public void ConfirmRide(String name){
        System.out.println(name + " accepted the ride.");
    }

    @Override
    public void CancelRide(String name, String cause){
        System.out.println(name + " cancelled the ride. The reason is= "+ cause);
    }
}