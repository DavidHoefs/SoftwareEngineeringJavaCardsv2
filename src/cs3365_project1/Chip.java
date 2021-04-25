/**
*CS 3365 001
*Cole Trammell
*
 */
package cs3365_project1;



/**
 *
 * @author Cole Trammell
 * Creates a chip object with attribute value
 **/
public class Chip {

    /**
     *The value of the chip
     */
    private int value;


    /**
     *class constructor
     * @param value: The value of the chip
    **/
    public Chip(int value){
        this.value = value;
    }//end of Card constructor

   
    /**
     *
     * @return value
     */
    public int getValue(){
        return value;
    }


}