package execution;

import java.lang.reflect.Method;

import Action_Keywords.php_login;
import utilities.entry;

public class php {

		php_login actions;
		Method[] methods;
		String data;
		static	String value;
		
		public void get_keywords() {
			actions= new php_login();
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
			entry data = new entry();
			data.file();
			php engine = new php();
			engine.get_keywords();
			for(int row=1;row<=10;row++) {
				value = data.cell(row, 1);
				engine.execute();
			}
			
		}
		
}
