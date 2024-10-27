public class TileProb {
    public static int Tile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int hori = Tile(n-m, m);

        int ver = Tile(n-1, m);

        return hori+ver;
    }

    public static void main(String args[]){
        System.out.println(Tile(4, 2));
    }
}
