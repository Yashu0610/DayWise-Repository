package Java_Day_2_Assignment;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDays {

	public static void main(String[] args) {
		Day today = Day.SUNDAY;
        switch (today) {
            case MONDAY: System.out.println("Start of the work week!"); break;
            case FRIDAY: System.out.println("Almost weekend!"); break;
            case SUNDAY: System.out.println("Rest day!"); break;
            default: System.out.println("Midweek day");
        }

	}

}
