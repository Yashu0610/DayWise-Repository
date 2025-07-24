package Class_objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		        Date date = new Date();
		        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		        System.out.println("Current Date: " + sdf.format(date));
		    }
		}



