public class Alfa {

    public int GetThis(int x, int y) {
        return x + y;
    }

    static class Beta extends Alfa{
        @Override
        public int GetThis(int x, int y){
            return x - y;
        }
    }

    public static class TestThis{
        public static void main(String[] args){
            Beta b = new Beta();
            System.out.println("x = " + b.GetThis(0,2));
        }
    }


}
