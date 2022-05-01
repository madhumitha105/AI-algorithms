package com.sanfoundry.hardgraph;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
public class BranchandBound
{
    static int[][]                                                                                     // weights
    static String[]                                
  static int             n;                              
                                                           
    static ArrayList<Tour> soln    = new ArrayList<Tour>();
    static int bestTour;                                                                                   
    static int blocked;                       
    static boolean DEBUG   = true;                                                                                                                                     
    static boolean VERBOSE = true;                                                          
    @SuppressWarnings("rawtypes")
    private static class Tour implements Comparable
    {
        int[] soln;
        int index;        
        int dist;
        static int nTours = 0;
        static boolean DFS = true;
        static boolean DBG = true;
        private Tour(int[] vect, int index, int[][] wt)
        {
            dist = 0;
            for (int k = 1; k < index; k++)
                dist += wt[vect[k - 1]][vect[k]];
            if (index == n)
                dist += wt[vect[n - 1]][vect[0]];
            soln = new int[n]; 
            System.arraycopy(vect, 0, soln, 0, n);
            this.index = index; 
            nTours++; 
            if (DBG)
                System.out.printf("Idx %d: %s\n", index, toString());
        }
public int compareTo(Object o)
        {
            Tour rt = (Tour) o;
            int c1 = rt.index - this.index, c2 = this.dist - rt.dist;
            if (DFS)
                return c1 == 0 ? c2 : c1;
            else
                return c2;
        }
