import java.io.*;
import java.util.*;
public class Author
{
private string name;
private string email;
private char f;
}
public  Author class Book
{
private string name;
private string authorname;
private double price;
private int qtylnstock;
Book()
{
name="ramayanam";
authorname="kambar";
price="500";
qtylnstock="1";
}
public string getName(){
return name;
}
public string getAuthorName(){
return authorname;
}
public double getPrice(){
return price;
}
public int getQtylnStock(){
return qtylnstock;
}
public void setPrice(double newPrice){
price=newPrice;
}
public void setQtylnStock(int newQtylnStock){
qtylnstock=newQtylnStock;
}
