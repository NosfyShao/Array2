package Array2;

import java.util.Arrays;

public class TestArrayTableData {
    public static void main(String[] args) {
        Object[]emp1={1001,"Nosfy",18,"Coder","2018.12.27"};
        Object[]emp2={1002,"NosfyM",18,"琴师","2018.12.27"};
        Object[]emp3={1003,"NosfyD",18,"画师","2018.12.27"};
        Object[][] tableData = new Object[3][];
        tableData[0]=emp1;
        tableData[1]=emp2;
        tableData[2]=emp3;
        for (Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }
    }
}
