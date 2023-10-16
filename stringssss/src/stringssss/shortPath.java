package stringssss;

public class shortPath {
	
	public static float getSortPath(String path) {
		
		int x = 0; 
		int y =0;
		
		for(int i=0; i < path.length();i++) {
			char dir = path.charAt(i);
			// south
			if(dir == 's') {
				y--;
			}
			// north
			else if(dir == 'n') {
				y++;
			}
			// west
			else if (dir == 'w' ){
				x--;
			}
			//east
			else {
				x++;
			}
			
		}
		int x2 = x*x;
		int y2 = y*y;
		
		return (float)Math.sqrt(x2+y2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "wneenesennn";
		System.out.println(getSortPath(str));
	}

}
