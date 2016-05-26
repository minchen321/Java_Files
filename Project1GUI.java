import java.awt.Container;

import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;

public class Project1GUI {
	static JFrame myFrame;
	static Container cPane;
	static TextArea unsortedList, sortedList;
	
	public static void initialize(){
		
		unsortedList = new TextArea();
		sortedList = new TextArea();
		myFrame = new JFrame();
		myFrame.setSize(600,300);
		myFrame.setLocation(200,200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1,2));
		myFrame.setTitle("Word File");
		
		cPane = myFrame.getContentPane();
		cPane.add(unsortedList);
		cPane.add(sortedList);
		
		myFrame.setVisible(true);
	}

	public static void output(String[] WordArray, String textArea, int size){
		for(int i = 0; i < size; i++){
			if(textArea == "unsortedList")
				unsortedList.append(WordArray[i] + "\n");
			if(textArea == "sortedList")
				sortedList.append(WordArray[i] + "\n");
		}
	}
	

}