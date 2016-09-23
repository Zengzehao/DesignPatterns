package Prototype;

import java.util.Random;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class ClientDemo {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        Mail mail = new Mail("某商场五一抽奖活动","五一抽奖活动通知：........");
        mail.setTail("本活动最终解释权归某商场所有");
        while(i<MAX_COUNT){
            //克隆邮箱
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            //发送邮件
            sendMail(cloneMail);
            i++;

        }
    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题： "+mail.getSubject()+"\t收件人： "+mail.getReceiver()+"\t发送成功");
    }

    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i <maxLength ; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
