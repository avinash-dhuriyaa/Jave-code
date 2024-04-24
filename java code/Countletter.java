class Countletter {
    public static void main(String[] args) {

        String input = " RoHiT";
        int capital = 0;
        int small = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                capital++;
            }

            else if (Character.isLowerCase(c)) {
                small++;
            }
        }

        System.out.println("total no of capital " + capital);
        System.out.println("total no of small " + small);

    }

}