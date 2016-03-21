import java.util.ArrayList;
public class MainMember {
    public static ArrayList <Member> memb = new ArrayList<>();
    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();
        
        m1.setnama("RIjal");
        m1.setteam("Hello Kitty");
        m1.setumur("20");
        m1.nilaipenampilan(70);
        m1.nilaisuara(80);
        m1.nilaiattitude(80);
        
        m2.setnama("Efriza");
        m2.setteam("Hello Kitty");
        m2.setumur("18");
        m2.nilaipenampilan(70);
        m2.nilaisuara(20);
        m2.nilaiattitude(80);
        
        m3.setnama("Jerry");
        m3.setteam("JKT");
        m3.setumur("25");
        m3.nilaipenampilan(70);
        m3.nilaisuara(80);
        m3.nilaiattitude(60);
        
        memb.add(m1);
        memb.add(m2);
        memb.add(m3);
        tampil();
    }
    public static void tampil() {
        for (int i = 0; i < memb.size(); i++) {
            System.out.println("-------Daftar Member-------");
            System.out.println("Nama : " + memb.get(i).getnama());
            System.out.println("Team : " + memb.get(i).getteam());
            System.out.println("Umur : " + memb.get(i).getumur());
            System.out.println("Nilai : " + memb.get(i).getnilai());
            
            
        }
        
        
        
        
    }
    
}
