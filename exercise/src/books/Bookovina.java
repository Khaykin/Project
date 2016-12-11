package books;

import java.util.Arrays;
//import java.util.List;

public class Bookovina {
	
	
	private String name;
	private String[] arrAuthor = new String[5];
	private int price;
	public Bookovina() {
		this.name = "Test";
		this.price = 10;
		}
	public String getName(){
		return name;
		}
	public int getPrice(){
		return price;
		}
	public String[] getArr() {
		return arrAuthor;
		}
	public void setArr(String[] arr) {
		this.arrAuthor = arr;
		}
	public void setName(String name) {
		this.name = name;
		}
	public void setPrice(int price) {
		this.price = price;
		}
	public String addAuthor(String name1, String name2, String name3, String name4, String name5){
		return null;
		}
	@Override
	
	public String toString() {
		return "Bookovina [getName()=" + getName() + ", getPrice()=" + getPrice() +", getArr()=" + Arrays.toString(getArr())+ "]";
		}
}


