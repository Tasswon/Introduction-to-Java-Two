/**Name: Joseph Tassone
 * Description: Writes values (array, date, double) to a dat file. 
 */

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class StoreObjectsAndArray {
    public static void main(String[] args) throws Exception {

        int[] numbers = {1, 2, 3, 4, 5};
        
        try (ObjectOutputStream out = new ObjectOutputStream
        		(new FileOutputStream("Exercise17_05.dat"))) {
        	
            out.writeObject(numbers);
            out.writeObject(new Date());
            out.writeDouble(5.5);
        }
    }
}