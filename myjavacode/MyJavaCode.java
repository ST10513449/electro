/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myjavacode;

/**
 *
 * @author Student
 */
public class MyJavaCode {

    public static void main(String[] args) {
       String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};
       String[] console = {"PS5","XBOX","SWITCH"};
       int[][] sales = {
           {1000, 2000, 3000},
           {2000, 3000, 4000},
           {1500, 1100, 1200}
              
       };
       int totalCapeTown = sales[0][0] + sales[0][1] + sales[0][2]; 
       int totalPortElizabeth = sales[1][0] + sales[1][1] + sales[1][2];
       int totalPretoria =  sales[2][0] +  sales[2][1] + sales[2][2]; 
       
       String topCity;
       if (totalCapeTown>totalPortElizabeth){
           topCity = cities[0];
       if (totalCapeTown>totalPretoria){
           topCity = cities[2];
       if (totalPretoria>totalPortElizabeth){
           topCity = cities[1];    
       
       }else{
           topCity = cities[1];
       }
       
       
       System.out.println("------------------------------------------------");
       System.out.println("GAMING CONSOLE REPORT");
       System.out.println("------------------------------------------------");
       System.out.println("              PS5        XBOX         SWITCH");
       System.out.println(cities[0] +"   " +"sales[0][0]"+"sales[0][1]"+"sales[0][2]");
       System.out.println(cities[1] +"   " +"sales[1][0]"+"sales[1][1]"+"sales[1][2]" );
       System.out.println(cities[3] +"   " +"sales[2][0]"+"sales[2][1]"+"sales[2][2]");
       System.out.println("");
       System.out.println("-------------------------------------------------");
       System.out.println("COSOLE SALES FOR EACH CITY");
       System.out.println("-----------------------------------------------");
       System.out.println("Total city sales for" + cities[0]+"  " totalCapeTown);
       System.out.println("Total city sales for" + cities[1]+"  " totalPortElizabeth);
       System.out.println("Total city sales for" + cities[2]+"  " totalPretoria);
       System.out.println(" ");
       System.out.println("City with the most sales : ");
       
       
               
       
       }
    }
    
}
