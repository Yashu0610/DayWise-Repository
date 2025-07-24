package Class_objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		        Date time = new Date();
		        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		        System.out.println("Login Time: " + sdf.format(time));
		    }
		}


