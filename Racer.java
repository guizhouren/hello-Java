package com.itcast.day01;
//���������ܵ�
public class Racer implements Runnable {
 private String winner;

    @Override
    public void run() {

        for (int step=0;step<=100;step++){      //�ܵ���100��
            //�ж��Ƿ�Ϊ����
            if(Thread.currentThread().getName().equals("rabit")&&step%50==0){
                try {
                    Thread.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
            System.out.println(Thread.currentThread().getName()+"����"+step);
            //�ж��Ƿ����ʤ����
            boolean flag=this.gameOver(step);
            if (flag==true){
                System.out.println("ʤ����:"+winner);
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
