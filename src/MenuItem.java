/**
 * Created by User on 2016/11/17.
 */
public class MenuItem extends Menu {
    String name;
    String url;
    String Style;

    public MenuItem(String style,String name, String url) {
        this.name = name;
        this.url = url;
        Style = style;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getStyle() {
        return Style;
    }

    @Override
    public void print() {
        System.out.println(getStyle()+"："+getName());
        System.out.println("链接:"+getUrl());
        System.out.println("-----------------------------------------------------");
    }
}
