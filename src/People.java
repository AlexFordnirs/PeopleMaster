public class People {

        private final String fIO;
        private final String type;
        private final int money;
        private final String children;
        private final int time;
        public People(String fIO, String type, int money,String children,int time) {
            this.fIO = fIO;
            this.type = type;
            this.money = money;
            this.children=children;
            this.time=time;
        }



    public void main(String[] args) {
        People1 people1 = new People1("Vasilii", "ставка", 800,"No",201);
        people1.displaynalog1();
        People2 people2 = new People2("Vasilii", "ставка", 800,"No",201);
        people2.displaynalog2();
        People3 people3 = new People3("Vasilii", "ставка", 800,"No",201);
        people3.displaynalog3();
        People4 people4 = new People4("Vasilii", "ставка", 800,"No",201);
        people4.displaynolog();
        People5 people5 = new People5("Vasilii", "ставка", 800,"No",201);
        people5.displaynalog3();

    }
    class People1 extends People {

        People1(String fIO, String type, int money, String children,int time) {
            super(fIO, type, money, children, time);
        }
        private void displaynalog1()
        {
            int stafmoney=0;
            int stafg=0;
            if(type.equals("ставка")||type.equals("почасовая"))
            {
                stafmoney=money-(money*20/100);
                stafg=20;
            }
            else if(type.equals("сдельная"))
            {
                stafmoney=money-(money*15/100);
                stafg=15;
            }
            System.out.println("FIO:  "+fIO+"   Налог %:  "+stafg+"    Сумма:  "+money +"    К оплате (грн):  "+stafmoney);
        }
    }
    class People2 extends People {

        People2(String fIO, String type, int money, String children,int time) {
            super(fIO, type, money, children,  time);
        }
        private void displaynalog2()
        {
            int stafmoney=0;
            int stafg=0;
            if(type.equals("ставка")||type.equals("почасовая"))
            {
                if(children.equals("Yes"))
                {
                    stafmoney = money - (money * 25 / 100);
                    stafg = 25;
                }
                else {
                    stafmoney = money - (money * 20 / 100);
                    stafg = 20;
                }
            }
            else if(type.equals("сдельная"))
            {
                if(children.equals("Yes"))
                {
                    stafmoney = money - (money * 20 / 100);
                    stafg = 20;
                }
                else {
                    stafmoney = money - (money * 15 / 100);
                    stafg = 15;
                }
            }
            System.out.println("FIO:  "+fIO+"   Налог %:  "+stafg+"    Сумма:  "+money +"    К оплате (грн):  "+stafmoney);
        }
    }
    class People3 extends People {

        People3(String fIO, String type, int money, String children,int time) {
            super(fIO, type, money, children,  time);
        }
        private void displaynalog3()
        {
            int stafmoney=0;
            int stafg=0;
            int tygri=0;
            if(type.equals("почасовая"))
            {
                if(children.equals("Yes"))
                {
                    stafmoney = money - (money * 25 / 100);
                    stafg = 25;
                }
                else {
                    stafmoney = money - (money * 20 / 100);
                    stafg = 20;
                }
                System.out.println("FIO:  " + fIO + "   Налог %:  " + stafg + "    Сумма:  " + money + "   К оплате (грн/ тугрики) Курс 1/8 " + stafmoney+"/"+stafmoney/8);
            }
            else {
                if (type.equals("ставка")) {
                    if (children.equals("Yes")) {
                        stafmoney = money - (money * 25 / 100);
                        stafg = 25;
                    } else {
                        stafmoney = money - (money * 20 / 100);
                        stafg = 20;
                    }
                } else if (type.equals("сдельная")) {
                    if (children.equals("Yes")) {
                        stafmoney = money - (money * 20 / 100);
                        stafg = 20;
                    } else {
                        stafmoney = money - (money * 15 / 100);
                        stafg = 15;
                    }
                }
                System.out.println("FIO:  " + fIO + "   Налог %:  " + stafg + "    Сумма:  " + money + "    К оплате (грн):  " + stafmoney);
            }
        }
    }
    class People4 extends People {

        People4(String fIO, String type, int money, String children,int time) {
            super(fIO, type, money, children,  time);
        }
        private void displaynolog()
        {
            System.out.println("FIO:  "+fIO+"   Вид Оплаты:  "+type+"    Сумма:  "+money);
        }
    }
    class People5 extends People {

        People5(String fIO, String type, int money, String children,int time) {
            super(fIO, type, money, children,  time);
        }
        private void displaynalog3()
        {
            int stafmoney=0;
            int stafg=0;
            int premka=0;
            if(time >=200){premka=money-money*30/100;}
            if(type.equals("почасовая"))
            {
                if(children.equals("Yes"))
                {
                    stafmoney = money - (money * 25 / 100);
                    stafg = 25;
                }
                else {
                    stafmoney = money - (money * 20 / 100);
                    stafg = 20;
                }
                System.out.println("FIO:  " + fIO + "   Налог %:  " + stafg + "    Сумма:  " + money + "   К оплате (грн/ тугрики) Курс 1/8 " + stafmoney+"/"+stafmoney/8+"   Премия :" + premka);
            }
            else {
                if (type.equals("ставка")) {
                    if (children.equals("Yes")) {
                        stafmoney = money - (money * 25 / 100);
                        stafg = 25;
                    } else {
                        stafmoney = money - (money * 20 / 100);
                        stafg = 20;
                    }
                } else if (type.equals("сдельная")) {
                    if (children.equals("Yes")) {
                        stafmoney = money - (money * 20 / 100);
                        stafg = 20;
                    } else {
                        stafmoney = money - (money * 15 / 100);
                        stafg = 15;
                    }
                }
                System.out.println("FIO:  " + fIO + "   Налог %:  " + stafg + "    Сумма:  " + money + "    К оплате (грн):  " + stafmoney+"   Премия :" + premka);
            }
        }
    }
        private void display(){
            System.out.println("FIO:  "+fIO+"   Вид Оплаты:  "+type+"    Сумма:  "+money);
        }



}
