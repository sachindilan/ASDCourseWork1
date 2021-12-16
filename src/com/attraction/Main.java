package com.attraction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("hhmm");
        Date openDate = null;
        Date closeDate = null;
        Date inputDate = null;

        String dateopentime;
        String dateclosetime;

        //    -----  Add Master Data - Start ---

        // Theater

        Ticket theaterTicketPrice1 = new Ticket(10.00);

        Theater theaterObj1 = new Theater(theaterTicketPrice1);

        theaterObj1.setName("Savoy Wellawaththa");

        dateopentime = "0830";
        dateclosetime = "1930";
        openDate= df.parse(dateopentime);
        closeDate= df.parse(dateclosetime);

        theaterObj1.setOpenTime(openDate);
        theaterObj1.setCloseTime(closeDate);

        Ticket theaterTicketPrice2 = new Ticket(2.00);

        Theater theaterObj2 = new Theater(theaterTicketPrice2);

        dateopentime = "1930";
        dateclosetime = "2330";
        openDate= df.parse(dateopentime);
        closeDate= df.parse(dateclosetime);

        theaterObj2.setName("Reality Plaza");
        theaterObj2.setOpenTime(openDate);
        theaterObj2.setCloseTime(closeDate);

        // Park

        Park parkObj1 = new Park();

        dateopentime = "1000";
        dateclosetime = "1930";
        openDate= df.parse(dateopentime);
        closeDate= df.parse(dateclosetime);

        parkObj1.setName("Viharamahadevi park");
        parkObj1.setOpenTime(openDate);
        parkObj1.setCloseTime(closeDate);

        dateopentime = "0830";
        dateclosetime = "1530";
        openDate= df.parse(dateopentime);
        closeDate= df.parse(dateclosetime);

        Park parkObj2 = new Park();
        parkObj2.setName("Gangarama Park");
        parkObj2.setOpenTime(openDate);
        parkObj2.setCloseTime(closeDate);

        // Museum

        Ticket museumTicketPrice1 = new Ticket(4.00);

        Museum museumObj1 = new Museum(museumTicketPrice1);

        dateopentime = "0830";
        dateclosetime = "2030";
        openDate= df.parse(dateopentime);
        closeDate= df.parse(dateclosetime);

        museumObj1.setName("National Museum of Colombo");
        museumObj1.setOpenTime(openDate);
        museumObj1.setCloseTime(closeDate);

        Museum museumObj2 = new Museum();

        dateopentime = "1030";
        dateclosetime = "1930";
        openDate= df.parse(dateopentime);
        closeDate= df.parse(dateclosetime);

        museumObj2.setName("Dutch Museum");
        museumObj2.setOpenTime(openDate);
        museumObj2.setCloseTime(closeDate);

        //    -----  Add Master Data - End ---

        // Adding all the data to Array List

        ArrayList<Attraction> attractionslist = new ArrayList<Attraction>();
        attractionslist.add(theaterObj1);
        attractionslist.add(theaterObj2);
        attractionslist.add(parkObj1);
        attractionslist.add(parkObj2);
        attractionslist.add(museumObj1);
        attractionslist.add(museumObj2);


        Double inputTicketPrice = 5.00;
        String inputValDate = "1900";

        inputDate= df.parse(inputValDate);

        System.out.println("--------------------------------------------------------");
        System.out.println("These Attractions are less than " + inputTicketPrice);
        System.out.println("--------------------------------------------------------");

        for (Attraction attraction : attractionslist) {

            if(attraction.getTicketing() != null) {

                if(attraction.getTicketing().getPrice() < inputTicketPrice) {

                    if(attraction instanceof Museum) {
                        System.out.println(((Museum) attraction).getName());
                    } else if (attraction instanceof Theater) {
                        System.out.println(((Theater) attraction).getName());
                    }  else {
                        System.out.println(((Park) attraction).getName());
                    }

                }
            }

        }

        System.out.println("--------------------------------------------------------");
        System.out.println("These Attractions open after " + inputValDate);
        System.out.println("--------------------------------------------------------");

        for (Attraction attraction : attractionslist) {

            if(attraction instanceof Museum) {

                if(((Museum) attraction).getOpenTime().after(inputDate)) {
                    System.out.println(((Museum) attraction).getName());
                }


            } else if (attraction instanceof Theater) {

                if(((Theater) attraction).getOpenTime().after(inputDate)) {
                    System.out.println(((Theater) attraction).getName());
                }


            }  else {

                if(((Park) attraction).getOpenTime().after(inputDate)) {
                    System.out.println(((Park) attraction).getName());
                }


            }


        }

    }
}
