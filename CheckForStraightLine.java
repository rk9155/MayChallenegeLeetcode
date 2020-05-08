package Week2;

public class CheckForStraightLine {

	public static void main(String[] args) {
		int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
       System.out.println(checkStraightLine(coordinates));
	}

	private static boolean checkStraightLine(int[][] coordinates) {
		if (coordinates.length < 2) return false;
        if (coordinates.length == 2) return true;
        
        int Y = coordinates[1][1] - coordinates[0][1],
            X = coordinates[1][0] - coordinates[0][0];
        
        for (int i = 2; i < coordinates.length; i++) {
            int dy = coordinates[i][1] - coordinates[i - 1][1];
            int dx = coordinates[i][0] - coordinates[i - 1][0];
            
            if (Y * dx != X * dy) {
                return false;
            }
        }
        
        return true;
	}

}
