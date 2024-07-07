package com.example.demo;

public class HotelReservationSystem {

    private static final String url="jdbc:mysql://localhost:3306/hotel_db";
    private static final String username="root";
   private static final String password="manish.@9";


    public static void main(String[] args) throws ClassNotFoundException{

     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
     }catch (ClassNotFoundException e){
System.out.println(e.getMessage());
     }



    }
}
