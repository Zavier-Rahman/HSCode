public class Car
{
    private int milesDriven;
    private int changeNeeded;
    public Car(int md, int cn){
        milesDriven = md;
        changeNeeded = cn;
    }
    public boolean timeForOilChange(){
        if(milesDriven >= changeNeeded){
            milesDriven = 0;
            return true;
        }
        else{
            return false;
        }
    }
    public void addMiles(int a){
        milesDriven += a;
    }
}
