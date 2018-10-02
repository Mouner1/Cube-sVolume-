/*
 Mouner Dabjan
 October 1 2018 
 Calculate the volume of cube using numbers entered by the user 
 */

package volumeofcube;
import java.util.Scanner;

/**
 *
 * @author modab5310
 */
public class VolumeOfCube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keybaord = new Scanner(System.in); 
        
        // variables needed to determine the volume 
        double side; 
        double volume; 
        
        
        // input 
        System.out.println("Please enter the side of the cube:");
        side = keybaord.nextDouble(); 
        
        //algorith for calculating the volume 
        
        volume= side * side * side; 
        
        // output
        
        System.out.println("The volume of the cube is" + volume + "."); 
    }
    
}
