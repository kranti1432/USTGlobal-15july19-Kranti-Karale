package com.tyssust_ty_springcore.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	public static void main(String[] args) {
String date="15/08/1947";
SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
Date d=new Date();
System.out.println(d.toString());

	}

}
