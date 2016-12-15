import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by User on 2016/11/17.
 */
public class SubMenu extends Menu {
    ArrayList menuComponents=new ArrayList();
    String name;
    String style;

    public SubMenu(String style,String name) {
        this.style=style;
        this.name = name;
    }

    @Override
    public void add(Menu menu) {
        menuComponents.add(menu);
    }

    @Override
    public void remove(Menu menu) {
        menuComponents.remove(menu);
    }

    @Override
    public Menu getChild(int i) {
        return (Menu) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public void print() {
        System.out.println(getStyle()+"："+getName());
        Iterator iterator=menuComponents.iterator();
        System.out.println("-----------------------------------------------------");
        while (iterator.hasNext()){
            Menu menu= (Menu) iterator.next();
            menu.print();
        }
    }
}
