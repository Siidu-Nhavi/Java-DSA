
public class Book {
    public static void main(String args[]){
        book b1 = new book("java","siddu Nhavi",399);
        b1.setTitle("python");
        b1.getTitle();
        b1.setAuthor("king charls");
        b1.getAutor();
        b1.setPrice(-500);
        b1.getPrice();  
        

    }
}
class book{
    String title;
    String author;
    int price;
    
    public book(String t, String a, int p){
        title = t;
        author = a;
        price = p;
    }   
    public void setTitle(String t){
        this.title = t;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String a){
        this.author = a;
    }

    public String getAutor(){
        return author;
    }

    public void setPrice(int p){
        if(p < 0){
            this.price = 0;
        }
    }

    public int getPrice(){
        return price;
    }
}