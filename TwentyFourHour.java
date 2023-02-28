public class TwentyFourHour {
    public static void main(String[] args) {
        String s = "12:05:45AM";
        String getAmPm = s.substring(s.length() - 2, s.length());
        String removeAmPm = s.substring(0, s.length() - 2);

        int getIndexOfFirtstCollon = s.indexOf(':');

        int hour = Integer.parseInt(s.substring(0, getIndexOfFirtstCollon));

        String hourIn24 = "";

        if (getAmPm.equalsIgnoreCase("AM")) {
            if (hour == 12)
                hourIn24 = "00";
            else if (hour < 10)
                hourIn24 = "0" + hour;
            else
                hourIn24 = Integer.toString(hour);
        } else {
            if (hour < 12) {
                hourIn24 = Integer.toString(hour + 12);
            } else {
                hourIn24 = Integer.toString(hour);
            }
        }

        String removeHour = removeAmPm.substring(getIndexOfFirtstCollon, removeAmPm.length());

        System.out.println(getAmPm.equalsIgnoreCase("AM"));
        System.out.println(hour);
        System.out.println(hourIn24 + removeHour);
    }
}
