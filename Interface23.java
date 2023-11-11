
package interface23;

interface Discountable{
    double discountedPrice(double price);
}
class BestForCustomer implements Discountable{
    private double  percentage;
    private double threshold;
    private double discount;
    
    public BestForCustomer(double percentage, double threshold, double discount){
        this.percentage= percentage;
        this.threshold= threshold;
        this.discount= discount;
    }
    
    public double getPercentage(){
        return percentage;
    }
    
    public double getThreshold(){
        return threshold;
    }
    
    public double getDiscount(){
        return discount;
    }
    
    public void setPercentage( double percentage){
        this.percentage= percentage;
    }
    
    public void setThreshold(double threshold){
        this.threshold= threshold;
    }
    
    public void setDiscount(double discount){
        this.discount= discount;
    }
    

    @Override
    public double discountedPrice(double price) {
        if(price>=threshold){
            double thresholdDiscountedPrice = price - discount;
            return thresholdDiscountedPrice - (percentage/100.0)*thresholdDiscountedPrice;
        }
        else{
            return price-(percentage/100.0)*price;
        }
        
    }
}
public class Interface23 {

   
    public static void main(String[] args) {
        
        BestForCustomer obj = new BestForCustomer(10.0, 5000.0, 10.0);
        double originalPrice = 6000;
        
        double discountedPrice= obj.discountedPrice(originalPrice);
        System.out.println("Oridinal price: "+originalPrice+"Tk");
        System.out.println("Discounted Price: "+discountedPrice+"Tk");
       
    }
    
}
