public class StaticDemo {
    public static void main(String[] args) {

        StaticDemo s1 = new StaticDemo();
        s1.counter1();

    }


        public void counter1() {
            int counter = 1;

            while (counter < 10) {
                counter++;

            }
            System.out.println(counter);
        }
    }