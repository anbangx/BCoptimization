/**************************************************************************
*                                                                         *
*             Java Grande Forum Benchmark Suite - Version 2.0             *
*                                                                         *
*                            produced by                                  *
*                                                                         *
*                  Java Grande Benchmarking Project                       *
*                                                                         *
*                                at                                       *
*                                                                         *
*                Edinburgh Parallel Computing Centre                      *
*                                                                         * 
*                email: epcc-javagrande@epcc.ed.ac.uk                     *
*                                                                         *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 1999.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/


import heapsort.*; 
import jgfutil.*; 

public class JGFHeapSortBenchSizeC{ 

  public static void main(String argv[]){ 
    final long startTime = System.currentTimeMillis();
    JGFInstrumentor.printHeader(2,2); 

    JGFHeapSortBench hb = new JGFHeapSortBench(); 
    hb.JGFrun(2);
    
    final long endTime = System.currentTimeMillis();

    System.out.println("Total execution time: " + (endTime - startTime));
  }
}
