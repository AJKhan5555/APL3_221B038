public class Application
{
	public static void main(String[] args) {
		Mother m= new Mother ( );
        m.show(7,8); // show of Mother is called
        Child ch=new Child ( ); 
        ch. show (7,8); // show ( ) inherited in Child from Mother is called
	}
}