public class PrintStuff {
    public static void main(String[] args) {
        //This is a comment
        System.out.println("Stuff");
    }
    public class B {
        private boolean B;

        public B(boolean b) {
            B = b;
        }

        public void setB(boolean b) {
            B = b;
        }

        public void isB(){
            if (B){
                System.out.println("A Bee must be, by reffrence to its Beeing.");
            } else {
                System.out.println("A Bee can not not be for then it would not be a Bee.");
            }
        }
    }
}
