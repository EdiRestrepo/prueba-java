public class theBottle {

    public static int emptyBottle(int ballsinbottle){
        if(ballsinbottle > 0){
            System.out.print(ballsinbottle);
            return emptyBottle(ballsinbottle -1);
        }else {
            return ballsinbottle;
        }
    }
    public static void main(String[] args) {
        System.out.println(emptyBottle(3));
    }
}
