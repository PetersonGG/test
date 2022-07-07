package mb.factory.simple;

public class CarFactory {
    public static Car getCar(String car){
        if(car=="五菱"){
            return new WuLin();
        }else if(car=="宝马"){
            return new BaoMa();
        }else{
            return null ;
        }
    }
}
