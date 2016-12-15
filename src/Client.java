/**
 * Created by User on 2016/11/17.
 */
public class Client {
    Menu Allmenu;

    public Client(Menu allmenu) {
        Allmenu = allmenu;
    }

    public void printMenu(){
        Allmenu.print();
    }
}
