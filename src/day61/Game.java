package day61;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;

    public Game(Player player){
        this.player=player;
    }


    /**
     * 2石头，1剪刀，0布
     * 游戏规则
     *
     * @return
     */
    public int rule(int s1, int s2) {
        if (s1 == s2) {
            return 0;
        }

        if (s1 == 0 && s2 == 2) {
            return 1;
        }

        if (s1 == 2 && s2 == 0) {
            return -1;
        }

        if (s1 - s2 > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public void start() {
        System.out.println("开始游线");

        String[] arr = new String[]{"布", "剪刀", "石头"};

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("规则：2石头，1剪刀，0布，-1 不玩了");
                System.out.println("请输入：");
                Scanner sc = new Scanner(System.in);//输入类Scanner，控制台输入System.in
                int player1_in = Integer.parseInt(sc.next());//获得用户输入
                if (player1_in == -1) {
                    System.out.println("现在退出，下再来玩！");
                    return;
                }

                String player_str = arr[player1_in];
                System.out.println("您输入的是：" + player_str);
                Random random=new Random();
                int player2_in=random.nextInt(3);
                //int player2_in = (int) (Math.random() * 3);//每次运行的结果都一样。

                System.out.println("系统出的是：" + arr[player2_in]);
                int result = this.rule(player1_in, player2_in);
                if (result > 0) {
                    System.out.println("恭喜"+this.player.getName()+"，奖励10分");
                    int score=this.player.getScore();
                    this.player.setScore(score+10);
                } else if (result<0) {
                    System.out.println("对不起，"+this.player.getName()+" 你输了，扣10分");
                    int score=this.player.getScore();
                    this.player.setScore(score-10);
                }else {
                    System.out.println("不错哦，打平了！");
                }
                System.out.println(this.player);
                System.out.println("");
                System.out.println("-------------------");
            } catch (Exception e) {
                System.out.println("输入无效，请重新输入");
                System.out.println("");
                System.out.println("-------------------");
            }

        }


    }

}

