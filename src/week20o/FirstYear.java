package week20o;

public class FirstYear extends Student {
    private String favouriteSubject;

    public FirstYear(String name,int age){
        super(name, age);

    }
    public String getFavouriteSubject()
    {
        return favouriteSubject;
    }
    public void setFavouriteSubject(String favouriteSubject){
        this.favouriteSubject = favouriteSubject;
    }
    public void display(){
        super.display();
        System.out.println("Favourite sub value" +getFavouriteSubject());
    }
}
