import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
    
    // Текстовое поле для вывода результата
    private JTextField resultField;
    
    public Calculator() {
        // Устанавливаем размер окна
        setSize(300, 300);
        
        // Добавляем заголовок окна
        setTitle("Калькулятор");
        
        // Создаем панель для размещения кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        
        // Создаем кнопки для цифр и арифметических операций
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton buttonPlus = new JButton("+");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMinus = new JButton("-");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonMultiply = new JButton("*");
        JButton buttonClear = new JButton("C");
        JButton button0 = new JButton("0");
        JButton buttonEquals = new JButton("=");
        JButton buttonDivide = new JButton("/");
        
        // Добавляем кнопки на панель
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonPlus);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonClear);
        buttonPanel.add(button0);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonDivide);
        
        // Создаем текстовое поле для вывода результата
        resultField = new JTextField();
        resultField.setHorizontalAlignment(JTextField.RIGHT);
        
        // Добавляем текстовое поле и панель с кнопками на окно
        setLayout(new BorderLayout());
        add(resultField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        
        // Устанавливаем операцию закрытия окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Делаем окно видимым
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
