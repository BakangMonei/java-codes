package Calculator;


import java.awt.*;
import java.awt.event.*;

// My calculator
public class MyCalculator extends Frame
{

    public boolean setClear=true;
    double number, memValue;
    char op;

    String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };
    String operatorButtonText[] = {"/", "sqrt", "*", "%", "-", "1/X", "+", "=" };
    String memoryButtonText[] = {"MC", "MR", "MS", "M+" };
    String specialButtonText[] = {"Backspc", "C", "CE" };

    MyDigitButton digitButton[]=new MyDigitButton[digitButtonText.length];
    MyOperatorButton operatorButton[]=new MyOperatorButton[operatorButtonText.length];
    MyMemoryButton memoryButton[]=new MyMemoryButton[memoryButtonText.length];
    MySpecialButton specialButton[]=new MySpecialButton[specialButtonText.length];

    Label displayLabel=new Label("0",Label.RIGHT);
    Label memLabel=new Label(" ",Label.RIGHT);

    final int FRAME_WIDTH=325,FRAME_HEIGHT=325;
    final int HEIGHT=30, WIDTH=30, H_SPACE=10,V_SPACE=10;
    final int TOPX=30, TOPY=50;

    // Setters

    public void setSetClear(boolean setClear) {
        this.setClear = setClear;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void setMemValue(double memValue) {
        this.memValue = memValue;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public void setDigitButtonText(String[] digitButtonText) {
        this.digitButtonText = digitButtonText;
    }

    public void setOperatorButtonText(String[] operatorButtonText) {
        this.operatorButtonText = operatorButtonText;
    }

    public void setMemoryButtonText(String[] memoryButtonText) {
        this.memoryButtonText = memoryButtonText;
    }

    public void setSpecialButtonText(String[] specialButtonText) {
        this.specialButtonText = specialButtonText;
    }

    public void setDigitButton(MyDigitButton[] digitButton) {
        this.digitButton = digitButton;
    }

    public void setOperatorButton(MyOperatorButton[] operatorButton) {
        this.operatorButton = operatorButton;
    }

    public void setMemoryButton(MyMemoryButton[] memoryButton) {
        this.memoryButton = memoryButton;
    }

    public void setSpecialButton(MySpecialButton[] specialButton) {
        this.specialButton = specialButton;
    }

    public void setDisplayLabel(Label displayLabel) {
        this.displayLabel = displayLabel;
    }

    public void setMemLabel(Label memLabel) {
        this.memLabel = memLabel;
    }


    // Getters

    public boolean isSetClear() {
        return setClear;
    }

    public double getNumber() {
        return number;
    }

    public double getMemValue() {
        return memValue;
    }

    public char getOp() {
        return op;
    }

    public String[] getDigitButtonText() {
        return digitButtonText;
    }

    public String[] getOperatorButtonText() {
        return operatorButtonText;
    }

    public String[] getMemoryButtonText() {
        return memoryButtonText;
    }

    public String[] getSpecialButtonText() {
        return specialButtonText;
    }

    public MyDigitButton[] getDigitButton() {
        return digitButton;
    }

    public MyOperatorButton[] getOperatorButton() {
        return operatorButton;
    }

    public MyMemoryButton[] getMemoryButton() {
        return memoryButton;
    }

    public MySpecialButton[] getSpecialButton() {
        return specialButton;
    }

    public Label getDisplayLabel() {
        return displayLabel;
    }

    public Label getMemLabel() {
        return memLabel;
    }

    public int getFRAME_WIDTH() {
        return FRAME_WIDTH;
    }

    public int getFRAME_HEIGHT() {
        return FRAME_HEIGHT;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getH_SPACE() {
        return H_SPACE;
    }

    public int getV_SPACE() {
        return V_SPACE;
    }

    public int getTOPX() {
        return TOPX;
    }

    public int getTOPY() {
        return TOPY;
    }

    MyCalculator(String frameText)
    //constructor
    {
        super(frameText);

        int tempX=TOPX, y=TOPY;
        displayLabel.setBounds(tempX,y,240,HEIGHT);
        displayLabel.setBackground(Color.BLUE);
        displayLabel.setForeground(Color.WHITE);
        add(displayLabel);

        memLabel.setBounds(TOPX,  TOPY+HEIGHT+ V_SPACE,WIDTH, HEIGHT);
        add(memLabel);


    // Setting Co-ordinates for Memory Buttons
        tempX=TOPX;
        y=TOPY+2*(HEIGHT+V_SPACE);
        for(int i=0; i<memoryButton.length; i++)
        {
            memoryButton[i]=new MyMemoryButton(tempX,y,WIDTH,HEIGHT,memoryButtonText[i], this);
            memoryButton[i].setForeground(Color.RED);
            y+=HEIGHT+V_SPACE;
        }

    // Setting Co-ordinates for Special Buttons
        tempX=TOPX+1*(WIDTH+H_SPACE); y=TOPY+1*(HEIGHT+V_SPACE);
        for(int i=0;i<specialButton.length;i++)
        {
            specialButton[i]=new MySpecialButton(tempX,y,WIDTH*2,HEIGHT,specialButtonText[i], this);
            specialButton[i].setForeground(Color.RED);
            tempX=tempX+2*WIDTH+H_SPACE;
        }

    // Setting Co-ordinates for Digit Buttons
        int digitX=TOPX+WIDTH+H_SPACE;
        int digitY=TOPY+2*(HEIGHT+V_SPACE);
        tempX=digitX;  y=digitY;
        for(int i=0;i<digitButton.length;i++)
        {
            digitButton[i]=new MyDigitButton(tempX,y,WIDTH,HEIGHT,digitButtonText[i], this);
            digitButton[i].setForeground(Color.BLUE);
            tempX+=WIDTH+H_SPACE;
            if((i+1)%3==0){tempX=digitX; y+=HEIGHT+V_SPACE;}
        }

    // Setting Co-ordinates for Operator Buttons
        int opsX=digitX+2*(WIDTH+H_SPACE)+H_SPACE;
        int opsY=digitY;
        tempX=opsX;  y=opsY;
        for(int i=0;i<operatorButton.length;i++)
        {
            tempX+=WIDTH+H_SPACE;
            operatorButton[i]=new MyOperatorButton(tempX,y,WIDTH,HEIGHT,operatorButtonText[i], this);
            operatorButton[i].setForeground(Color.RED);
            if((i+1)%2==0){tempX=opsX; y+=HEIGHT+V_SPACE;}
        }

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ev)
            {System.exit(0);}
        });

        setLayout(null);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);
    }

    static String getFormattedText(double temp)
    {
        String resText=""+temp;
        if(resText.lastIndexOf(".0")>0)
            resText=resText.substring(0,resText.length()-2);
        return resText;
    }

    public static void main(String []args)
    {
        new MyCalculator("Calculator - JavaTpoint");
    }
}

// My digit button
class MyDigitButton extends Button implements ActionListener
{
    MyCalculator cl;

    MyDigitButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }

    static boolean isInString(String s, char ch)
    {
        for(int i=0; i<s.length();i++) if(s.charAt(i)==ch) return true;
        return false;
    }

    public void actionPerformed(ActionEvent ev)
    {
        String tempText=((MyDigitButton)ev.getSource()).getLabel();

        if(tempText.equals("."))
        {
            if(cl.setClear)
            {cl.displayLabel.setText("0.");cl.setClear=false;}
            else if(!isInString(cl.displayLabel.getText(),'.'))
                cl.displayLabel.setText(cl.displayLabel.getText()+".");
            return;
        }

        int index=0;
        try{
            index=Integer.parseInt(tempText);
        }catch(NumberFormatException e){return;}

        if (index==0 && cl.displayLabel.getText().equals("0")) return;

        if(cl.setClear)
        {cl.displayLabel.setText(""+index);cl.setClear=false;}
        else
            cl.displayLabel.setText(cl.displayLabel.getText()+index);
    }       // actionPerformed
}


// My operator button
class MyOperatorButton extends Button implements ActionListener
{
    MyCalculator cl;

    MyOperatorButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev)
    {
        String opText=((MyOperatorButton)ev.getSource()).getLabel();

        cl.setClear=true;
        double temp=Double.parseDouble(cl.displayLabel.getText());

        if(opText.equals("1/x"))
        {
            try
            {double tempd=1/(double)temp;
                cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
            catch(ArithmeticException excp)
            {cl.displayLabel.setText("Divide by 0.");}
            return;
        }
        if(opText.equals("sqrt"))
        {
            try
            {double tempd=Math.sqrt(temp);
                cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
            catch(ArithmeticException excp)
            {cl.displayLabel.setText("Divide by 0.");}
            return;
        }
        if(!opText.equals("="))
        {
            cl.number=temp;
            cl.op=opText.charAt(0);
            return;
        }
    // Process = button pressed
        switch(cl.op)
        {
            case '+':
                temp+=cl.number;break;
            case '-':
                temp=cl.number-temp;break;
            case '*':
                temp*=cl.number;break;
            case '%':
                try{temp=cl.number%temp;}
                catch(ArithmeticException excp)
                {cl.displayLabel.setText("Divide by 0."); return;}
                break;
            case '/':
                try{temp=cl.number/temp;}
                catch(ArithmeticException excp)
                {cl.displayLabel.setText("Divide by 0."); return;}
                break;
        }//switch

        cl.displayLabel.setText(MyCalculator.getFormattedText(temp));

    }
}


//My Memory Button
class MyMemoryButton extends Button implements ActionListener
{
    MyCalculator cl;
    MyMemoryButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev)
    {
        char memop=((MyMemoryButton)ev.getSource()).getLabel().charAt(1);

        cl.setClear=true;
        double temp=Double.parseDouble(cl.displayLabel.getText());

        switch(memop)
        {
            case 'C':
                cl.memLabel.setText(" ");cl.memValue=0.0;break;
            case 'R':
                cl.displayLabel.setText(MyCalculator.getFormattedText(cl.memValue));break;
            case 'S':
                cl.memValue=0.0;
            case '+':
                cl.memValue+=Double.parseDouble(cl.displayLabel.getText());
                if(cl.displayLabel.getText().equals("0") || cl.displayLabel.getText().equals("0.0")  )
                    cl.memLabel.setText(" ");
                else
                    cl.memLabel.setText("M");
                break;
        }//switch
    }
}


// My Special Button
class MySpecialButton extends Button implements ActionListener
{
    MyCalculator cl;

    MySpecialButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }

   static String backSpace(String s)
    {
        String Res="";
        for(int i=0; i<s.length()-1; i++) Res+=s.charAt(i);
        return Res;
    }

  public void actionPerformed(ActionEvent ev)
    {
        String opText=((MySpecialButton)ev.getSource()).getLabel();

        // Checking for the Backspace Button
        if(opText.equals("Backspc"))
        {
            String tempText=backSpace(cl.displayLabel.getText());
            if(tempText.equals(""))
                cl.displayLabel.setText("0");
            else
                cl.displayLabel.setText(tempText);
            return;
        }
        // Checking for the "C" button i.e. Reset
        if(opText.equals("C"))
        {
            cl.number=0.0; cl.op=' '; cl.memValue=0.0;
            cl.memLabel.setText(" ");
        }

        // It must be CE button pressed
        cl.displayLabel.setText("0");cl.setClear=true;
    }
}
