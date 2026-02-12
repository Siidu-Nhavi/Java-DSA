import java.util.*;
public class BurstBallons{
	public static void main(String args[]){
	
	int [][] points = {{10,16},{2,8},{1,6},{7,12}};
	
	//base case
	if(points.length == 0){ return;}
	
	//sort the array based on end in ascending order 
	Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
	//initialize the arrow and end 
	int arrow = 1;
	int end = points[0][1];
	
	//traverse on entire array
	for(int i=1;i<points.length;i++){
		if(points[i][0] > end){
			arrow++;
			end = points[i][1];
		}
	
	}
	
	return new int [0][arrow]; 
	
	}

}