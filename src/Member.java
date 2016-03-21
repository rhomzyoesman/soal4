
public class Member {
    private String nama;
    private String team;
    private String umur;
    private int nilai;
    
    public void setnama(String nm) {
        nama = nm;
    }
    public void setteam (String t) {
        team = t;
    }
    public void setumur (String u) {
        umur = u;
    }
    public void nilaipenampilan (int p) {
        int nilai1 = p;
        nilai += nilai1;
    }
    public void nilaiattitude (int q) {
        int nilai2 = q;
        nilai += nilai2;
    }
    public void nilaisuara (int r) {
        int nilai3 = r;
        nilai += nilai3;
}
    public String getnama() {
        return nama;
    }
    public String getteam(){
        return team;
    }
    public String getumur(){
        return umur;
    }
    public int getnilai () {
        return nilai/3;
    }
}