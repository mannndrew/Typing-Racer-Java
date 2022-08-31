import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class JTextFieldLimit extends PlainDocument {
	
	private static final long serialVersionUID = 1L;
	
	int limit;

    public JTextFieldLimit(int limit) {
    super();
    this.limit = limit;
    }

    public void insertString( int offset, String  str, AttributeSet attr) {
	    if (str == null) return;
	
	    if ((getLength() + str.length()) <= limit) {
	    	try {
			    super.insertString(offset, str, attr);
			} 
	      
	    	catch (BadLocationException e) {
			    e.printStackTrace();
			}
	    }
	}
}