
/**
 *
 * @author ignas, zeeshan
 */
public class Balls {

//BALL TYPE, AMOUNT OF BALLS       
    private String colour;         
    private int amount;         
    
    
//CONSTUCTOR FOR COLOR AND IS STRING TYPE, ASSIGNING TO A COLOR.
    public Balls(String type) {
        colour = type;
    }
    
    
//GET A BALL COLOR/PRINT AND RETURN
    public String getColour() {
        return colour;
    }

    
//CHANGE THE AMOUNT OF BALLS   
    public void changeAmount(int num) {
        this.setAmount(num);
    }
    
        
//GET ALL VALUES/PRINT
    public int getAmount() {
        return amount;
    }
    
       
//GIVE A VALUE TO A OBJECT
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
//RETURN A VALUE
    public String toString() {
        return colour;

    }
}
