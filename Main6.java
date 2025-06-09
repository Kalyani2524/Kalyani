import java.util.Arrays;
public class Main6{
public static void AddEdge(int[][] mat,int i,int j){
mat[i][j]=1;
mat[j][i]=1;
}
public static void displayMatrix(int[][] mat){
for(int[] row:mat){
for(int val:row){
System.out.print(val+"");
}
System.out.println();
}
}
public static void main(String[] args){
int v=4;
int[][]mat=new int[v][v];
AddEdge(mat,0,1);
AddEdge(mat,0,2);
AddEdge(mat,1,2);
AddEdge(mat,2,3);
/*int[][]mat={{0,1,0,0},
            {1,0,1,0},
	        {0,1,0,1},
            {0,0,1,0}};*/
System.out.println("Adjacency Matrix Representation");
displayMatrix(mat);
}
}


