package 剑指offer.替换空格;

/**
 * @Author: gaoyk
 * @Date: 2021/6/6 13:55
 * StringBuffer和String都是线程安全的（效率低），StringBuilder不是线程安全的
 * 单线程情况下 Builder效率更高
 */
public class Demo {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    private static String replaceSpace(String s) {
//        int i = 0;
//        StringBuffer stringBuffer = new StringBuffer();
//        while(i < s.length()){
//            if (s.charAt(i) == ' '){
//                stringBuffer.append("%20");
//            }else{
//                stringBuffer.append(s.charAt(i));
//            }
//            i++;
//        }
//        return stringBuffer.toString();
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(i < s.length()){
            if (s.charAt(i) == ' '){
//                stringBuffer.append("%20");
                stringBuilder.append("%20");
            }else{
//                stringBuffer.append(s.charAt(i));
                stringBuilder.append(s.charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
