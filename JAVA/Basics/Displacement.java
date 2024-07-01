import java.security.PublicKey;

public class Displacement {

    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            //North
            if(dir == 'N'){
                y++;
            }
            //South
            else if (dir == 'S') {
                y--;
            }
            //East
            else if (dir =='E') {
                x++;
            }
            //West
            else if (dir == 'W') {
                x--;
            }
        }
        float ans=(float)Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0,2));
        return ans;
    }
    public static void main(String[] args) {

        String path="WEENESESENNN";
        System.out.println(getShortestPath(path));
    }
}
