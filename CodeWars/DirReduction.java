public class DirReduction {

    public static void main(String args[]) {
        String re[] = dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" });
        for(String a : re) {
            System.out.println(a);
        }
    }

    public static String[] dirReduc(String arr[]) {
        int length = arr.length;
        int right = 0;
        for(;;) {
            for(int i=0; i<arr.length - 1; i++) {
                String fir = arr[i];
                String sec = arr[i + 1];
                if(isWrong(getDir(fir), getDir(sec))) {
                    arr[i] = "";
                    arr[i + 1] = "";
                }
            }
            arr = clone(arr);
            right = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                String fir = arr[i];
                String sec = arr[i + 1];
                if(isWrong(getDir(fir), getDir(sec))) right ++;
            }
            if(right == 0) break;
        }
        return arr;
    }

    public static String[] clone(String arr[]) {//this method will return a new array contains all non-empty elements.
        int empty_count = 0;
        for(String s : arr) {
            if(s.equals("")) empty_count ++;
        }
        String re[] = new String[arr.length - empty_count];
        int index = 0;
        for(String s : arr) {
            if(!s.equals("")) {
                re[index] = s;
                index++;
            }
        }
        return re;
    }

    public static boolean isWrong(DIR fir, DIR sec) {
        return (fir == DIR.NORTH && sec == DIR.SOUTH) || (fir == DIR.SOUTH && sec == DIR.NORTH) || (fir == DIR.WEST && sec == DIR.EAST) || (fir == DIR.EAST && sec == DIR.WEST);
    }

    public static DIR getDir(String dir) {
        switch(dir) {
            case "NORTH" :
                return DIR.NORTH;
            case "SOUTH" :
                return DIR.SOUTH;
            case "WEST" :
                return DIR.WEST;
            case "EAST" :
                return DIR.EAST;
            default :
                return DIR.STAND;
        }
    }

    private enum DIR {
        NORTH,
        SOUTH,
        WEST,
        EAST,
        STAND
    }

}
