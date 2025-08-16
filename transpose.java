public class transpose {
    public static void main(String[] args){
        int[][] matrix = {
            {1 , 2 , 3},
            {4 , 5 , 7},
        };
        int rows = matrix.length;
        int coloumn = matrix[0].length;

        int[][] transpose = new int[rows][coloumn];

        for(int i=0;i<rows;i++){
            for(int j=0;j<coloumn;j++){
                transpose[j][i] = matrix[i][j];

            }
        }
        System.out.println("transpose of the matrix is");
        for(int[] rows : transpose){
            for( val : row){
                System.out.println(val);
            }
        }

    }
    
}
