import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.start();
        game.accelerate();
        game.booster();
        game.drift();
        game.reverse();

        RacingGameCash gameCash = new RacingGameCash();
        gameCash.start();
        gameCash.accelerate();
        gameCash.booster();
        gameCash.drift();
        gameCash.reverse();
    }
}

class RacingGame implements Racing {
    private String userName;
    private int controlCount;
    private int movingDistance;
    private int speed;
    private int hour;
    Scanner sc = new Scanner(System.in);

    public RacingGame() {
        this.controlCount = 0;
        this.movingDistance = 0;
        this.speed = 10;
        this.hour = 1;
    }

    @Override
    public void start() {
        System.out.print("등록할 사용자명을 입력해주세요 : ");
        userName = sc.nextLine();
        System.out.printf("[안내] %s님. 카카오라이딩에 오신것을 진심으로 환영합니다.\n",userName);

    }
    @Override
    public void accelerate() {
        controlCount++;
        movingDistance = movingDistance + speed*hour;
        System.out.printf("[가속]------------------------------\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 주행 거리 : %dkm\n" +
                "------------------------------------\n", controlCount, movingDistance);

    }
    @Override
    public void drift() {
        String direction ;
        controlCount++;
        movingDistance = movingDistance + speed*hour/2;

        while(true) {
            System.out.printf("[방향 회전]-------------------------\n" +
                    "| * 회전 방향 입력 [<] [>] : ");
            String dir = sc.nextLine();
            if(dir.equals("<")) {
                direction = "왼쪽";
                break;
            } else if(dir.equals(">")){
                direction = "오른쪽";
                break;
            } else {
                System.out.println("잘못입력되었습니다. 방향을 재입력해주세요.");
            }
        }
        System.out.printf("| * [%s] 으로 회전합니다.\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 드리프트 주행 거리 : %dkm\n" +
                "------------------------------------\n", direction, controlCount, movingDistance);
    }

    @Override
    public void booster() {
        controlCount++;
        movingDistance = movingDistance + speed*hour*2;
        System.out.printf("[부스터 가속 2 단계 ]-------------------\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 부스트 주행 거리 : %dkm\n" +
                "------------------------------------\n", controlCount, movingDistance);
    }
    @Override
    public void reverse() {
        controlCount++;
        movingDistance = movingDistance - speed*hour/2;
        System.out.printf("[후진]-------------------------------\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 후진 주행 거리 : %dkm\n" +
                "------------------------------------\n", controlCount, movingDistance);

    }

}


class RacingGameCash implements Racing {
    private String userName;
    private int controlCount;
    private int movingDistance;
    private int speed;
    private int hour;
    Scanner sc = new Scanner(System.in);

    public RacingGameCash() {
        this.controlCount = 0;
        this.movingDistance = 0;
        this.speed = 10;
        this.hour = 1;
    }

    @Override
    public void start() {
        System.out.print("등록할 사용자명을 입력해주세요 : ");
        userName = sc.nextLine();
        System.out.printf("[안내] (캐쉬충전)%s님. 카카오라이딩에 오신것을 진심으로 환영합니다.\n",userName);

    }
    @Override
    public void accelerate() {
        controlCount++;
        movingDistance = movingDistance + speed*hour*2;
        System.out.printf("[Lv2 가속]------------------------------\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 주행 거리 : %dkm\n" +
                "------------------------------------\n", controlCount, movingDistance);

    }
    @Override
    public void drift() {
        String direction ;
        controlCount++;
        movingDistance = movingDistance + speed*hour/2;

        while(true) {
            System.out.print("[방향 회전]-------------------------\n" +
                    "| * 회전 방향 입력 [<] [>] : ");
            String dir = sc.nextLine();
            if(dir.equals("<")) {
                direction = "왼쪽";
                break;
            } else if(dir.equals(">")){
                direction = "오른쪽";
                break;
            } else {
                System.out.println("잘못입력되었습니다. 방향을 재입력해주세요.");
            }
        }
        System.out.printf("| * [%s] 으로 회전합니다.\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 드리프트 주행 거리 : %dkm\n" +
                "------------------------------------\n", direction, controlCount, movingDistance);
    }

    @Override
    public void booster() {
        controlCount++;
        movingDistance = movingDistance + speed*hour*2*2;
        System.out.printf("[Lv2 부스터 가속 2 단계 ]-------------------\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 부스트 주행 거리 : %dkm\n" +
                "------------------------------------\n", controlCount, movingDistance);
    }
    @Override
    public void reverse() {
        controlCount++;
        movingDistance = movingDistance - speed*hour/2;
        System.out.printf("[후진]-------------------------------\n" +
                "| * 컨트롤 횟수 : %d\n" +
                "| * 후진 주행 거리 : %dkm\n" +
                "------------------------------------\n", controlCount, movingDistance);

    }

}
