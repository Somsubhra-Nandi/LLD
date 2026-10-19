interface Soldier{
    Soldier clone();
}

class GeneralSoldier implements Soldier{
    private String position;
    private int Health;
    private String HeightGroup;

    GeneralSoldier(String position,int Health,String HeightGroup){
        this.position=position;
        this.Health=Health;
        this.HeightGroup=HeightGroup;
    }

    @Override
    public GeneralSoldier clone(){
        return new GeneralSoldier(position,Health,HeightGroup);
    }

    public void setHeightGroup(int Height){
        if(Height>185){
            this.HeightGroup="Tall";
        }else if(Height>=170){
            this.HeightGroup="Intermediate";
        }else{
            this.HeightGroup="Short";
        }
    }

    public void display() {
        System.out.println(position + " " + Health + " " + HeightGroup);
    }
}