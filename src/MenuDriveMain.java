/**
 * Created by User on 2016/11/17.
 */
public class MenuDriveMain {
    public static void main(String[] args){
        Menu allMenus=new SubMenu("菜单","主菜单");
        Menu Index=new SubMenu("子菜单","首页");
        Menu School_Profile =new SubMenu("子菜单","学校概况");
        Menu Professional_Settings =new SubMenu("子菜单","专业设置");
        Menu party_Work =new SubMenu("子菜单","党务工作");

        allMenus.add(Index);
        allMenus.add(School_Profile);
        allMenus.add(Professional_Settings);
        allMenus.add(party_Work);

        School_Profile.add(new MenuItem("菜单项","学校简介","http://www.zhbit.com/about/20110603/3996.html"));
        School_Profile.add(new MenuItem("菜单项","历史沿革","http://www.zhbit.com/about/20110603/3996.html#"));
        School_Profile.add(new MenuItem("菜单项","办学理念","http://www.zhbit.com/about/20110603/4022.html"));
        School_Profile.add(new MenuItem("菜单项","机构设置","http://www.zhbit.com/jgsz/jgsz.html"));
        School_Profile.add(new MenuItem("菜单项","现任领导","http://www.zhbit.com/leader/"));
        School_Profile.add(new MenuItem("菜单项","历任领导","http://www.zhbit.com/about/lr_leader.html"));
        School_Profile.add(new MenuItem("菜单项","校园地图","http://u.zhbit.com/map/"));

        Client client=new Client(allMenus);
        client.printMenu();
    }
}
