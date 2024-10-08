package Stack_3;
//Bağlı listelerle stack yüklük örneği
public class Main {
    public static void main(String[] args) {
        Closet closet = new Closet(5);
        closet.push("kırmızı");
        closet.push("mavi");
        closet.push("sarı");
        closet.push("yeşil");
        closet.push("turuncu");
        closet.push("mor");
        closet.push("beyaz");
        closet.push("siyah");
        closet.show();
        closet.pop();
        closet.pop();
        closet.pop();
        closet.pop();
        closet.pop();
        closet.pop();
        closet.pop();
        closet.pop();
        closet.show();
        closet.push("turkuaz");
        closet.push("kahverengi");
        closet.push("kahverengi");
        closet.pop();
        closet.show();
    }
}
