/**
 * This class contains code for creating Dragon objects. It contains basic 
 * functions so that new dragons can be created and saved to a file
 */
package harbordrake;
import java.util.Random;

/**
 *
 * @author Elizabeth Farr
 */
public class Dragon {
    
    private String name;
    private final int ID;
    private int age;
    private final String gender;
    private String breed;
    private int level;
    
    Random rand = new Random();

    //Default contrusctor
    public Dragon() {
        //Placeholder name
        name = "Unnamed";
        //Placeholder ID
        //TODO: make function to create unique dragon ID
        ID = 0;
        //Newborn age
        age = 0;
        //RNG generates either a 1 or a 2
        int gentmp = rand.nextInt(2) + 1;
        //If random int is 1, gender is set to male. Otherwise, gender is female
        if(gentmp == 1){
            gender = "Male";
        } else{
            gender = "Female";
        }
        //Placeholder breed
        breed = "Pifflewhiffle";
        //Initial level
        level = 0;
    }
    
    
}
