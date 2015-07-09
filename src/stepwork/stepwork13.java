int w = 8, h = 8;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (x == 0 || y == 0 || x == w-1 || y == w-1) {
                    
                    System.out.print("#");
                } else {
                    System.out.print(".");
                   
                    
                }  

            }
            System.out.println();

        }
