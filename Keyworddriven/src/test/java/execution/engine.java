package execution;

import java.lang.reflect.Method;

import Action_Keywords.Login_Page;
import utilities.TestData;

public class engine {
	Login_Page actions;
	Method[] methods;
	String data;
	static	String value;
	
	public void get_keywords() {
		actions= new Login_Page();
		methods=actions.getClass().getMethods();
	}
	public void execute() throws Exception {
		for(int i=0;i<methods.length;i++) {
if(methods[i].getName().equalsIgnoreCase(value)) {
	methods[i].invoke(actions);
}
		}
	}

	public static void main(String[] args) throws Exception {
		TestData data = new TestData();
		data.Excel();
		engine set = new engine();
		set.get_keywords();
		for(int row=1;row<=8;row++) {
			 value=data.value(row, 3);
	set.execute();
		}
	}
/*	if(keywords.equals("openbrowser")) {
				Login_Page.openbrowser();
			}else if (keywords.equals("url")) {
					Login_Page.url();
			}else if (keywords.equals("username"))	{
				Login_Page.username();
				}else if (keywords.equals("password")) {
					Login_Page.password();
			}else if (keywords.equals("login")) {
				Login_Page.login();
			}else if (keywords.equals("directory")) {
				Login_Page.directory();
			}else if (keywords.equals("title")) {
				Login_Page.title();
			}else if (keywords.equals("search")) {
				Login_Page.search();
			}*/
			
	
	}

	

