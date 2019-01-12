package com.escoger.searchapi.algo;

import java.util.Arrays;
import java.util.Random;

import com.escoger.searchapi.controller.SearchApiController;

public class ReservoirRandomSearch {

	    // A function to randomly select k items from stream[0..n-1]. 
	    static void selectKItems(String stream[], int n, int k) 
	    { 
	        int i;   // index for elements in stream[] 
	          
	        // reservoir[] is the output array. Initialize it with 
	        // first k elements from stream[] 
	        String reservoir[] = new String[k]; 
	        for (i = 0; i < k; i++) 
	            reservoir[i] = stream[i]; 
	          
	        Random r = new Random(); 
	          
	        // Iterate from the (k+1)th element to nth element 
	        for (; i < n; i++) 
	        { 
	            // Pick a random index from 0 to i. 
	            int j = r.nextInt(i + 1); 
	              
	            // If the randomly  picked index is smaller than k, 
	            // then replace the element present at the index 
	            // with new element from stream 
	            if(j < k) 
	                reservoir[j] = stream[i];             
	        } 
	          
	        System.out.println("Following are k randomly selected items"); 
	        System.out.println(Arrays.toString(reservoir)); 
	    } 
	      
	    //Driver Program to test above method 
	    public static void main(String[] args) { 
	        String stream[] = {"NO","KO","MO","NJ","NG","RK","NO"}; 
	        int n = stream.length; 
	        int k = 5; 
	        selectKItems(stream, n, k); 
	       
	     
	    } 
	} 


