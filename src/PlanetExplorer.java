
// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	private int x, y, x_Pos=0, y_Pos=0;
	private String facing="N";
	private String obstacles;
	public PlanetExplorer(int x, int y, String obstacles){
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
	}
	
	
	public String executeCommand(String command){
		/*char[] commands=command.toCharArray();*/
		if (command=="f") {
			y_Pos++;
		}
		
		if (command=="b") {
			y_Pos--;
		}
		if (command=="r") {
			if (facing=="N") {
				facing="E";
			}
			else if (facing=="E") {
				facing="S";
			}
			else if (facing=="S") {
				facing="W";
			}
			else {
				facing="N";
			}
		}
		if (command=="l") {
			if (facing=="N") {
				facing="W";
			}
			else if (facing=="E") {
				facing="N";
			}
		}
		
		return "("+x_Pos+","+y_Pos+","+facing+")";
	}
}
