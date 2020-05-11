package Week2;

public class FloodFillAlgorithm {

	public static void main(String[] args) {
		int[][] image = 
				{{1,1,1},
				 {1,1,0},
				 {1,0,1}};
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		int[][] ans = floodFill(image,sr,sc,newColor);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}	
			System.out.println();
		}
		
	}
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
        
    }
     public static void fill(int[][] image, int sr, int sc, int color,int newColor) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != color ){
        return;
        }
         image[sr][sc] = newColor;
         fill(image,sr-1,sc,color,newColor);
         fill(image,sr+1,sc,color,newColor);
         fill(image,sr,sc-1,color,newColor);
         fill(image,sr,sc+1,color,newColor);
    }

}
