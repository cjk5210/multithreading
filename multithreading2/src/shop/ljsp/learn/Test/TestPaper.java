package shop.ljsp.learn.Test;

public class TestPaper {
    public static double getResult(int num,double yuanlai,double p){
        double shiyong=0.0;
        num-=1;
        p=p*2.0;
        if(num!=1){

            yuanlai-=yuanlai*(1/p);
            yuanlai-=getResult(num,yuanlai,p);

        }else{

            yuanlai-=yuanlai*(1/p);
        }

        return yuanlai;
    }

    public static void main(String[] args) {
        double total=1.0-1.0/2.0-1.0/4.0-1.0/8.0-1.0/16.0;
        System.out.println(total);
        total=1.0/16.0;
        System.out.println(total);

        double total2=1.0;
        double chentshu=0.0;
        double s=0.0;
        for (int i = 4; i > 0; i--) {
            if(i==4){
                chentshu=1.0/2.0;

            }else if(i==3){
                chentshu=1.0/4.0;

            }else if(i==2){
                chentshu=1.0/8.0;
            }else if(i==1){
                chentshu=1.0/16.0;
            }
            s=total2*chentshu;
            total2=total2-s;

        }
        System.out.println(total2);
        System.out.println(getResult(4,1,1));

    }
}
