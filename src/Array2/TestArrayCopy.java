package Array2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestArrayCopy {
    public static void main(String[] args) {
        String[] s1={"阿里","百度","超常","京东","腾讯"};
        removeElement(s1,2);
    }
    public static void testtBasicCopy(){
        String[] s1={"aa","bb","cc","dd","ee"};
        String[] s2 = new String[10];
        System.arraycopy(s1,2,s2,6,3);

        for(int i=0;i<s2.length;i++){
            System.out.println(i+"--"+s2[i]);
        }
    }

    public static void testtBasicCopy2(){
        String[] s1={"aa","bb","cc","dd","ee"};
        String[] s2 = new String[5];
        System.arraycopy(s1,3,s2,2,2);

        for(int i=0;i<s2.length;i++){
            System.out.println(i+"--"+s2[i]);
        }
    }

    public static String[] removeElement(String[] s,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1]=null;
        for(int i=0;i<s.length;i++){
            System.out.println(i+"--"+s[i]);
        }
        return s;
    }
    //数组的扩容，本质上是先定义一个更大的数组，然后将原数组原封不动的拷贝过去
    public static void extendRange(){
        String[] s1={"aa","bb","cc","dd","ee"};

        String[] s2 = new String[s1.length+10];

        System.arraycopy(s1,0,s2,0,s1.length);

    }
}
