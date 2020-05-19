package com.itcast.day01;
//龟兔赛跑跑道
public class Racer implements Runnable {
 private String winner;

    @Override
    public void run() {

        for (int step=0;step<=100;step++){      //跑道有100步
            //判断是否为兔子
            if(Thread.currentThread().getName().equals("rabit")&&step%50==0){
                try {
                    Thread.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
            System.out.println(Thread.currentThread().getName()+"跑了"+step);
            //判断是否存在胜利者
            boolean flag=this.gameOver(step);
            if (flag==true){
                System.out.println("胜利者:"+winner);
                break;
            }
        }
    }

    private boolean gameOver(int s){
        if(winner!=null){
            return true;
        }else {
            if (s==100){
                winner=Thread.currentThread().getName();
                return true;
            }

        }
        return false;
    }
}
