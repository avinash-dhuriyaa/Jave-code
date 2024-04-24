public class LeapYear {
    public static void main(String[] args) {
        int year = 2020; // Change this to the year you want to check

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

// using function
public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2020; // Change this to the year you want to check

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2020; // Change this to the year you want to check

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

// using switch statement
public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        switch (year % 4) {
            case 0:
                switch (year % 100) {
                    case 0:
                        switch (year % 400) {
                            case 0:
                                isLeapYear = true;
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        isLeapYear = true;
                        break;
                }
                break;
            default:
                break;
        }
        return isLeapYear;
    }

    public static void main(String[] args) {
        int year = 2020; // Change this to the year you want to check

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}