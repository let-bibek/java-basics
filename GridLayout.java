import java.awt.*;
class GridLayout extends Frame
{
	Label lbl_name, lbl_roll;
	TextField txt_name, txt_roll;
	Button btn_submit;
	public GridLayout()
	{
		lbl_name =new Label("NAme");
		lbl_roll=new Label("Roll");
		txt_name=new TextField(20);
		txt_roll=new TextField(20);
		setSize(600,300);
		
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		btn_submit=new Button("Submit");
		add(lbl_name);
		add(txt_name);
		add(lbl_roll);
		add(txt_roll);
		add(btn_submit);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new GridLayout();
	}
}