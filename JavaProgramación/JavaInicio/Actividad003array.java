package JavaInicio;

public class Actividad003array {
    public static void main(String[] args) {
        int[][] tabla = {{1,1,1},{2,2,2},{3,3,3}};
        for (int i = 0; i < tabla.length; i++) {
            int res = 0;
            for (int j = 0; j < tabla.length; j++) {
                res += tabla[i][j];
            }
            System.out.println(res);

        }
    }
}
