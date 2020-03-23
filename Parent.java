import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Parent implements ActionListener
{

    JFrame frame = new JFrame();
    Container container;
    JTextField display = new JTextField();
    JLabel backlight;
    JLabel backdark;


    String operator;
    double a,b;
    String expression;
    double first=0.0;
    double second=0.0;

    public boolean toggler = false;

    public int framewidth = 335;
    public int frameheight = 470;
    public int displaywidth = 325;
    public int displayheight = 150;
    public int displayfromtop = 10;
    public int displayfromside = 5;

    /*/// Button Distances ///*/
    int fromtop = 200;
    int fromside = 4;
    int fromeach = 0;
    int buttonwidth = 63;
    int buttonheight = 43;
    int heightshaper = fromtop;
    int spbuttonwidth = 67;
    int spbuttonheight = 72;


    JButton onebutton ;
    JButton twobutton ;
    JButton threebutton ;
    JButton fourbutton ;
    JButton fivebutton ;
    JButton sixbutton;
    JButton sevenbutton;
    JButton eightbutton;
    JButton ninebutton;
    JButton zerobutton;
    JButton dotbutton;
    JButton plusbutton;
    JButton minusbutton ;
    JButton divbutton ;
    JButton mulbutton ;
    JButton percentbutton;
    JButton powerbutton ;
    JButton sinbutton;
    JButton cosbutton;
    JButton logbutton;
    JButton equalbutton;
    JButton backbutton;
    JButton clearbutton;
    JButton togglebutton;


    Font smallfont;
    Font bigfont;
    Font operatorfont;


    Color clearbutton_background_color;
    Color clearbutton_foreground_color;
    Color backbutton_background_color ;
    Color backbutton_foreground_color ;
    Color equalbutton_background_color;
    Color equalbutton_foreground_color;
    Color operator_background_color ;
    Color operator_foreground_color;
    Color digit_background_color ;
    Color digit_foreground_color;
    Color special_background_color;
    Color special_foreground_color;

    Color display_foreground;
    Color togglebutton_foreground_color;


    public Parent()
    {


        frame.setTitle("Calculator");
        frame.setBounds(100,100,framewidth,frameheight);
        frame.setResizable(false);
        container = frame.getContentPane();
        container.setLayout(null);

        togglebutton = new JButton("~");
        togglebutton.setBounds(0,0,50,40);
        togglebutton.setBackground(Color.LIGHT_GRAY);
        togglebutton.setOpaque(false);

        togglebutton.setBorder(null);
        container.add(togglebutton);

        display.setBounds(displayfromside,displayfromtop,displaywidth,displayheight);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setOpaque(false);
        display.setBorder(null);
        display.setForeground(display_foreground);
        container.add(display);

        ImageIcon lightimage = new ImageIcon(getClass().getResource("back8.jpg"));
        Image temp_image = lightimage.getImage();
        temp_image = temp_image.getScaledInstance(framewidth, frameheight, Image.SCALE_SMOOTH);
        lightimage = new ImageIcon(temp_image);
        backlight = new JLabel("",lightimage,JLabel.CENTER);
        //
        //
        ImageIcon darkimage = new ImageIcon(getClass().getResource("back7.jpg"));
        Image temp_image1 = darkimage.getImage();
        temp_image1 = temp_image1.getScaledInstance(framewidth, frameheight, Image.SCALE_SMOOTH);
        darkimage = new ImageIcon(temp_image1);
        backdark = new JLabel("",darkimage,JLabel.CENTER);


        backlight.setBounds(0,0,framewidth,frameheight);
        backdark.setBounds(0,0,framewidth,frameheight);


        smallfont = new Font("Arial", Font.BOLD,12);
        bigfont = new Font("Arial" , Font.BOLD,40);
        operatorfont = new Font("Arial" , Font.BOLD,20);



        onebutton = new JButton("1");
         twobutton = new JButton("2");
         threebutton = new JButton("3");
         fourbutton = new JButton("4");
         fivebutton = new JButton("5");
         sixbutton = new JButton("6");
         sevenbutton = new JButton("7");
         eightbutton = new JButton("8");
         ninebutton = new JButton("9");
         zerobutton = new JButton("0");
         plusbutton = new JButton("+");
         minusbutton = new JButton("-");
         mulbutton = new JButton("*");
         divbutton = new JButton("/");
         dotbutton = new JButton(".");
         percentbutton = new JButton("%");
         powerbutton = new JButton("^");
         logbutton = new JButton("log");
         sinbutton = new JButton("sin");
         cosbutton = new JButton("cos");
         backbutton = new JButton("<-");
         clearbutton = new JButton("C");
         equalbutton = new JButton("=");






        //Font of Operators
        plusbutton.setFont(operatorfont);
        minusbutton.setFont(operatorfont);
        mulbutton.setFont(operatorfont);
        divbutton.setFont(operatorfont);
        dotbutton.setFont(operatorfont);
        percentbutton.setFont(operatorfont);
        powerbutton.setFont(operatorfont);
        logbutton.setFont(smallfont);
        sinbutton.setFont(smallfont);
        cosbutton.setFont(smallfont);

        equalbutton.setFont(new Font("arial", Font.BOLD, 30));
        clearbutton.setFont(new Font("arial", Font.BOLD, 30));
        backbutton.setFont(new Font("arial", Font.BOLD, 25));



        /////////////////////
        /// First Column ////
        /////////////////////

        eightbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(eightbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        sixbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(sixbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        fourbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(fourbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        twobutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(twobutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        zerobutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(zerobutton);


        /////////////////////
        /// Second Column ////
        /////////////////////

        heightshaper = fromtop;
        fromside = fromside + buttonwidth + fromeach;


        ninebutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(ninebutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        sevenbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(sevenbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        fivebutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(fivebutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        threebutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(threebutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        onebutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(onebutton);


        /////////////////////
        /// Third Column ////
        /////////////////////


        heightshaper = fromtop;
        fromside = fromside + buttonwidth + fromeach+3;


        plusbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(plusbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        minusbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(minusbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        mulbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(mulbutton);

        heightshaper = heightshaper + buttonheight + fromeach;

        divbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(divbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        dotbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(dotbutton);



        /////////////////////
        /// Fourth Column ////
        /////////////////////

        heightshaper = fromtop;
        fromside = fromside + buttonwidth + fromeach;



        percentbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(percentbutton);


        heightshaper = heightshaper + buttonheight + fromeach;


        powerbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(powerbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        logbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(logbutton);


        heightshaper = heightshaper + buttonheight + fromeach;


        sinbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(sinbutton);

        heightshaper = heightshaper + buttonheight + fromeach;


        cosbutton.setBounds(fromside,heightshaper,buttonwidth,buttonheight);
        container.add(cosbutton);


        /////////////////////
        /// Fifth Column ////
        /////////////////////

        heightshaper = fromtop;
        fromside = fromside + buttonwidth + fromeach+3;

        backbutton.setBounds(fromside,heightshaper,spbuttonwidth,spbuttonheight);
        container.add(backbutton);


        heightshaper = heightshaper + spbuttonheight + fromeach;

        clearbutton.setBounds(fromside,heightshaper,spbuttonwidth,spbuttonheight);
        container.add(clearbutton);


        heightshaper = heightshaper + spbuttonheight + fromeach;

        equalbutton.setBounds(fromside,heightshaper,spbuttonwidth,spbuttonheight);
        container.add(equalbutton);




        ///////////////////
        ////Interactions//
        //////////////////


        zerobutton.addActionListener(this);
        onebutton.addActionListener(this);
        twobutton.addActionListener(this);
        threebutton.addActionListener(this);
        fourbutton.addActionListener(this);
        fivebutton.addActionListener(this);
        sixbutton.addActionListener(this);
        sevenbutton.addActionListener(this);
        eightbutton.addActionListener(this);
        ninebutton.addActionListener(this);
        dotbutton.addActionListener(this);

        plusbutton.addActionListener(this);
        minusbutton.addActionListener(this);
        mulbutton.addActionListener(this);
        divbutton.addActionListener(this);
        percentbutton.addActionListener(this);
        sinbutton.addActionListener(this);
        cosbutton.addActionListener(this);
        powerbutton.addActionListener(this);
        logbutton.addActionListener(this);

        equalbutton.addActionListener(this);
        clearbutton.addActionListener(this);
        backbutton.addActionListener(this);
        togglebutton.addActionListener(this);

        if(toggler)
            Light();
        else
            Dark();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        display.setFont(bigfont);

        if(actionEvent.getSource() == onebutton)
            display.setText(display.getText().concat("1"));
        if(actionEvent.getSource() == twobutton)
            display.setText(display.getText().concat("2"));
        if(actionEvent.getSource() == threebutton)
            display.setText(display.getText().concat("3"));
        if(actionEvent.getSource() == fourbutton)
            display.setText(display.getText().concat("4"));
        if(actionEvent.getSource() == fivebutton)
            display.setText(display.getText().concat("5"));
        if(actionEvent.getSource() == sixbutton)
            display.setText(display.getText().concat("6"));
        if(actionEvent.getSource() == sevenbutton)
            display.setText(display.getText().concat("7"));
        if(actionEvent.getSource() == eightbutton)
            display.setText(display.getText().concat("8"));
        if(actionEvent.getSource() == ninebutton)
            display.setText(display.getText().concat("9"));
        if(actionEvent.getSource() == zerobutton)
            display.setText(display.getText().concat("0"));
        if(actionEvent.getSource() == dotbutton)
            display.setText(display.getText().concat("."));

        if(actionEvent.getSource() == plusbutton)
        {
            display.setText(display.getText().concat("+"));

        }
        if(actionEvent.getSource() == minusbutton) {
            display.setText(display.getText().concat("-"));

        }
        if(actionEvent.getSource() == mulbutton)
        {
            display.setText(display.getText().concat("*"));

        }

        if(actionEvent.getSource() == divbutton)
            display.setText(display.getText().concat("/"));

        if(actionEvent.getSource() == logbutton)
            display.setText(display.getText().concat("log("));
        if(actionEvent.getSource() == sinbutton)
            display.setText(display.getText().concat("sin("));
        if(actionEvent.getSource() == cosbutton)
            display.setText(display.getText().concat("cos("));
        if(actionEvent.getSource() == powerbutton)
            display.setText(display.getText().concat("^"));
        if(actionEvent.getSource() == percentbutton)
            display.setText(display.getText().concat("%"));

        if(actionEvent.getSource() == clearbutton)
        {
            display.setText("");
        }

        if(actionEvent.getSource() == backbutton)
        {

            String temp = display.getText();
            int length = temp.length();
            StringBuilder sb = new StringBuilder(temp);

            if(length == 0)
            {

            }
            else if(temp.charAt(length-1) == '(')
            {
                sb.deleteCharAt(length-1);
                sb.deleteCharAt(length-2);
                sb.deleteCharAt(length-3);
                sb.deleteCharAt(length-4);

            }

            else
                sb.deleteCharAt(length-1);

            temp = sb.toString();
            display.setText(temp);
        }

        if(actionEvent.getSource() == equalbutton)
        {
            expression = display.getText();
            evaluateExpression(expression);
        }

        if(actionEvent.getSource() == togglebutton)
        {
            toggler = !toggler;
            if(toggler)
                Light();
            else
                Dark();


         }


    }

    private void evaluateExpression(String expression)
    {
        String a="",b="";
        operator = "";
        //display.setText("expressin is-> "+ expression);
        int expressionlength = expression.length();

        for(int i=0 ; i<expressionlength ; i++)
        {
            if(expression.charAt(i) == 'l')  //log
            {

                operator = "log";
                i = i+3;
            }

            else if(expression.charAt(i) == 's')   //sin
            {

                operator = "sin";
                i = i+3;
            }
            else if(expression.charAt(i) == 'c')    //cos
            {

                operator = "cos";
                i = i+3;
            }
            else if(expression.charAt(i) == '+')    // +
            {
                if(a == "")
                {
                    invalid();
                    break;
                }
                operator = "plus";

            }
            else if(expression.charAt(i) == '-')    // -
            {
                if(a == "")
                {
                    invalid();
                    break;
                }
                operator = "minus";

            }
            else if(expression.charAt(i) == '*')    // *
            {
                if(a == "")
                {
                    invalid();
                    break;
                }
                operator = "mul";

            }
            else if(expression.charAt(i) == '/')    // /
            {
                if(a.equals(""))
                {
                    invalid();
                    break;
                }
                operator = "div";

            }
            else if(expression.charAt(i) == '^')    // ^
            {
                if(a == "")
                {
                    invalid();
                    break;
                }
                operator = "power";

            }
            else if(expression.charAt(i) == '%')    // %
            {
                if(a == "")
                {
                    invalid();
                    break;
                }
                operator = "percent";

            }



            else if ((expression.charAt(i) >= '0' && expression.charAt(i) <= '9') || expression.charAt(i) == '.')
            {
                if(operator == "")
                    a = a + expression.charAt(i);
                else
                    b = b + expression.charAt(i);

            }

            else
            {
                invalid();
                break;

            }
            //end of operator evaluation
        }//end of expression evaluation (loop)

        // System.out.println(" a = " + a + "\n b = " + b + operator);
        if(a.equals(""))
            a = "1";
        first = Double.parseDouble(a);
        if(b.equals(""))
        {
            invalid();
            return;
        }
        second = Double.parseDouble(b);

        executeExpression(first,second,operator,expression);

    }//end of evaluateexpression function

    private void executeExpression(double first, double second, String operator,String expression)
    {
        //System.out.println("first operand is  "+ first+"\nsecond operator is "+second+"\noperator is "+operator);
        double result=0.0;
        display.setText(expression + "  ");
        switch (operator)
        {

            case "plus":
                result = first+second;

                break;

            case "minus":
                result = first-second;

                break;

            case "mul":
                result = first*second;

                break;

            case "div":
                result = first/second;

                break;

            case "power":
                result = Math.pow(first,second);

                break;

            case "percent":
                result = (first*second) /100;
                break;

            case "sin":
                result = first *  Math.sin(second);

                break;

            case "cos":
                result = first * Math.cos(second);

                break;

            case "log":
                result = first * Math.log(second);

                break;
            default:
                invalid();
        }

        DecimalFormat df = new DecimalFormat("#.#####");
        String formatted = df.format(result);
        display.setText(formatted);
    }

    private void invalid ()
    {
        display.setText("Invalid Input");
    }

    public void Light()
    {
        clearbutton_background_color = new Color(238, 64, 53);
        clearbutton_foreground_color = Color.BLACK;
        backbutton_background_color = new Color(243, 119, 54);
        backbutton_foreground_color = Color.BLACK;
        equalbutton_background_color = new Color(134, 222, 169);
        equalbutton_foreground_color = Color.BLACK;
        special_foreground_color = Color.BLACK;
        operator_background_color = new Color(173, 214, 255);
        operator_foreground_color = Color.BLACK;
        digit_background_color = new Color(214, 234, 255);
        digit_foreground_color = Color.BLACK;
        display_foreground = Color.BLACK;
        togglebutton_foreground_color = Color.BLACK;
        //
        //
       container.remove(backdark);
       container.add(backlight);
       container.revalidate();
       container.repaint();
        setValue();
    }

    public void Dark()
    {
        operator_background_color = new Color(27, 38, 44);
        operator_foreground_color = Color.WHITE;
        digit_background_color = new Color(57, 62, 70);
        digit_foreground_color = Color.WHITE;
        special_background_color = new Color(34, 40, 49);
        equalbutton_background_color=special_background_color;
        clearbutton_background_color =special_background_color;
        backbutton_background_color = special_background_color;
        special_foreground_color = Color.WHITE;
        display_foreground = Color.WHITE;
        togglebutton_foreground_color =  Color.WHITE;
        //
        container.remove(backlight);
        container.add(backdark);
        container.revalidate();
        container.repaint();

        //
        setValue();

    }

    public void setValue()
    {
        togglebutton.setForeground(togglebutton_foreground_color);
        display.setForeground(display_foreground);

        //Digit background
        onebutton.setBackground(digit_background_color);
        twobutton.setBackground(digit_background_color);
        threebutton.setBackground(digit_background_color);
        fourbutton.setBackground(digit_background_color);
        fivebutton.setBackground(digit_background_color);
        sixbutton.setBackground(digit_background_color);
        sevenbutton.setBackground(digit_background_color);
        eightbutton.setBackground(digit_background_color);
        ninebutton.setBackground(digit_background_color);
        zerobutton.setBackground(digit_background_color);

        //operator Background
        plusbutton.setBackground(operator_background_color);
        minusbutton.setBackground(operator_background_color);
        mulbutton.setBackground(operator_background_color);
        divbutton.setBackground(operator_background_color);
        dotbutton.setBackground(operator_background_color);
        percentbutton.setBackground(operator_background_color);
        powerbutton.setBackground(operator_background_color);
        logbutton.setBackground(operator_background_color);
        sinbutton.setBackground(operator_background_color);
        cosbutton.setBackground(operator_background_color);

        //Special button background
        backbutton.setBackground(backbutton_background_color);
        clearbutton.setBackground(clearbutton_background_color);
        equalbutton.setBackground(equalbutton_background_color);

        //digit foreground
        onebutton.setForeground(digit_foreground_color);
        twobutton.setForeground(digit_foreground_color);
        threebutton.setForeground(digit_foreground_color);
        fourbutton.setForeground(digit_foreground_color);
        fivebutton.setForeground(digit_foreground_color);
        sixbutton.setForeground(digit_foreground_color);
        sevenbutton.setForeground(digit_foreground_color);
        eightbutton.setForeground(digit_foreground_color);
        ninebutton.setForeground(digit_foreground_color);
        zerobutton.setForeground(digit_foreground_color);

        //operator foreground
        plusbutton.setForeground(operator_foreground_color);
        minusbutton.setForeground(operator_foreground_color);
        mulbutton.setForeground(operator_foreground_color);
        divbutton.setForeground(operator_foreground_color);
        dotbutton.setForeground(operator_foreground_color);
        percentbutton.setForeground(operator_foreground_color);
        powerbutton.setForeground(operator_foreground_color);
        logbutton.setForeground(operator_foreground_color);
        sinbutton.setForeground(operator_foreground_color);
        cosbutton.setForeground(operator_foreground_color);


        //special button foreground
        clearbutton.setForeground(special_foreground_color);
        backbutton.setForeground(special_foreground_color);
        equalbutton.setForeground(special_foreground_color);

        frame.revalidate();
    }


}

