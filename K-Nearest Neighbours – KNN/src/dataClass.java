public class dataClass {
    public static class Data {
        double x;
        double y;
        String character;
        double distance;

        public Data(double x, double y, String character) {
            this.x = x;
            this.y = y;
            this.character = character;
        }

        public double getDistance() {
            return distance;
        }
    }
}
