import java.util.Random;

public class creatArithmetic {

    String process;
    String process1;
    String process2;
    String[] operationSymbol1 = new String[1];
    String[] operationSymbol2 = new String[1];
    int number1;
    int number2;
    int number;
    int answer1;
    int answer2;
    public creatArithmetic(){
        oneArithmeticResult();
        twoArithmeticResult();
    }

    //生成两个运算符
    void twoArithmeticResult() {
        int result1 = oneArithmeticResult();
        answer2 = -1;
        while (true) {
            Random r = new Random();
            number = r.nextInt(98) + 2;
            int choice2 = r.nextInt(20);
            if (choice2 == 0) {
                operationSymbol2[0] = "＋";
                answer2 = result1 + number;
            } else if (choice2 == 1) {
                if (result1 > number) {
                    operationSymbol2[0] = "－";
                    answer2 = result1 - number;
                }
            } else if (choice2 >= 2 && choice2 <= 9) {
                operationSymbol2[0] = "×";
                if(operationSymbol1[0].equals("＋")){
                    if( number2 * number <100){
                        answer2 = number1 + number2 * number;
                    }else{
                        continue;
                    }
                }else if(operationSymbol1[0].equals("－")){
                    if(number2 * number <100){
                        answer2 = number1 - number2 * number;
                    }else{
                        continue;
                    }
                }else{
                    answer2 = result1 * number;
                }
            } else if(choice2 >= 10) {
                operationSymbol2[0] = "÷";
                if (operationSymbol1[0].equals("＋")) {
                    if (number2 % number == 0 && number2 / number > 1) {
                        answer2 = number1 + (number2 / number);
                    } else {
                        continue;
                    }
                } else if (operationSymbol1[0].equals("－")) {
                    if (number2 % number == 0 && number2 / number > 1) {
                        answer2 = number1 - (number2 / number);
                    } else {
                        continue;
                    }
                } else {
                    if (result1 % number == 0) {
                        answer2 = result1 / number;
                    }
                }
            }
            if (answer2 >= 0 && answer2 <= 100) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        process2 = sb.append(process).append(operationSymbol2[0]).append(number).append("=").toString();
     /*   System.out.println("请计算:" + process2);
        System.out.println("答案为:" + answer2);*/
    }

    //生成一个运算符
    int oneArithmeticResult() {
            answer1 = -1;
            while (true) {
                Random r = new Random();
                int randomNumber1 = r.nextInt(98) + 2;
                int randomNumber2 = r.nextInt(98) + 2;
                int choice1 = r.nextInt(20);
                if (choice1 == 0) {
                    operationSymbol1[0] = "＋";
                    answer1 = randomNumber1 + randomNumber2;
                } else if (choice1 == 1) {
                    if (randomNumber1 >= randomNumber2) {
                        operationSymbol1[0] = "－";
                        answer1 = randomNumber1 - randomNumber2;
                    }else{
                        continue;
                    }
                } else if (choice1 >= 2 && choice1 <= 6) {
                    operationSymbol1[0] = "×";
                    answer1 = randomNumber1 * randomNumber2;
                } else if (choice1 >= 7) {
                    if (randomNumber1 % randomNumber2 == 0) {
                        operationSymbol1[0] = "÷";
                        answer1 = randomNumber1 / randomNumber2;
                    }else{
                        continue;
                    }
                }
                if (answer1 > 1 && answer1 < 100) {
                    number1 = randomNumber1;
                    number2 = randomNumber2;
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            process = sb.append(number1).append(operationSymbol1[0]).append(number2).toString();
            process1 = process + "=";
          /*  System.out.println("请计算:" + process1);
            System.out.println("答案为:" + answer1);*/
            return answer1;
        }
}
