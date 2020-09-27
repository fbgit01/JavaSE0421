public class FamilyAccount {
    public static void main(String[] args) {
        int balance = 10000;//生活基本金
        String details = "收支\t账户金额\t收支金额\t说明\n";
        boolean loopFlag = true;

        do {
            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退    出");
            System.out.println();
            System.out.print("请选择(1-4)：");

            char key = Utility.readMenuSelection();

            switch (key) {
                case '1':
                    //打印收支明细
                    System.out.println("当前收支明细记录");
                    System.out.println(details);
                    break;
                case '2':
                    //登记收入
                    System.out.println("本次收入金额:");
                    int amount1 = Utility.readNumber();
                    System.out.println("本次收入说明:");
                    String desc1 = Utility.readString();
                    balance += amount1;
                    details += "收入" + "\t" + balance + "\t" + amount1 + "\t\t" + desc1 + "\n";
                    break;
                case '3':
                    //登记支出
                    System.out.println("本次支出金额:");
                    int amount2 = Utility.readNumber();
                    System.out.println("本次支出说明:");
                    String desc2 = Utility.readString();
                    balance -= amount2;
                    details += "支出" + "\t" + balance + "\t" + amount2 + "\t\t" + desc2 + "\n";

                    break;
                case '4':
                    //退出
                    System.out.println("确认是否退出(Y/N)");
                    char yn = Utility.readConfirmSelection();
                    if (yn == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }

        } while (loopFlag);
    }
}
