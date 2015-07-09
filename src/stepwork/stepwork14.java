 public static void main(String args[]) {
        int w = 8, h = 8;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (x == y || x == 0 && y < h/2 || y == 0 && x < w/2 || x == w-1 && y > h/2) {
                    
                    System.out.print("#");
                } else {
                    System.out.print(".");
                   
                    
                }  

            }
            System.out.println();

        }
    }
