/**
 * 
 */
package madPodRacing;

/**
 * @author Phoenix
 *
 */
public class Player {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(true){
			int x = in.nextInt();
			int y = in.nextInt();
			int checkx = in.nextInt();
			int checky = in.nextInt();
			int checkdist = in.nextInt();
			int checkangle = in.nextInt();
			int ox = in.nextInt();
			int oy = in.nextInt();
			
			int thrust = 0;
			
			System.out.printf("%d %d %d\n", x, y, thrust);
}
