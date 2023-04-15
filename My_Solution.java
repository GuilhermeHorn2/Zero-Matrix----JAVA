package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		int[][] m = {{0,2,3},{4,5,6},{7,8,0},{1,2,3}};
		
		int[][] zero = zero_matrix(m);
		
		for(int i = 0;i < zero.length;i++) {
			for(int j = 0;j < zero[i].length;j++) {
				System.out.print(zero[i][j]);
			}
			System.out.println();
		}
		
	}
		
	
	
	
	private static int[][] zero_matrix(int[][]m){
		//
		//I will use a map because of the lookup time O(1)
		HashMap<Integer,Integer> h = new HashMap<>();//row --> col
        		
		
		for(int i = 0;i < m.length;i++) {
			for(int j = 0;j < m[i].length;j++){
				if(m[i][j] == 0){
					h.put(i,j);
				}
			}
		}
		
		//System.out.println(h);
		
		for(int i = 0;i < m.length;i++) {
			for(int j = 0;j < m[i].length;j++){
				if(h.containsKey(i)) {
					m[i][j] = 0;
				}
				if(h.containsValue(j)) {
					m[i][j] = 0;
				}
			}
		}
		
		return m;
		
	}
	
	
    
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

