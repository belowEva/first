package Mysteam;

import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {

        String[] fruitnames={"西瓜","荔枝","葡萄"};
        int[] fruitprices={25,40,35};
        int[] fruitcounts={80,78,57};
        while(true){
            int num=choose();
            switch(num){
                case 1:
                    show(fruitnames,fruitprices,fruitcounts);
                    break;
                case 2:
                    updatecount(fruitnames,fruitcounts);
                    break;
                case 3:
                    updateprices(fruitnames,fruitprices);
                    break;
                case 4:
                    System.out.println("感谢使用AB水果管理系统，期待你的下次使用！");
                    System.exit(0);
                default:
                    System.out.println("选择错误，请重新选择！");
            }
        }
    }
    public static int choose(){
        System.out.println("-----欢迎使用AB水果管理系统-----");
        System.out.println("button 1 : 查看水果信息。");
        System.out.println("button 2 : 修改水果库存。");
        System.out.println("button 3 : 修改水果价格。");
        System.out.println("button 4 : 退出系统。");
        System.out.println("请按键输入数字执行你想要的操作:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        return num;

    }
    public static void show(String[] fruitnames,int[] fruitprices,int[] fruitcounts){
        System.out.println("----查看水果清单----");
        int totalcounts=0;
        int totalprices=0;
        System.out.println("水果名称"+"\t"+"水果价格(元/斤)"+"\t"+"水果库存（斤）");
        for (int i=0;i<fruitnames.length;i++){
            totalcounts+=fruitcounts[i];
            totalprices+=fruitprices[i]*fruitcounts[i];
            System.out.println(fruitnames[i]+"\t\t"+fruitprices[i]+"\t\t\t\t"+fruitcounts[i]);
        }
        System.out.println("总库存"+totalcounts+"斤/t"+"\t\t"+"总价格"+totalprices+"元");
    }
    public static void updatecount(String[] fruitnames,int[] fruitcounts){
        System.out.println("请输入要修改的水果名称：");
        Scanner sc=new Scanner(System.in);
        String fruitname= sc.next();
        System.out.println("请输入修改后的库存: ");
        int count= sc.nextInt();
        for(int i=0;i< fruitnames.length;i++){
            if(fruitnames[i].equals(fruitname)){
                fruitcounts[i]=count;
            }
        }
        System.out.println("修改成功。");
    }
    public static void updateprices(String[] fruitnames,int[] fruitprices){
        System.out.println("请输入要修改的水果名称：");
        Scanner sc=new Scanner(System.in);
        String fruitname= sc.next();
        System.out.println("请输入要修改的价格：");
        int num= sc.nextInt();
        for (int i=0;i< fruitnames.length;i++){
            if (fruitnames[i].equals(fruitname)){
                fruitprices[i]=num;
            }
        }
        System.out.println("修改成功！");
    }
}