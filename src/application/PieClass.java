package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PieClass {
	
	private final SimpleStringProperty divNum;
	private final SimpleStringProperty divName;
	private final SimpleIntegerProperty percentage;
	
	
	public PieClass(String divNum, String divName, Integer percentage) {
		super();
		this.divNum = new SimpleStringProperty (divNum);
		this.divName = new SimpleStringProperty (divName);
		this.percentage =new SimpleIntegerProperty (percentage);
	}
	
	
	public String getDivNum() {
		return divNum.get();
	}
	
	public void setDivNum(String divNum1)
	{
		divNum.set(divNum1);
	}
	
	
	public String getDivName() {
		return divName.get();
	}
	public void setDivName(String divName1)
	{
		divName.set(divName1);
	}
	
	
	public Integer getPercentage() {
		return percentage.get();
	}
	
	public void setPercentage(Integer percentage1)
	{
		percentage.set(percentage1);
	}

}
