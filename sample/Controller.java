package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

public class Controller implements Initializable {

       @FXML
       ComboBox yearcb;//  年份组合框，可以get出当前选择的年份

       @FXML
       ComboBox monthcb;//月份组合框


       @FXML
       TextField tf1;

    @FXML
    TextField tf2;

    @FXML
    TextField tf3;

    @FXML
    TextField tf4;

    @FXML
    TextField tf5;

    @FXML
    TextField tf6;

    @FXML
    TextField tf7;

    @FXML
    TextField tf8;

    @FXML
    TextField tf9;

    @FXML
    TextField tf10;

    @FXML
    TextField tf11;

    @FXML
    TextField tf12;

    @FXML
    TextField tf13;

    @FXML
    TextField tf14;

    @FXML
    TextField tf15;

    @FXML
    TextField tf16;

    @FXML
    TextField tf17;

    @FXML
    TextField tf18;

    @FXML
    TextField tf19;

    @FXML
    TextField tf20;

    @FXML
    TextField tf21;

    @FXML
    TextField tf22;

    @FXML
    TextField tf23;

    @FXML
    TextField tf24;

    @FXML
    TextField tf25;

    @FXML
    TextField tf26;

    @FXML
    TextField tf27;

    @FXML
    TextField tf28;

    @FXML
    TextField tf29;

    @FXML
    TextField tf30;

    @FXML
    TextField tf31;

    @FXML
    TextField tf32;

    @FXML
    TextField tf33;

    @FXML
    TextField tf34;

    @FXML
    TextField tf35;

    @FXML
    TextField tf36;

    @FXML
    TextField tf37;

    @FXML
    TextField tf38;

    @FXML
    TextField tf39;

    @FXML
    TextField tf40;

    @FXML
    TextField tf41;

    @FXML
    TextField tf42;

 /*  @FXML
           TextField hour;
   @FXML
           TextField minutes;*/


    @FXML
    Label nyc;

    @FXML
    Label london;

    @FXML
    Label paris;

    @FXML
    Label toyoko;

    @FXML
    Label moscow;

@FXML
    AnchorPane pane;

//*****************************************************

    @FXML
    Button bt1;

    @FXML
    Button bt2;

    @FXML
    Button bt3;

    @FXML
    Button bt4;

    @FXML
    Button bt5;

    @FXML
    Button bt6;

    @FXML
    Button bt7;

    @FXML
    Button bt8;

    @FXML
    Button bt9;

    @FXML
    Button bt10;

    @FXML
    Button bt11;

    @FXML
    Button bt12;

    @FXML
    Button bt13;

    @FXML
    Button bt14;

    @FXML
    Button bt15;

    @FXML
    Button bt16;

    @FXML
    Button bt17;

    @FXML
    Button bt18;

    @FXML
    Button bt19;

    @FXML
    Button bt20;

    @FXML
    Button bt21;

    @FXML
    Button bt22;

    @FXML
    Button bt23;

    @FXML
    Button bt24;

    @FXML
    Button bt25;

    @FXML
    Button bt26;

    @FXML
    Button bt27;

    @FXML
    Button bt28;

    @FXML
    Button bt29;

    @FXML
    Button bt30;

    @FXML
    Button bt31;

    @FXML
    Button bt32;

    @FXML
    Button bt33;

    @FXML
    Button bt34;

    @FXML
    Button bt35;

    @FXML
    Button bt36;

    @FXML
    Button bt37;

    @FXML
    Button bt38;

    @FXML
    Button bt39;

    @FXML
    Button bt40;

    @FXML
    Button bt41;

    @FXML
    Button bt42;

    @FXML
    Label nyctime;

    @FXML
    Label londontime;

    @FXML
    Label toyokotime;

    @FXML
    Label paristime;

    @FXML
    Label moscowtime;

    @FXML
    Label beijingtime;
    
    @FXML
    TextArea reminderta;
    


   List<String> remind = new ArrayList<String>();
   int year[] = new int[202];
   int month[] = new int [13];
   int ChosenButton;
  @FXML
  public void demo()
  {
//	  System.out.println(ChosenButton);
      reminderta.setEditable(false);

      for (int i = 1 ; i < 13 ; i++)
      {
          month[i] = i;
      }

      for(int i = 0 ; i < year.length ; i++)
      {
          year[i] = 1900 + i;
      }
      ObservableList<String> yeararr = FXCollections.observableArrayList();
      ObservableList<String> montharr = FXCollections.observableArrayList();

      int j = 0;
      for(j = 0 ; j < year.length ; j++)
      {
          yeararr.add(year[j] + "");
      }
      for(j = 1 ; j < month.length ; j++)
      {
          montharr.add(month[j] + "");
      }
      yearcb.setItems(yeararr);
      monthcb.setItems(montharr);


     //Calendar calendar = new GregorianCalendar();

    nyc.setText("纽约时间");
    london.setText("伦敦时间");
    toyoko.setText("东京时间");
    paris.setText("巴黎时间");
    moscow.setText("莫斯科时间");
    Calendar nyct =  Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
      Calendar londont =  Calendar.getInstance(TimeZone.getTimeZone("GMT+1:00"));
      Calendar toyokot =  Calendar.getInstance(TimeZone.getTimeZone("GMT+9:00"));
      Calendar parist =  Calendar.getInstance(TimeZone.getTimeZone("GMT+2:00"));
      Calendar moscowt =  Calendar.getInstance(TimeZone.getTimeZone("GMT+3:00"));
      Calendar beijingt =  Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));


      nyctime.setText(nyct.get(Calendar.MONTH ) + 1 + " 月 "+ nyct.get( Calendar.DAY_OF_MONTH) + " 日 " + nyct.get(Calendar.HOUR_OF_DAY) + " 时 " + nyct.get(Calendar.MINUTE) +  " 分");
      londontime.setText(londont.get(Calendar.MONTH ) + 1 + " 月 "+ londont.get( Calendar.DAY_OF_MONTH) + " 日 " + londont.get(Calendar.HOUR_OF_DAY) + " 时 " + londont.get(Calendar.MINUTE) +  " 分");
      toyokotime.setText(toyokot.get(Calendar.MONTH ) + 1 + " 月 "+ toyokot.get( Calendar.DAY_OF_MONTH) + " 日 " + toyokot.get(Calendar.HOUR_OF_DAY) + " 时 " + toyokot.get(Calendar.MINUTE) +  " 分");
      paristime.setText(parist.get(Calendar.MONTH ) + 1 + " 月 "+ parist.get( Calendar.DAY_OF_MONTH) + " 日 " + parist.get(Calendar.HOUR_OF_DAY) + " 时 " + parist.get(Calendar.MINUTE) +  " 分");
      moscowtime.setText(moscowt.get(Calendar.MONTH ) + 1 + " 月 "+ moscowt.get( Calendar.DAY_OF_MONTH) + " 日 " + moscowt.get(Calendar.HOUR_OF_DAY) + " 时 " + moscowt.get(Calendar.MINUTE) +  " 分");
     beijingtime.setText(beijingt.get(Calendar.YEAR ) + " 年 "+ (beijingt.get(Calendar.MONTH ) + 1) + " 月 "+ beijingt.get( Calendar.DAY_OF_MONTH) + " 日 " + beijingt.get(Calendar.HOUR_OF_DAY) + " 时 " + beijingt.get(Calendar.MINUTE) +  " 分");
  }


@FXML
public void Calculate()
{

    TextField blank = new TextField();
    TextField tf[] = {blank,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27,tf28,tf29,tf30,tf31, tf32 ,tf33 , tf34 , tf35, tf36 , tf37,tf38,tf39 ,tf40,tf41,tf42};
    for(int j = 1 ; j < tf.length ; j++)
    {
        tf[j].clear();
    }

    for(int j = 1 ; j < tf.length ; j++)
    {
        tf[j].setEditable(false);
    }
    int year , month , day  = 1 , week;
    year = Integer.parseInt(yearcb.getValue().toString());
    month = Integer.parseInt(monthcb.getValue().toString());

    //****************************************************************
    GregorianCalendar gre=new GregorianCalendar();
    Date date=new Date(year-1900,month-1,day); //年要减去1900，月份是0-11
//            System.out.println(date);

    gre.setTime(date);
    int weekday=gre.get(Calendar.DAY_OF_WEEK)-1; //0是星期天
    if(weekday == 0)
        weekday = 7;
    //String []s={"星期天","星期一","星期二","星期三","星期四","星期五","星期六",};
    //System.out.println(year+" "+month+" "+day+" "+s[weekday]);  }
    //******************************************************************************


    int Month[] = {0 ,31 , 28 , 31 , 30 , 31 , 30 , 31 , 31  , 30 , 31 , 30 ,31};
    if((year%4 == 0 && year%100 != 0) || year %400 == 0)
    {
        Month[3] = 29;
    }
    int i;
    int count = weekday;
    for(i = 1 ; i <= Month[month] ; i++)
    {
        tf[count].setText(i + "");
        count++;
    }

}

@FXML
public void loadreminder() throws  Exception
{
	TextField blank = new TextField();
	TextField tf[] = {blank,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27,tf28,tf29,tf30,tf31, tf32 ,tf33 , tf34 , tf35, tf36 , tf37,tf38,tf39 ,tf40,tf41,tf42};
	SimpleDateFormat chineseDateFormat = new SimpleDateFormat("yyyy年MM月dd日");  
	Calendar today = Calendar.getInstance();  
	int year = today.get(Calendar.YEAR) ;
	int month = today.get(Calendar.MONTH) ;
	year = Integer.parseInt(yearcb.getValue().toString());
    month = Integer.parseInt(monthcb.getValue().toString()) ;
	String day = tf[ChosenButton].getText() ;
	String nowtime = year + "年" + month + "月" + day + "日";
	today.setTime(chineseDateFormat.parse(nowtime));  
	ChosenDay chosen = new ChosenDay();
	Lunar lunar = new Lunar(today); 
	String display = "    公历" + chineseDateFormat.format(today.getTime()) + "　农历" + lunar;
//	System.out.println(display);
	chosen.setDay(display);
    Parent root = FXMLLoader.load(getClass().getResource("/reminder.fxml"));
    Stage stage = new Stage();
    stage.setTitle("备忘录");
    stage.setScene(new Scene(root));
    stage.show();
}

@FXML
public void ld1() throws Exception 
{
    ChosenButton = 1;
    loadreminder();
}
@FXML
public void ld2() throws Exception 
{
    ChosenButton = 2;
    loadreminder();
}
@FXML
public void ld3() throws Exception 
{
    ChosenButton = 3;
    loadreminder();
}
@FXML
public void ld4() throws Exception 
{
    ChosenButton = 4;
    loadreminder();
}
@FXML
public void ld5() throws Exception 
{
    ChosenButton = 5;
    loadreminder();
}
@FXML
public void ld6() throws Exception 
{
    ChosenButton = 6;
    loadreminder();
}
@FXML
public void ld7() throws Exception 
{
    ChosenButton = 7;
    loadreminder();
}
@FXML
public void ld8() throws Exception 
{
    ChosenButton = 8;
    loadreminder();
}
@FXML
public void ld9() throws Exception 
{
    ChosenButton = 9;
    loadreminder();
}
@FXML
public void ld10() throws Exception 
{
    ChosenButton = 10;
    loadreminder();
}
@FXML
public void ld11() throws Exception 
{
    ChosenButton = 11;
    loadreminder();
}
@FXML
public void ld12() throws Exception 
{
    ChosenButton = 12;
    loadreminder();
}
@FXML
public void ld13() throws Exception 
{
    ChosenButton = 13;
    loadreminder();
}
@FXML
public void ld14() throws Exception 
{
    ChosenButton = 14;
    loadreminder();
}
@FXML
public void ld15() throws Exception 
{
    ChosenButton = 15;
    loadreminder();
}
@FXML
public void ld16() throws Exception 
{
    ChosenButton = 16;
    loadreminder();
}
@FXML
public void ld17() throws Exception 
{
    ChosenButton = 17;
    loadreminder();
}
@FXML
public void ld18() throws Exception 
{
    ChosenButton = 18;
    loadreminder();
}
@FXML
public void ld19() throws Exception 
{
    ChosenButton = 19;
    loadreminder();
}
@FXML
public void ld20() throws Exception 
{
    ChosenButton = 20;
    loadreminder();
}
@FXML
public void ld21() throws Exception 
{
    ChosenButton = 21;
    loadreminder();
}
@FXML
public void ld22() throws Exception 
{
    ChosenButton = 22;
    loadreminder();
}
@FXML
public void ld23() throws Exception 
{
    ChosenButton = 23;
    loadreminder();
}
@FXML
public void ld24() throws Exception 
{
    ChosenButton = 24;
    loadreminder();
}
@FXML
public void ld25() throws Exception 
{
    ChosenButton = 25;
    loadreminder();
}
@FXML
public void ld26() throws Exception 
{
    ChosenButton = 26;
    loadreminder();
}
@FXML
public void ld27() throws Exception 
{
    ChosenButton = 27;
    loadreminder();
}
@FXML
public void ld28() throws Exception 
{
    ChosenButton = 28;
    loadreminder();
}
@FXML
public void ld29() throws Exception 
{
    ChosenButton = 29;
    loadreminder();
}
@FXML
public void ld30() throws Exception 
{
    ChosenButton = 30;
    loadreminder();
}
@FXML
public void ld31() throws Exception 
{
    ChosenButton = 31;
    loadreminder();
}
@FXML
public void ld32() throws Exception 
{
    ChosenButton = 32;
    loadreminder();
}
@FXML
public void ld33() throws Exception 
{
    ChosenButton = 33;
    loadreminder();
}
@FXML
public void ld34() throws Exception 
{
    ChosenButton = 34;
    loadreminder();
}
@FXML
public void ld35() throws Exception 
{
    ChosenButton = 35;
    loadreminder();
}
@FXML
public void ld36() throws Exception 
{
    ChosenButton = 36;
    loadreminder();
}
@FXML
public void ld37() throws Exception 
{
    ChosenButton = 37;
    loadreminder();
}

public void Check() {	//查询当前日期有没有提醒
	
	//从文件中读取 如果有则显示提醒并删除
}

public void addremind(String A) {
	remind.add(A);
	for(int i=0; i<remind.size(); ++i) {
		System.out.println(remind.get(i));
	}
}

public void Alarm() {	//闹钟初始化，如果有按下闹钟按钮则提醒
	
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	Check();
    	Alarm();
    }
}
