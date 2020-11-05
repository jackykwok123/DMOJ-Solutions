class Quadrants {
        public static void main(String[] args) {
        int x = 12;
        int y = 5;

        if (x > 0 && y > 0) {
        System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else {
            System.out.println("1");
        }
    }
}