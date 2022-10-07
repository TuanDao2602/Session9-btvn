package bai1;

import java.util.Scanner;


public class NextDayCalculator {
//    public String getNextDay(int day, int month, int year) {
//        String returnString = "";

    public static String checkDayMonthYear(int day, int month, int year) {
//        int day;
//        int month;
//        int year;
        int nextDay=0;
        int nextMonth=0;
        int nextYear=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào ngày");
        day=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào tháng");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vòa năm");
        year = Integer.parseInt(scanner.nextLine());
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("tháng có 31 ngày");
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("tháng có 30 ngày");
//            case 2:
                boolean namNhuan = false;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            namNhuan = true;
                            System.out.println("là năm nhuận");
                        } else {
                            System.out.println("không phải năm nhuận");
                        }

                    } else {
                        namNhuan = true;
                        System.out.println("là năm nhuận");

                    }
                } else {
                    namNhuan=false;
                    System.out.println("không phải năm nhuận");
                }
//                if (namNhuan) {
//                    System.out.println("tháng 2 có 29 ngày");
//
//                } else {
//                    System.out.println("tháng 2 có 28 ng");
//                }
                if (namNhuan){
                    switch (month){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                            if (day>=1 && day<31) {
                                nextDay = day + 1;
                            }else if (day==31){
                                nextDay=1;
                                nextMonth=month+1;
                                nextYear=year;

                            }
                            break;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day>1&&day<30){
                            nextDay = day+1;
                                nextMonth=month;
                                nextYear=year;
                            }
                            else if(day==30){
                                nextDay=1;
                                nextMonth=month+1;
                            }
                            break;
                        case 12:
                            if (day>=1 && day<31) {
                                nextDay = day + 1;
                                nextMonth=month;
                                nextYear=year;
                            }else if (day==31){
                                nextDay =1;
                                nextMonth =1;
                                nextYear = year+1;

                            }
                            break;
                        case 2:
                            if (day>=1 &&day <29){
                                nextDay=day+1;
                                nextMonth=month;
                                nextYear=year;
                            }else if (day==29){
                                nextDay=1;
                                nextMonth=month+1;
                                nextYear=year;
                             }
                            break;
                    }
                }else {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                            if (day >= 1 && day < 31) {
                                nextDay = day + 1;
                                nextMonth=month;
                                nextYear=year;
                            } else if (day == 31) {
                                nextDay = 1;
                                nextMonth =month+ 1;
                                nextYear=year;

                            }
                            break;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day > 1 && day < 30) {
                                nextDay = day + 1;
                                nextMonth=month;
                                nextYear=year;
                            } else if (day == 30) {
                                nextDay = 1;
                                nextMonth = month+ 1;
                                nextYear=year;
                            }
                            break;
                        case 12:
                            if (day >= 1 && day < 31) {
                                nextDay = day + 1;
                                nextMonth=month;
                                nextYear=year;
                            } else if (day == 31) {
                                nextDay = 1;
                                nextMonth = 1;
                                nextYear = year + 1;

                            }
                            break;
                        case 2:
                            if (day>=1 &&day <28){
                                nextDay=day+1;
                                nextMonth=month;
                                nextYear=year;
                            }else if (day==28){
                                nextDay=1;
                                nextMonth=month+1;
                                nextYear=year;
                            }
                            break;

                    }
                }
//        }
        System.out.println("ngày tiếp theo là " + nextDay+"/"+nextMonth+"/"+nextYear);
        return null;
    }
}

